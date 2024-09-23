package serjn.cloud.rock;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1")
@RequiredArgsConstructor
@RestController
public class RockController {


    private final SongService songService;

    @GetMapping("/getSongs")
    public List<RockSong> rock(@RequestParam int amount) {
        return songService.getRandomSongs(amount);
    }
}
