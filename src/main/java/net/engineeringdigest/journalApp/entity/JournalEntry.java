package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Document(collection = "journalEntries")
@Data
public class JournalEntry {


    private ObjectId id;
    private String title;
    private String content;
    private LocalDate date;

}
