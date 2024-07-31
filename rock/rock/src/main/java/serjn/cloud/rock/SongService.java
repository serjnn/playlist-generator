package serjn.cloud.rock;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


@Service
public class SongService {
    public List<RockSong> getRandomSongs(int amount) {
        List<RockSong> list = new ArrayList<>();
        list.add(RockSong.builder()
                .author("rock_author")
                .durability(124)
                .name("rock_song")
                .year(2014).build());

        list.add(RockSong.builder()
                .author("rock_author2")
                .durability(124)
                .name("rock_song2")
                .year(2014).build());

        list.add(RockSong.builder()
                .author("rock_author3")
                .durability(124)
                .name("rock_song3")
                .year(2014).build());

        list.add(RockSong.builder()
                .author("rock_author4")
                .durability(124)
                .name("rock_song4")
                .year(2014).build());

        Collections.shuffle(list, new Random());

        return list.subList(0, Math.min(amount, list.size()));
    }
}
