package alphabetsOnly;

public class Algorithm {
    
    private String str, newStr;
    private char[] chArr;

    public void setStr(String str) {
        this.str = str;
        chArr = str.toCharArray();
    }
    private int calculate() {
        int idx = 0;
        for(int i=0; i<str.length(); i++) {

            if(chArr[i] >= 'a' && chArr[i] <= 'z')
                chArr[idx++] = chArr[i];

            else if(chArr[i] >= 'A' && chArr[i] <= 'Z')
                chArr[idx++] = chArr[i];

            else if(chArr[i] == ' ')
                chArr[idx++] = chArr[i];
        }
        return idx;
    }
    public String getStr() {

        int n = calculate();
        newStr = new String(chArr);
        return newStr.substring(0, n);
    }
}
