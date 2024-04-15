package com.example.note.dao;

import com.example.note.entity.Note;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class NoteDaoImpl implements NoteDao {

    private final Map<Long, Note> notes = new HashMap<>();
    private long currentId = 0;

    @Override
    public List<Note> listAll() {
        return new ArrayList<>(notes.values());
    }

    @Override
    public Note add(Note note) {
        note.setId(++currentId);
        notes.put(note.getId(), note);
        return note;
    }

    @Override
    public void deleteById(Long id) {
        if(!notes.containsKey(id)){
            throw new IllegalArgumentException("There is no Note with ID: " + id);
        }
        notes.remove(id);
    }

    @Override
    public void update(Note note) {
        long id = note.getId();

        if (!notes.containsKey(id)){
            throw new IllegalArgumentException("There is no Note with ID: " + id);
        }
        notes.put(id,note);
    }

    @Override
    public Note getById(Long id) {
        Note note = notes.get(id);
        if (note == null){
            throw new IllegalArgumentException("There is no Note with ID: " + id);
        }
        return note;
    }
}