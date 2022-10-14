package bitmanipulation;

import java.util.ArrayList;

public class SubArraysWithBitwiseOr1 {
    public Long solve(int A, ArrayList<Integer> B) {
        long count = 0;
        for(int i = 0; i < B.size(); i++) {
            if(B.get(i).equals(1)) {
                count += (B.size() - i);
            } else {
                for(int j = i+1; j < B.size(); j++) {
                    if(B.get(j).equals(1)) {
                        count += (B.size() - j);
                        break;
                    }
                }
            }
        }

        return count;
    }
}
