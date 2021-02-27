package com.onyemowo.diary.services;

import com.onyemowo.diary.DTOS.EntryDTO;

import java.util.List;

public interface EntryService {
    public void newEntry(EntryDTO entryDTO);

    public EntryDTO findEntryByTitle(String title);

    public List<EntryDTO> getAllEntries();

    public void updateEntry(EntryDTO entryDTO);

    public void deleteEntryById(String id);

    public void deleteEntryByTitle(String title);
}
