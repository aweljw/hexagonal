package com.hexagonal.adapter.in.web;

import com.hexagonal.adapter.in.web.request.CreateOrderRequest;
import com.hexagonal.adapter.out.response.OrderResponse;
import com.hexagonal.application.port.in.OrderUseCase;
import com.hexagonal.application.port.in.command.OrderCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/order")
public class OrderController {

  private final OrderUseCase orderUseCase;

  @PostMapping("")
  public OrderResponse createOrder (@RequestBody CreateOrderRequest request) {
    //TODO 요청 모델 임의 데이터 설정
    request.setName("jin");
    request.setMobile("01011112222");

    OrderCommand command = OrderCommand.createCommand()
        .name(request.getName())
        .mobile(request.getMobile())
        .build();

    return orderUseCase.save(command);
  }

  @GetMapping("")
  public OrderResponse findOrder (@RequestParam long ordNo) {
    return orderUseCase.find(ordNo);
  }
}
