package com.coursespring.model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class DocumentCSV implements Serializable {
    private static final long serialVersionUID = 3055790372721956176L;

    private String message;
    private String name;
    private Integer age;
    private String fileName;
    private String OriginalName;
}
