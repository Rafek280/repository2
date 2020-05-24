import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	PhoneBook test = new PhoneBook("Wirtschaft");

	test.addEntry("Vater",111,"Strasse 2");
	test.addEntry("Mutter",222,"Strasse 5");
	test.addEntry("Bruder",333,"Strasse 10");
	test.addEntry("Voelker",18723123,"Strasse 120");

    //PhoneBookEntry x = test.searchEntry("Mutter");
    //System.out.println(test.getAllEntries().size());
	//HashSet<PhoneBookEntry> x = test.getAllEntries();
    /*for(PhoneBookEntry y : x){
        System.out.println(y.toString());
    }*/
         /*for(PhoneBookEntry entry : x){
                if(entry.getName().startsWith("V")){
                    System.out.println(entry.toString());
            }
        }*/
    }
}