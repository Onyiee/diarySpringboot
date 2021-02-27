package com.onyemowo.diary.repositories;

import com.onyemowo.diary.models.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends MongoRepository<Entry, String> {
    void deleteEntryByTitle(String title);
    Entry findEntryByTitle(String title);
    Entry findEntryByBodyContains(String text);

}
