package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;  // счетчик с 1
        for (String str : strs) {

            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            if (str.contains("nibn")) {
                str = str.replace("nibn", "nion");
            }

            stringBuilder.append(count).append(") ").append(str).append("\n");
            count++;
        }
        return stringBuilder.toString();
    }
}
