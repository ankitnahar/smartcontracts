package smartcontracts;

public class Sender {

    public void send(String address, long amount) {
        System.out.println(String.format("Sending to address:%s, amount:%d", address, amount));
    }

}
