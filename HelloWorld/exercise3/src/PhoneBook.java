import java.util.*;
public class PhoneBook {
    private String name;
    HashSet<PhoneBookEntry> entries = new HashSet<>();

    public PhoneBook(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public HashSet<PhoneBookEntry> getAllEntries(){
        return entries;
    }

    public void addEntry(String name, int number, String description){
        entries.add(new PhoneBookEntry(name,number,description));
    }

    public PhoneBookEntry searchEntry(String name) {
        for(PhoneBookEntry entry : entries){
            if(entry.getName().equals(name)){
                return entry;
            }
        }
        return null;
    }





}
