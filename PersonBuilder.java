import java.util.ArrayList;

public class PersonBuilder extends Person implements first_name_holder,last_name_holder,friends,builder
{
    String firstname,lastname;
    ArrayList<String> friendslist=new ArrayList<String>(1);

    private PersonBuilder()
    {
        super("", "");
        firstname="";
        lastname="";
    }
    public static first_name_holder start()
    {
        return new PersonBuilder();
    }
    public last_name_holder setFirstName(String first_name)
    {
        firstname=first_name;
        return this;
    }

    public friends setLastName(String last_name)
    {
        lastname=last_name;
        return this;
    }
    public friends addFriend(String friendName)
    {
        friendslist.add(friendName);
        return this;
    }
    public builder noMoreFriends()
    {
        return this;
    }
    public Person build_interface()
    {
        Person p=new Person(firstname,lastname);
        p.setfriends(friendslist);
        return p;

    }
}