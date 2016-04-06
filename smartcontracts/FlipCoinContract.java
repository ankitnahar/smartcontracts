/*
 *  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *  
 *  @version     1.0, 06-Apr-2016
 *  @author ankit
 */
package smartcontracts;

import java.util.Random;

public class FlipCoinContract implements Contract{
    
    private String address;
    
    public FlipCoinContract(String address) {
        this.address = address;
    }

    public void execute(String... args) {
        Integer betAmount = Integer.parseInt(args[0]);
        Random random = new Random();
        int nextInt = random.nextInt();
        if (nextInt % 2 != 0){
            new Sender().send(address, 2 * betAmount);
        }
    }

    public String getAddress() {
        return address;
    }
}