package serjn.cloud.jazz;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JazzSong {
    private String name;
    private String author;
    private long year;
    private long durability;
}
