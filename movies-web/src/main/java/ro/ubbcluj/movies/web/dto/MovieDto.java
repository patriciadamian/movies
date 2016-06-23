package ro.ubbcluj.movies.web.dto;

import lombok.*;

/**
 * Created by Patri on 6/16/2016.
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto extends BaseDto {
    private String title;
//    private String genre;
//    private int price;
    private int diskNumber;
    private Long client_id;


}
