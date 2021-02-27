package com.onyemowo.diary.services;

import com.onyemowo.diary.DTOS.EntryDTO;
import com.onyemowo.diary.models.Entry;
import com.onyemowo.diary.repositories.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class EntryServiceImpl implements EntryService {
    @Autowired
    private EntryRepository entryRepository;

    @Override
    public void newEntry(EntryDTO entryDTO) {
        Entry entry = new Entry();
        String given_title = entryDTO.getTitle();
        String given_body = entryDTO.getBody();
        entry.setTitle(given_title);
        entry.setBody(given_body);
        entry.setPublishDate(LocalDate.now());
        createNewEntry(entry);
    }

    private void createNewEntry(Entry entry) {
        entryRepository.save(entry);
    }


    @Override
    public EntryDTO findEntryByTitle(String title) {
        EntryDTO entryDTO = new EntryDTO();
        Entry entry = findAnEntryByTitle(title);
        String entry_title = entry.getTitle();
        String body = entry.getBody();
        LocalDate publishDate = entry.getPublishDate();
        String id = entry.getId();
        entryDTO.setTitle(entry_title);
        entryDTO.setBody(body);
        entryDTO.setPublishDate(publishDate);
        entryDTO.setId(id);
        return entryDTO;
    }

    private Entry findAnEntryByTitle(String title) {
        return entryRepository.findEntryByTitle(title);
    }

    @Override
    public List<EntryDTO> getAllEntries() {
        List<Entry> entries = getEntries();
        List<EntryDTO> entryDTOS = new ArrayList<>();
        for (Entry entry : entries) {
            String entry_title = entry.getTitle();
            String body = entry.getBody();
            LocalDate publishDate = entry.getPublishDate();
            String id = entry.getId();
            EntryDTO entryDTO = new EntryDTO();
            entryDTO.setId(id);
            entryDTO.setPublishDate(publishDate);
            entryDTO.setBody(body);
            entryDTO.setTitle(entry_title);
            entryDTOS.add(entryDTO);
        }
        return entryDTOS;
    }

    private List<Entry> getEntries() {
        return entryRepository.findAll();
    }

    @Override
    public void updateEntry(EntryDTO entryDTO) {

    }

    @Override
    public void deleteEntryById(String id) {

    }

    @Override
    public void deleteEntryByTitle(String title) {

    }
}
