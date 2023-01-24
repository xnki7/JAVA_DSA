import java.util.*;
public class ShortestPath{
    public static float getShortestPath(String path){
        int x=0, y=0;

        for(int i=0; i<path.length(); i++){
            if(path.charAt(i) == 'N'){
                y = y + 1;
            }
            else if(path.charAt(i) == 'E'){
                x = x + 1;
            }
            else if(path.charAt(i) == 'S'){
                y = y - 1;
            }
            else{
                x = x - 1;
            }
        }

        float shortPath = (float)Math.sqrt(y*y + x*x);
        return shortPath;
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}