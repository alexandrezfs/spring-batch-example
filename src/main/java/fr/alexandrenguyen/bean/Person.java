package fr.alexandrenguyen.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by alenguye on 27/01/2017.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String lastName;
    private String firstName;
}
