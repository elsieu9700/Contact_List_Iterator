package contactlist;
import java.util.*;
public class ContactList {
	
	private static Object contact;
	
/* may have the list implement the List<Contact> interface in addition to
	all of the above methods
*/
public interface MyList<E> extends Iterable<E>{}
/*create arrays*/
private String[] FirstN = new String[4];
private String[] LastN = new String[4];
private String[] StreetA = new String[4];
private String[] PhoneN = new String[4];
private String[] City = new String[4];
private String[] State = new String[4];
/*A constructor that uses an array of Contacts in order to initialize the
ContactList.*/
public ContactList(String[]FirstN, String[]LastN, String[]StreetA,
    	String[]PhoneN, String[]City, String[]State){
FirstN = new String[4];
LastN = new String[4];
StreetA = new String[4];
PhoneN = new String[4];
City = new String[4];
State = new String[4];
}
/*A constructor that creates an empty ContactList*/
public ContactList(){
  FirstN=null;
  LastN=null;
  StreetA=null;
  PhoneN=null;
  City=null;
  State=null;
}

/*A method  that allows you to add a Contact to the ContactList. 
You should only add a Contact to the list if it is not there already.
*/
public Boolean addContact(ContactList contact) {
  if (findPosition(contact) >= 0) {
   System.out.println("Contact already is phone");
   return false;
  } else {
   ContactList.add(contact);
  }
  return true;
 }
public ArrayList < ContactList > getContacts() {
  return contact;
 }
 /*A method that allows you to remove a Contact from the ContactList*/
 public void removeContact(ContactList contact) {
  if (findPosition(contact) >= 0) {
   contact.remove(findPosition(contact));
  } else {
   System.out.println("No contact");
  }
 }
/*A method that searches for a particular contact by last name, and returns a
 reference to the Contact.  If there is no such Contact, a sentinel value
 should be returned
*/
 public int searchLastN(ContactList LastN) {
  int position = findPosition(LastN);
  if (contact.contains(LastN)) {
   System.out.println("Item found at position");
   return position;
  }
  System.out.println("Not found");
  return -1;
 }
/*A method that searches for a Contact by phone number, and returns a
 reference to the Contact.  If there is no such Contact, a sentinel
 value should be returned.
*/
public int searchPhoneN(ContactList PhoneN) {
  int position = findPosition(PhoneN);
  if (contact.contains(PhoneN)) {
   System.out.println("Item found at position");
   return position;
  }
  System.out.println("Not found");
  return -1;
 }
 private int findPosition(ContactList contact) {
  return this.contact.indexOf(contact);
 }
 private int findPosition(String name) {
  for (int i = 0; i < contact.size(); i++) {
   ContactList contact = this.contact.get(i);
   if (contact.getContact().equals(name)) {
	return i;
   }
  }
  return -1;
 }
/*An overridden equals() method.  Let’s define one ContactList being equal
 to another if they contain the same Contacts (but not necessarily in the
 same order.)*/
//Can check page 7 for another version
 public boolean equals(Object obj) {
 if(!(obj instanceof MyArrayList))
 return false;
 MyArrayList another = (MyArrayList)obj;
if(size() != another.size())
return false;
for(int i=0; i iterator() {
return new ArrayListIterator();
}
/*An overridden toString() method that creates a representation for a
ContactList.  You should use StringBuilder and not String to synthesize your
representation. (obviously, you have to return a String at the end).
*/
	/**
 	*
 	* @param list
 	* @return
 	*/
	public static String getString(List<String> list) {
	StringBuilder sb = new StringBuilder();
	sb.append(" ");
// remove this if you do not want two spaces at the front of the returned string
	for (int i = 0; i < list.size(); i++) {
    	sb.append(" " + list.get(i).toString());
	}
	return sb.toString();
}
/*An iterator() method that allows you to iterate through a ContactList. (
You can implement your own or use the ArrayList’s own iterator).
*/
private class MyArrayIterator(){
  private int index WereUpTo;
  public E removed(){
	throw new UnsupportedOperationException();
  }
 
	public MyArraytIterator(){
	index WereUpTo=0;
  }
  public E next(){
	E elem=arr[index WereUpTo];
	index WereUpTo++;
	return elem;
  }
  public boolean hasNext(){
	return index WereUpTo< numElements;
  }
}
/* A method that returns the size of the ContactList.
*/
 public int size(){
 	return count;
 }
/*A method that allows the client to get a Contact from the ContactList by
index.  An IndexOutOfBoundsException should be thrown if that index doesn’t
exist. */
public E getContact(int index){
  if(index<0||index>=size()) throw new IndexOutOfBoundsException();
  return arr[index];
}
/* A function that searches for and returns a ContactList containing all
Contacts with a last name starting with a particular letter.  If there are
no such Contacts, you should return the empty ContactList.*/
while(!search){
   if(listSize == 0){
  	break; //Doesn't allow search if no names have been entered.
   }
   System.out.print("Please enter the first name to search for or q to quit: ");
   String searchName = in.next().trim().toUpperCase();
   if(searchName.compareTo("Q") == 0){
     	search = true;//allows user to exit search
     	break; //exit "while" iteration
   }
   boolean found = false;
   for(ContactList c: ContactList2){
   	if(c.getName().compareTo(searchName) == 0){
       	System.out.println("name: " + c.getLastN());
       	search = true;
       	found = true;
   	}          	
   }
   if(found == false)
   	return ContactList1;  	
}
/*A method that searches for and returns a ContactList containing all Contacts
that live in a particular city. If there are no such Contacts, you should
return the empty ContactList.
*/
public int searchCity(Contact City) {
  int position = findPosition(City);
  if (contacts.contains(City)) {
   System.out.println("Item found at position");
   return position;
  }
  System.out.println("Not found");
  return ContactList;
 }
}
