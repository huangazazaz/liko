package 力扣刷题;

public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String temp;
            String[] strings = arr[i].split("");
            int len = strings.length;
            for (int j = 0; j < len / 2; j++) {
                temp = strings[len - j - 1];
                strings[len - j - 1] = strings[j];
                strings[j] = temp;
            }
            for (String s1 : strings){
                stringBuilder.append(s1);
            }
            if(i!=arr.length-1) stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
