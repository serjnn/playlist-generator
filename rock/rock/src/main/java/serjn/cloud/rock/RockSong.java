package serjn.cloud.rock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RockSong {
    private String name;
    private String author;
    private long year;
    private long durability;
}
