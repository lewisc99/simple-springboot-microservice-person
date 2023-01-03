package com.lewis.address.consumer;


import com.lewis.address.models.Address;
import com.lewis.address.models.events.UserUpdatedEvent;
import com.lewis.address.services.AddressService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

import static com.lewis.address.config.rabbitmq.rabbitmqConstraints.USER_QUEUE_NAME;

@Component
public class UserEventConsumer {


    @Autowired
    private AddressService addressService;

    @RabbitListener(queues = USER_QUEUE_NAME)
    public void onUserUpdatedName(UserUpdatedEvent userUpdatedEvent)
    {
        Optional<Address> address = addressService.getAddressByUserId(userUpdatedEvent.getId());

        if (address.isEmpty())
        {
            throw new RuntimeException();
        }

        address.get().setUsername(userUpdatedEvent.getName());
        addressService.updateAddressUsername(address.get());
        System.out.println("User Updated in Address: " + userUpdatedEvent.getName() + " date: " + userUpdatedEvent.getDate());
    }

}
