package smartcontracts;

import java.util.Map;

public class RegistrationSmartContract implements Contract{
    
    private String address;
    private Map<String, String> usersNameAddressMap;
    
    public RegistrationSmartContract(String address) {
        this.address = address;
    }
    
    public void register(String name, String address){
        if(!usersNameAddressMap.containsKey(name) && name != ""){
            usersNameAddressMap.put(name, address);
        }
    }
    
    public void unregister(String name){
        if(usersNameAddressMap.containsKey(name) && name != ""){
            usersNameAddressMap.remove(name);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<String, String> getUsersNameAddressMap() {
        return usersNameAddressMap;
    }

    public void setUsersNameAddressMap(Map<String, String> usersNameAddressMap) {
        this.usersNameAddressMap = usersNameAddressMap;
    }

    public void execute(String... args) {
        // write execution if required
    }
}