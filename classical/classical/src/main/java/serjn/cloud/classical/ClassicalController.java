package serjn.cloud.classical;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RequestMapping("/api/v1")
@RestController
public class ClassicalController {


    private final SongService songService;

    @GetMapping("/getSongs")
    public List<ClassicalSong> classical(@RequestParam int amount) {
        return songService.getRandomSongs(amount);
    }
}
