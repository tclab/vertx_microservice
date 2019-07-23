package com.tclab.vertxMicroservice;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class RestApiVerticle extends AbstractVerticle {


  @Override
  public void start(Future<Void> fut) {
    vertx
        .createHttpServer()
        .requestHandler(request -> {
          request.response().end("<h1>Hello world Vert.x 3 application</h1>");
        })
        .listen(8080, result -> {
          if (result.succeeded()) {
            fut.complete();
          } else {
            fut.fail(result.cause());
          }
        });
  }




}
