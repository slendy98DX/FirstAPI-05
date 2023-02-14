package it.develhope.FirstAPI05.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class CarDTO {

    @NotBlank(message = "Mandatory")
    public String id;
    @NotBlank(message = "Mandatory")
    public String modelName;
    public Double price;
}
