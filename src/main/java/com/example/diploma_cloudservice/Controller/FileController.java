package com.example.diploma_cloudservice.Controller;

import com.example.diploma_cloudservice.Entity.Files;
import com.example.diploma_cloudservice.Service.FileService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/file")
@AllArgsConstructor
@Validated
public class FileController {

    private final FileService fileService;

    @PostMapping
    public void uploadFile() {
//        придумать как загружать
    }

    @GetMapping()
    public void getFile() {
//        придумать метод получения файла
    }

    @DeleteMapping()
    public void deleteFile() {
//        придумать как удалять файл
    }

    @PutMapping
    public void editFile() {
//        придумать метод редактирования файла
    }

}
