import static java.lang.Math.max;

public class Solution {

    private static pig tuan;

    public static class pig extends Animal {
        public static boolean action(String s){
            if(s.equals("walk")) {
                return true;
            }
            return false;
        }
    }
    public static class duck extends Animal {
        public static boolean action(String s){
            if(s.equals("walk") || s.equals("swin")) {
                return true;
            }
            return false;
        }
    }
    public static class fish extends Animal {
        public static boolean action(String s){
            if(s.equals("swin")) {
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {

        duck dnmd = new duck();
        dnmd.setName("dnmd");
        fish mao = new fish();
        mao.setName("mao");
        pig tuan = new pig();
        tuan.setName("tuan");
        String[] action = {"walk", "swin"};
        for(int i = 0; i < action.length; i++) {
            if(dnmd.action(action[i])) {
                System.out.println(dnmd.getName() + " can " + action[i]);
            }
            if(mao.action(action[i])) {
                System.out.println(mao.getName() + " can " + action[i]);
            }
            if(tuan.action(action[i])) {
                System.out.println(tuan.getName() + " can " + action[i]);
            }
        }


    }


}