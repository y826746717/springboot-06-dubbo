package com.yang.consumer.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yang.providerticket.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("消费者说： "+ticket);
    }
}
