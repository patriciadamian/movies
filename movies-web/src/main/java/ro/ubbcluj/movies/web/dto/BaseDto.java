package ro.ubbcluj.movies.web.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by Patri on 6/16/2016.
 */

@Getter
@Setter
@EqualsAndHashCode
@ToString
public abstract class BaseDto implements Serializable{
    private Long id;

}
