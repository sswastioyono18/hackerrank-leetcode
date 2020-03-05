import java.util.*;

public class HashTableTestOne {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        //put magazine in hash table string, integer
        //loop note, if note exist in magazine.values

        Hashtable<String, Integer> testHash = new Hashtable<String, Integer>();
        for(int i = 0;i< note.length;i++){
            if(testHash.containsKey(note[i].toLowerCase())){
                testHash.put(note[i].toLowerCase(), testHash.get(note[i].toLowerCase())+1);
            } else {
                testHash.put(note[i].toLowerCase(), 1);
            }
        }

        boolean result = true;
        // TC 1 : normal flow
        // TC 2 : duplicate word
        // TC 3 :
        for(String s : magazine){
            if(testHash.containsKey(s.toLowerCase()) && testHash.get(s.toLowerCase()) > 0){
                testHash.put(s.toLowerCase(), testHash.get(s.toLowerCase()) - 1);
                if(testHash.get(s.toLowerCase()) == 0){
                    testHash.remove(s);
                }
            }

            if(testHash.isEmpty()){
                result=true;
                break;
            } else {
                result = false;
            }
        }

        if(result){
            System.out.println("Yes");
        } else
            System.out.println("No");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
