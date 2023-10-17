package ontopic.week3.HW5.returningMemberHW;

import java.util.ArrayList;
import java.util.Arrays;

class RemoveZeroes {
    static int averageVowels(ArrayList<String> list) {
        int pos = 0;
        int vowelCount = 0;
        for (String elm : list) {
            //there are absolutely better ways to do this but i dont care
            if (elm.charAt(pos) == 'a' || elm.charAt(pos) == 'e' || elm.charAt(pos) == 'i' || elm.charAt(pos) == 'o' || elm.charAt(pos) == 'u') {
                ++vowelCount;
            }
        }
        return vowelCount / list.size();
    }
    static ArrayList<Integer> removeZeroes(ArrayList<Integer> list) {
        for (Integer elm : list) {
            if (list.get(elm) == 0) {
                list.remove(elm);
            }
        }
        return list;
    }
}
