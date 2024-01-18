package com.sky.utils;

import io.jsonwebtoken.Claims;

import java.util.HashMap;
import java.util.Map;

public class JWTMain {
    public static void main(String[] args) {
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("aaa",222);
        String jwt = JwtUtil.createJWT("itcast", 7200000, map);
        System.out.println(jwt);
        System.out.println("*********************");
        Claims parseJWT = JwtUtil.parseJWT("itcast", "eyJhbGciOiJIUzI1NiJ9.eyJhYWEiOjIyMiwiZXhwIjoxNzA0ODk5MjkzfQ.w-VSPBjOQjLRy2ARB_JGKQwe0_dRIgvX6Owprk2P71g");
        System.out.println(parseJWT);
    }
}
