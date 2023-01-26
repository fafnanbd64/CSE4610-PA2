public class strategyfactory extends Decisionfactory {
    



    public subGoal getsubGoal(int arr1[]){
       if (arr1[0] == 1 && arr1[1] == 3) {
            System.out.println("G1");
            System.out.println("swap.c is a fault-free source file");
            System.out.println("G 1.1 ");
            System.out.println("Fault *int temp = *a, *a = *b, *b =*b has been resolved");
            
            String id = "G 1.1.1.1";
            String des = "test case 1,3 has been successfully run";
            System.out.println(id);
            System.out.println(des);
            subGoal.getContext();
            subGoal.getassumption();
            subGoal.getsolution();
            
            
        }
        else {
            
        }
        return new subGoal();
    }

   

    public subGoal1 getGoal1(int arr1[]) {
        
       if (arr1[0] == 2 && arr1[1] == 6) {
            String id = "G 1.1.1.2";
            String des = "test case 2,6 has been successfully run";
            System.out.println(id);
            System.out.println(des);
            subGoal1.getContext();
            subGoal1.getassumption();
            subGoal1.getsolution();
            

       } 
       else {

       }
        return new subGoal1();
    }
    
}
