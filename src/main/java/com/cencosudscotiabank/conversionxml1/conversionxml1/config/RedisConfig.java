package com.cencosudscotiabank.conversionxml1.conversionxml1.config;

import com.cencosudscotiabank.conversionxml1.conversionxml1.models.Client;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableCaching
public class RedisConfig {

    @Bean
    public LettuceConnectionFactory redisConnectionFactory () {
        return new LettuceConnectionFactory(new RedisStandaloneConfiguration("127.0.0.1", 6379));
    }

    @Bean
    RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();

        redisTemplate.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());
        //redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setConnectionFactory(redisConnectionFactory());
        return redisTemplate;
    }


}
