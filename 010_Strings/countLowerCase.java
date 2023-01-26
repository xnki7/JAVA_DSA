//Count the number of lowercase characers in a string.
public class lowerCaseCounter{
    public static int lowercase(String str){
        StringBuilder sb = new StringBuilder("");

        int counter = 0;
        for(int i=0 ; i<str.length(); i++){
            if(Character.toUpperCase(str.charAt(i)) != str.charAt(i)){
                counter++;
            }
        }

        return counter;
    }

    public static void main(String args[]){
        String str = "ankiTGuptA";
        System.out.println(lowercase(str));
    }
}
