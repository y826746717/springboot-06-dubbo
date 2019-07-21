package com.yang.providerticket.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yang.providerticket.service.TicketService;
import org.springframework.stereotype.Component;

//怎么把服务发布出去呢?
//使用@Service注解
@Component
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "哈哈哈，我买到票了";
    }
}
