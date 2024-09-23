package serjn.cloud.jazz;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class JazzController {

    private final SongService songService;

    @GetMapping("/getSongs")
    public List<JazzSong> jazz(@RequestParam int amount) {
        return songService.getRandomSongs(amount);
    }
}