import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList myFamilyMembersAge = new ArrayList();

        myFamilyMembersAge.add(44);
        myFamilyMembersAge.add(45);
        myFamilyMembersAge.add(20);
        myFamilyMembersAge.add(1);
        myFamilyMembersAge.add(1,25);

        System.out.println(myFamilyMembersAge.get(2));
    }
}