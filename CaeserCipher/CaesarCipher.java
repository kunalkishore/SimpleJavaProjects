/**
 * Created by 16530 on 22/06/17.
 */
public class CaesarCipher {
    protected char[] encoder=new char[26];
    protected char[] decoder=new char[26];

    public CaesarCipher(int rotation) {
        for (int i=0;i<26;i++){
            encoder[i] = (char)('A' + (i+rotation)%26);
            decoder[i] = (char)('A' + (i-rotation+26)%26);
        }
    }
    public String encrypt(String s){
        return transform(s,encoder);
    }
    public String decrypt(String s){
        return transform(s,decoder);
    }
    private String transform(String s,char[] coder){
        char[] txt = s.toCharArray();
        for(int i=0;i<txt.length;i++){
            if (Character.isUpperCase(txt[i])){
                txt[i]=coder[txt[i]-'A'];
            }
        }
        return new String(txt);
    }

    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(3);
        String message = "GAZI TO BE ATTACKED NEAR VISHAKAPATNAM AIRPORT";
        System.out.println("Original Message: "+ message);
        System.out.println("Encrypted Message: " + cipher.encrypt(message));
    }
}
