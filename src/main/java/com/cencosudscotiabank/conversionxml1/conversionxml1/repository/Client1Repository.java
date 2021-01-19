package com.cencosudscotiabank.conversionxml1.conversionxml1.repository;

import com.cencosudscotiabank.conversionxml1.conversionxml1.models.Client;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Client1Repository {

    public static final String CLIENT_KEY = "CLIENT";

    private HashOperations hashOperations;

    private RedisTemplate redisTemplate;

    public Client1Repository(RedisTemplate redisTemplate){
        this.redisTemplate = redisTemplate;
        this.hashOperations = this.redisTemplate.opsForHash();
    }

    public void save(Client client){
        hashOperations.put(client.getIdcom(), client.getIdtrx(), client);
    }

}
