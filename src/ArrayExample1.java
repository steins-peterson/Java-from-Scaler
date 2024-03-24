public class ArrayExample1 {
    public static void main(String[] args) {
        String [] jjk = new String[4];
        jjk[0] = "Gojou";
        jjk[1] = "Itadori";
        jjk[2] = "Suguru";
        jjk[3] = "Megumi";
        for (int i = 0; i<jjk.length; i++){
            System.out.println("At " + i + " position in jjk is "+ jjk[i]);
        }
    }
}
