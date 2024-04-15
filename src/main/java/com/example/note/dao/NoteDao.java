package com.example.note.dao;

import com.example.note.entity.Note;

import java.util.List;

public interface NoteDao {

    List<Note> listAll();

    Note add(Note note);

    void deleteById(Long id);

    void update(Note note);

    Note getById(Long Id);
}