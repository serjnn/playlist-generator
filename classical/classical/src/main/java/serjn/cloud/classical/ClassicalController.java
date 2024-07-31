package serjn.cloud.classical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassicalController {

    @Autowired
    SongService songService;

    @GetMapping("/getsongs")
    public List<ClassicalSong> classical(@RequestParam int amount) {
        return songService.getRandomSongs(amount);
    }
}
