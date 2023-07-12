package com.example.diploma_cloudservice.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "files")
@NoArgsConstructor
@AllArgsConstructor
public class Files {

    @Id
    @Column
    private String fileName;
    private byte[] fileContent;

}