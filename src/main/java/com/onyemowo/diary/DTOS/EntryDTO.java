package com.onyemowo.diary.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntryDTO {
    private String id;
    private String title;
    private String body;
    private LocalDate publishDate;
}
