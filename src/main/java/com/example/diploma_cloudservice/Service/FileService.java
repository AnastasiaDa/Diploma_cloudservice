package com.example.diploma_cloudservice.Service;


import com.example.diploma_cloudservice.Entity.Files;
import com.example.diploma_cloudservice.Repo.FileRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Service
public class FileService {
    private final FileRepository fileRepository;

    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public void uploadFile() {
    }

    public void getFile() {
    }

    public void deleteFile() {
    }

    public void editFile() {
    }

    public void allFiles() {
    }
}
