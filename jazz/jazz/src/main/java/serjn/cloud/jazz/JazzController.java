package serjn.cloud.jazz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JazzController {

    @Autowired
    SongService songService;

    @GetMapping("/getsongs")
    public List<JazzSong> jazz(@RequestParam int amount) {
        return songService.getRandomSongs(amount);
    }
}