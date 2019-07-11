

//A Person (has a name) can use different Mobile to make a call. However, the iPhone and Andriod have different message
//length limit.if message length exceeds the limit, CLI should output “<iPhone> Message cannot be sent” and “<Andriod>
//Message cannot be sent” respectively.
//There is an IPhoneRobot, it can only use iPhone, it can not use other kind of Mobiles.

public class Person {
    private String name;
    private Mobile mobile;

//    public void makeCall(Mobile mobile, String message){
//        if(mobile.messageMaxLength > message.length())
//            System.out.println("<" + mobile.getBrand() + ">" + "Message cannot be sent");
//        else System.out.println("<" + mobile.getBrand() + ">Message :" + message);
//    }

    public Person(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void makeCall(IPhone iPhone, String message){
        if(iPhone.getMessageMaxLength() < message.length())
            System.out.println("<" + iPhone.getBrand() + ">" + "Message cannot be sent");
        else System.out.println("<" + iPhone.getBrand() + ">Message :" + message);
    }

    public void makeCall(Android android, String message){
        if(android.getMessageMaxLength() < message.length())
            System.out.println("<" + android.getBrand() + ">" + "Message cannot be sent");
        else System.out.println("<" + android.getBrand() + ">Message :" + message);
    }

}

class IPhoneRobot extends Person{
    public IPhoneRobot(String name, IPhone iPhone) {
        super(name, iPhone);
    }

    @Override
    public void makeCall(IPhone iPhone, String message) {
        super.makeCall(iPhone, message);
    }

    @Override
    public void makeCall(Android android, String message) {
        super.makeCall(android, message);
    }
}

