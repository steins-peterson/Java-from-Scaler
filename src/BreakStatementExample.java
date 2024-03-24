public class BreakStatementExample {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            if(i==5){
                System.out.println("Breaking outta the loop");
                break; // a break statement is used to preemptively come out of the loop
            }
            System.out.println(i);
        }

    }
}
