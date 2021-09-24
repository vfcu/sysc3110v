import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> BuddyInfoList;

    public AddressBook(){
        this.BuddyInfoList = new ArrayList<BuddyInfo>();
    }

    private void addBuddy(BuddyInfo buddy){
        if(buddy != null){
            BuddyInfoList.add(buddy);
        }
    }

    private BuddyInfo removeBuddy(int i){
        if(i>=0 && i < BuddyInfoList.size()){
            return BuddyInfoList.remove(i);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo b = new BuddyInfo("Name", "Address", "123");
        AddressBook a = new AddressBook();
        a.addBuddy(b);
        a.removeBuddy(0);
        System.out.println("Hello World");
    }

}