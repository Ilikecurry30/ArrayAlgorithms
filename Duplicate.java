public class Duplicate {
    public static void main(String [] args) {
        String[] classes = { "Algebra 2", "Physics", "Physics", "DDP", "Lunch", "APCSA", "Study Hall", "English 11R", "U.S. History" };
        System.out.println("Contains duplicates: " + containsDuplicate(classes));
    }

    public static boolean containsDuplicate (String[] classes){
        for (int i = 0; i < classes.length; i++){
            for (int j = i + 1; j < classes.length; j++){
                if (classes[i].equals(classes[j])){
                    return true;
                }
            }
        }
        return false;
    }
}