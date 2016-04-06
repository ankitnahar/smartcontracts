package smartcontracts;

import java.util.Map;

public class BankSmartContract implements Contract{
    
    private String owner;
    private Map<String, Double> usersBalanceMap;
    
    public BankSmartContract(String owner) {
        this.owner = owner;
    }
    
    public void deposit(String party, Double amount) {
        if(usersBalanceMap.containsKey(party)){
            usersBalanceMap.put(party, usersBalanceMap.get(party) + amount);
        } else {
            usersBalanceMap.put(party, amount);
        }
    }
    
    public void withdraw(String party, Double amount) {
        
        if(!usersBalanceMap.containsKey(party) || usersBalanceMap.get(party) - amount < 0){
            return;
        }
        
        usersBalanceMap.put(party, usersBalanceMap.get(party) - amount);
    }
    
    public void execute(String... args) {
        // write execution if required
    }
    

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public Map<String, Double> getUsersBalanceMap() {
        return usersBalanceMap;
    }

    public void setUsersBalanceMap(Map<String, Double> usersBalanceMap) {
        this.usersBalanceMap = usersBalanceMap;
    }

    public String getAddress() {
        return owner;
    }
}