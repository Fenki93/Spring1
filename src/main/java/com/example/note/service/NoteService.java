package com.example.note.service;

import com.example.note.dao.NoteDaoImpl;
import com.example.note.entity.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteDaoImpl noteDao = new NoteDaoImpl();

    public List<Note> listAll(){
        return noteDao.listAll();
    }

    public Note add(Note note){
       return noteDao.add(note);
    }

    public void deleteById(Long id){
        noteDao.deleteById(id);
    }

    public void update(Note note){
        noteDao.update(note);
    }

    public Note getById(Long id){
        return noteDao.getById(id);
    }

}