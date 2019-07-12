package com.xinhui.wdl.spring.session.controller;

import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

/**
 * @author dongliang.wang
 * @createTime 2019/7/10
 **/
@Component
public class CompletableFutureController {
    public static void main(String[] args) {
//        String str = CompletableFuture.supplyAsync(() -> "hello").thenApplyAsync(v -> v + "world").join();

        CompletableFuture.supplyAsync(() -> "hello").thenAccept(v -> System.out.println("consumer: " + v));

        //合并两个结果
        String res = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        }).thenCombine(CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "world";
        }), (s1, s2) -> s1 + " " + s2).join();

        //谁计算的快，就用那个CompletionStage的结果进行下一步的处理
        String first = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hi Boy";
        }).applyToEither(CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hi Girl";
        }), s -> s).join();

        //运行时出现了异常，可以通过exceptionally进行补偿
        String result = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (true) {
                throw new RuntimeException("exception test!");
            }
            return "Hi Boy";
        }).exceptionally(throwable -> {
            System.out.println(throwable.getMessage());
            return "Hello World";
        }).join();
        System.out.println(result);
    }
}
