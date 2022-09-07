package 力扣刷题;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrayList = new ArrayList<>();
        List<Integer> arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList.add(arrayList1);
        arrayList1.add(1);
        arrayList.add(arrayList1);
        if (numRows == 1) {
            return arrayList;
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> arrayList2 = new ArrayList();
            arrayList2.add(1);
            for (int j = 1; j < i + 1; j++) {
                arrayList2.add(arrayList.get(i - 1).get(j - 1) + arrayList.get(i - 1).get(j));
            }
            arrayList2.add(1);
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

}
