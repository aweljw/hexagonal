package com.hexagonal.adapter.in.web;

import com.hexagonal.adapter.in.web.request.CreateOrderRequest;
import com.hexagonal.application.port.in.CreateOrderUseCase;
import com.hexagonal.application.port.in.command.OrderCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1")
public class OrderController {

  private final CreateOrderUseCase createOrderUseCase;

  @PostMapping("/order")
  public void save (@RequestBody CreateOrderRequest request) {
    OrderCommand command = OrderCommand.createCommand()
        .name("jin")
        .mobile("01011112222")
        .build();

    createOrderUseCase.save(command);
  }
}
