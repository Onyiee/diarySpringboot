package com.onyemowo.diary.services;

import com.onyemowo.diary.DTOS.EntryDTO;

import java.util.List;

public interface EntryService {
     void newEntry(EntryDTO entryDTO);

    EntryDTO findEntryByTitle(String title);

     List<EntryDTO> getAllEntries();

    void updateEntry(EntryDTO entryDTO);

    void deleteEntryById(String id);

     void deleteEntryByTitle(String title);
}
