package smartcontracts;

public class SwapSmartContract implements Contract{
    
    private String address;
    private String party1;
    private String party2;
    private long deadline, threshold;
    
    public SwapSmartContract(String address) {
        this.address = address;
        collectAmount();
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getParty1() {
        return party1;
    }
    
    public void setParty1(String party1) {
        this.party1 = party1;
    }
    public String getParty2() {
        return party2;
    }
    
    public void setParty2(String party2) {
        this.party2 = party2;
    }
    
    public long getDeadline() {
        return deadline;
    }
    
    public void setDeadline(long deadline) {
        this.deadline = deadline;
    }
    
    public long getThreshold() {
        return threshold;
    }

    public void setThreshold(long threshold) {
        this.threshold = threshold;
    }
    
    public void collectAmount(){
        System.out.println("Collecting same amount from " + party1 + " and " + party2);
    }

    public void execute(String... args) {
        if(System.currentTimeMillis() < deadline){
            
            long price = 0; // Get price from third-party trusted source
            
            if(price > threshold){
                new Sender().send(party1, price);
            } else {
                new Sender().send(party2, price);
            }
        }
    }    
}