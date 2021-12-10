package Strings;

public class SpaceTwenty {
    
    public static String replaceSpace(String str){
        
        String result = "";
        char[] charStr = str.toCharArray();
        int spaces = 0;

        for(int i=0;charStr[i]!='\0';i++){
            if(charStr[i] == ' '){
                spaces++;
            }
        }

        int idx = str.length() + 2*spaces;
        charStr[idx] = '\0';

        for(int i= str.length()-1 ; i>=0;i--){
            if(charStr[i] == ' '){
                charStr[idx-1] = '0';
                charStr[idx-2] = '2';
                charStr[idx-3] = '%';
                idx = idx - 3;

            }else{
                charStr[idx-1] = charStr[i];
                idx--;
            }
        }

        result = charStr.toString();
        
        return result;
    }

    public static void main(String[] args) {
        String str = "Hello this is himani panwar";

        String ans = replaceSpace(str);

        System.out.println(ans);
    }

}
