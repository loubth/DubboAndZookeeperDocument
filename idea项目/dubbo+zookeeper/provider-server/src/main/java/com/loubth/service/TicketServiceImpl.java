package com.loubth.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service //将服务发布出去
@Component //放在容器中
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "拿到票了";
    }
}
