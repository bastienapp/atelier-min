/* TODO créer la classe Tester
    ajouter une point d'entrée
    créer un tableau avec des valeurs choisies
    appeler la méthode min et afficher le résultat
*/
class Tester {
    public static void main(String[] args) {
        /*
        int[] values = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            values[i] = Integer.parseInt(args[i]);
        }
        */
        int[] values  = {3, 4, 2, 6};

        int result = Util.min(values);
        System.out.println(result);
    }
}