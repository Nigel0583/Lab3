public class Message  {
    private String recipient,  sender, message;



    public String getRecipient() {
        return recipient;
    }

    public String getSender(){
        return sender;
    }

    public String getMessage(){
        return message;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message(){
        this.recipient = "No recipient";
        this.sender = "No sender";

    }
    public void append(String line)
    {
        message += line + "\n";
    }
    public String toString(){
        return "\nFrom: " + sender + "\nTo: " + recipient + "\n\n" + message;
    }
    public Message(String recipient, String sender){
        setRecipient(recipient);
        setSender(sender);
        message = "";
    }
}
