public class trikampiu_radimas {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int[] a={3, 2, 5, 5};
        int[] b={4, 10, 6, 5};
        int[] c={5, 8, 5, 6};
        int d=0;
        for (int i = 0; i < a.length; i++){
            int e=d;
            System.out.println("Nr."+(++e));
            if(a[d]+b[d]>c[d]&&a[d]+c[d]>b[d]&&b[d]+c[d]>a[d]){
                System.out.print("\rtrikampis susidaro: ");

                if (c[d]==a[d] && c[d]==b[d] && b[d]==a[d]){
                    System.out.println("lygiakrastis\n");
                }

                else if (c[d]==a[d] && c[d]!=b[d] && c[d]!=a[d] || b[d]==a[d] && b[d]!=c[d] && a[d]!=c[d]|| c[d]==b[d] && c[d]!=a[d] && b[d]!=a[d]){
                    System.out.println("lygiasonis\n");
                }

                else if (Math.pow(a[d], 2) + Math.pow(b[d], 2) == Math.pow(c[d], 2)){
                    System.out.println("statusis\n");
                }

                else {
                    System.out.println("ivairiakrastis\n");
                }
            }
            else {
                System.out.println("trikampis nesusidaro\n");
            }
            d++;
        }

    }

}
