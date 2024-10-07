import static java.lang.Math.max;

public class Solution {
    public static class pig {
        public static boolean action(String s){
            if(s.equals("walk")) {
                return true;
            }
            return false;
        }
    }
    public static class duck {
        public static boolean action(String s){
            if(s.equals("walk") || s.equals("swin")) {
                return true;
            }
            return false;
        }
    }
    public static class fish {
        public static boolean action(String s){
            if(s.equals("swin")) {
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {

        duck dnmd = new duck();
        fish mao = new fish();
        pig tuan = new pig();
        String[] action = {"walk", "swin"};
        for(int i = 0; i < action.length; i++) {
            if(dnmd.action(action[i])) {
                System.out.println("dnmd" + " can " + action[i]);
            }
            if(mao.action(action[i])) {
                System.out.println("mao" + " can " + action[i]);
            }
            if(tuan.action(action[i])) {
                System.out.println("tuan" + " can " + action[i]);
            }
        }


    }


}