package bites.examples;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReadingList {
    ArrayList<String> unread;

    public ReadingList(ArrayList<String> unread) {
        this.unread = unread;
    }

    public void Add(String book_title) {
        this.unread.add(book_title);
    }

    public ReadingList() {}

    public static void main(String[] args) {
        ReadingList list = new ReadingList(null);
        list.Add("sigma book");
        list.Add("enigma book");
    }
}
