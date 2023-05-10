package com.example.implementation;

import org.springframework.stereotype.Component;

import com.example.interfaces.Speakers;
import com.example.models.Song;

@Component
public class BoseSpeaker implements Speakers {
	public String makeSound(Song song){
        return "Playing the song "+ song.getTitle()+ " by "
                + song.getSingerName()+
                " with Bose speakers";
    }
}
