package serjn.cloud.playlist.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import serjn.cloud.playlist.model.Genre;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Playlist {
    private String title;
    private List<Genre> genres;

}
