public abstract class Decisionfactory {
    private static int x = 0;

    public static Decisionfactory getDecisionfactory (int goal) {

        if (goal > x) {
            return new strategyfactory();

        } 
        
        return null;
    }

    public subGoal getsubGoal(int[] arr) {
        return null;
    }
    public subGoal1 getSubGoal1(int [] arr) {
        return null;
    }
    
    
}
