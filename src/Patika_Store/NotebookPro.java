package Patika_Store;

import java.util.ArrayList;

public class NotebookPro extends Product{

    private static ArrayList<NotebookPro> noteList= new ArrayList<>();

    public NotebookPro(int id, double price, String name, Brand brand) {
        super(id, price, name, brand);
    }

    public static ArrayList<NotebookPro> getNoteList() {
        return noteList;
    }

    public static void setNoteList(ArrayList<NotebookPro> noteList) {
        NotebookPro.noteList = noteList;
    }
}
