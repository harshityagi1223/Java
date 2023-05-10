package com.example.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.interfaces.Tyres;

@Component
@Primary
public class MichilinTyres implements Tyres{
	public String rotate(){
        return "Vehicle moving with the help of Michelin tyres";
    }

    public String stop() {
        return "Vehicle stopped with the help of Michelin tyres";
    }
}
