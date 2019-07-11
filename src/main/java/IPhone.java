package first;

//I have an iPhone, it is also a Mobile. When I use it to make a call,
// CLI will output “<iPhone>Message : [your input message]”， [your input message] should be passed to Mobile.
public class IPhone extends Mobile {
    private int messageMaxLength;
    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
        this.messageMaxLength = 5;
    }

    public int getMessageMaxLength() {
        return messageMaxLength;
    }

    public void setMessageMaxLength(int messageMaxLength) {
        this.messageMaxLength = messageMaxLength;
    }

    @Override
    public void call(String message){
        System.out.println("<iPhone>Message:[your input message]" + message);
    }
}
