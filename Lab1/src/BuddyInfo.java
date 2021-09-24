public class BuddyInfo {

    private String name;
    private String address;
    private String phone;

    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public BuddyInfo(){
        this.name = "Vahid";
        this.address = "123 Street";
        this.phone = "123 456 7890";
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        BuddyInfo test =  new BuddyInfo("Homer", "456 Street", "987 654 3210");
        System.out.println("Hello " + test.getName());


    }


}