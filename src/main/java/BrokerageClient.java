

public class BrokerageClient{
    private String name;
    private int age;
    private String gender;
    public static int money;

    public BrokerageClient(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.money=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
