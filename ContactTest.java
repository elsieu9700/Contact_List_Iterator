public class TestContact {
	public static void main(String[] args) {
    	ContactList[] ContactLists = new ContactList[] {new ContactList("FirstN1", "LastN1","StreetA1", "PhoneN1", "City1", "State1"), new ContactList("FirstN2", "LastN2","StreetA2", "PhoneN2", "City2", "State2"), new ContactList("FirstN3", "LastN3","StreetA3", "PhoneN3", "City3", "State3"), new ContactList("FirstN4", "LastN4","StreetA4", "PhoneN4", "City4", "State4");
    	for (ContactList i : ContactLists) {
        	System.out.println(i.toString());
    	}	
	}
}
