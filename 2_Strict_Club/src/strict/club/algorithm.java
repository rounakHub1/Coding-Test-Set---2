package strict.club;

public class algorithm {

    private String str, trimStr;
    private char[] chr, trimChr;
    private int flag, idx;


    public void setStr(String str) {
        this.str = str;
        chr = str.toCharArray();
        trimChr = new char[chr.length];
    }
    private void calculate() {

        idx = 0;
        for(int i=0; i < chr.length; i++) {
            for(int j=0; j < i; j++) {

                if(chr[i] == trimChr[j]) {
                    flag = 1;
                    break;
                }

            } if(flag == 0)
                trimChr[idx++] = chr[i];
            flag = 0;
        }
        trimStr = new String(trimChr);
    }
    public String getStr() {
        calculate();
        return trimStr;
    }

}
