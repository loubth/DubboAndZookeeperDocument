package com.loubth.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service //注入到容器中
public class UserService {
    //我们需要去拿去注册中心的服务
    @Reference  //远程引用指定的服务，他会按照全类名进行匹配，看谁给注册中心注册了这个全类名
    TicketService ticketService;

    public void bugTicket() {
        String ticket = ticketService.getTicket();
        System.out.println(ticket);
    }

}