package serjn.cloud.jazz;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


@Service
public class SongService {
    public List<JazzSong> getRandomSongs(int amount) {
        List<JazzSong> list = new ArrayList<>();
        list.add(JazzSong.builder()
                .author("jazz_author")
                .durability(124)
                .name("jazz_song")
                .year(2014).build());

        list.add(JazzSong.builder()
                .author("jazz_author2")
                .durability(124)
                .name("jazz_song2")
                .year(2014).build());

        list.add(JazzSong.builder()
                .author("jazz_author3")
                .durability(124)
                .name("jazz_song3")
                .year(2014).build());

        list.add(JazzSong.builder()
                .author("jazz_author4")
                .durability(124)
                .name("jazz_song4")
                .year(2014).build());

        Collections.shuffle(list, new Random());

        return list.subList(0, Math.min(amount, list.size()));
    }
}

