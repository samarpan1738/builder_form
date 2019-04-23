import java.util.*;
import java.io.*;

class Person 
{
    String firstname,lastname;
    ArrayList<String> friends;
    public Person(String fname,String lname)
    {
        firstname=fname;
        lastname=lname;
        friends=new ArrayList<String>(1);
    }
    public void setfriends(ArrayList<String> frnds)
    {
        friends=frnds;
    }
    public void details()
    {
        System.out.println(firstname+" "+lastname+"\nFriends-->"+friends);
    }
    public static void main(String[] args) {
        ;
    }
}