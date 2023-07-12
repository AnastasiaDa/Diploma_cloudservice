package com.example.diploma_cloudservice.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class FileResponse {
    @JsonProperty("fileName")
    private String fileName;

    @JsonProperty("size")
    private int size;
}
