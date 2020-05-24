public class PhoneBookEntry {
    private String name;
    private int number;
    private String description;

    public PhoneBookEntry(String name, int number, String description){
        this.name=name;
        this.number=number;
        this.description=description;
    }
    public String getName() {
        return name;
    }


    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "Name: " + this.name+ "\n" + "Number: " + this.number + "\n" + "Description: " + this.description + "\n";
    }
}
