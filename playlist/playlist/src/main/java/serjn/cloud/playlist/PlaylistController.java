package serjn.cloud.playlist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import serjn.cloud.playlist.model.Genre;
import serjn.cloud.playlist.model.Playlist;
import serjn.cloud.playlist.model.Song;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PlaylistController {

    @Autowired
    RestTemplate restTemplate;


    @PostMapping("/playlist")
    public Playlist getPlaylist(@RequestBody Map<String,Integer> req){
        List<Genre> genreList = req
                .entrySet()
                .stream()
                .map(this::getUrl)
                .map(url -> restTemplate.getForObject(url, Song[].class))
                .map(Arrays::asList)
                .map(Genre::new)
                .toList();


return Playlist.builder().title("playlist").genres(genreList).build();

    }

    private String getUrl(Map.Entry<String, Integer> entry) {

        return "http://"+entry.getKey()+"/getsongs?amount=" + entry.getValue();
    }
}
