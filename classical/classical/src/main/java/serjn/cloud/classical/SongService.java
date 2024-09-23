package serjn.cloud.classical;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


@Service
public class SongService {
    public List<ClassicalSong> getRandomSongs(int amount) {
        List<ClassicalSong> list = new ArrayList<>();
        list.add(ClassicalSong.builder()
                .author("class_author")
                .durability(124)
                .name("class_song")
                .year(2014).build());

        list.add(ClassicalSong.builder()
                .author("class_author2")
                .durability(125)
                .name("class_song2")
                .year(2015).build());

        list.add(ClassicalSong.builder()
                .author("class_author3")
                .durability(126)
                .name("class_song3")
                .year(2016).build());

        list.add(ClassicalSong.builder()
                .author("class_author4")
                .durability(127)
                .name("class_song4")
                .year(2017).build());

        Collections.shuffle(list, new Random());

        return list.subList(0, Math.min(amount, list.size()));
    }
}
