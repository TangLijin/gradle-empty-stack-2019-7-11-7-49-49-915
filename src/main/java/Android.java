package first;

    public class Android extends Mobile {
        private int messageMaxLength;
        public Android(String name, String color, String brand) {
            super(name, color, brand);
            messageMaxLength = 6;
        }

        public int getMessageMaxLength() {
            return messageMaxLength;
        }

        public void setMessageMaxLength(int messageMaxLength) {
            this.messageMaxLength = messageMaxLength;
        }

        @Override
        public void call(String message){
            System.out.println("<Andriod>Message:[your input message]" + message);
        }
}
