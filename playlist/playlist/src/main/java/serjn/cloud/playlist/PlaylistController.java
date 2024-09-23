package serjn.cloud.playlist;


import lombok.RequiredArgsConstructor;
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
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PlaylistController {

    private final RestTemplate restTemplate;


    @PostMapping("/generatePlaylist")
    public Playlist generatePlaylist(@RequestBody Map<String, Integer> request) {
        List<Genre> genreList = request
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

        return "http://" + entry.getKey() + "/api/v1/getSongs?amount=" + entry.getValue();
    }
}
