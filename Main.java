public class Main {
    public static void main(String strgs[]) {
        int milan_points = 0;
        int udit_points = 0;
        int n = udit_points > milan_points ? milan_points : udit_points;
        int i;

        if (milan_points >= udit_points) {
            return;
        }

        for(i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j % 2 == 0) {
                    System.out.println(" . ");
                }else {
                    System.out.println(" _ ");
                }
            }
            System.out.println(" - ");
        }

    }
}
