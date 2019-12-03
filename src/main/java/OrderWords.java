
public class OrderWords {
    public static void main(String[] args) {
        String test = "Cats cats and hats";
        String[] splitSpace = test.toLowerCase().split(" ");
        int[] wordsCount = new int[splitSpace.length];
        String tempString = "";
        for (int i = 0; i < splitSpace.length; i++) {
            wordsCount[i] = convertToInt(splitSpace[i]);

            for (int j = i + 1; j < splitSpace.length - 1; j++) {
                wordsCount[j] = convertToInt((splitSpace[j]));
                if (wordsCount[i] > wordsCount[j]) {
                    tempString = splitSpace[i];
                    splitSpace[i] = splitSpace[j];
                    splitSpace[j] = tempString;

                }
            }
        }

        splitSpace[0] = splitSpace[0].substring(0, 1).toUpperCase() + splitSpace[0].substring(1);

        String temp="";
        for(int i=0;i<splitSpace.length;i++){
            if(i!=splitSpace.length)
                temp+= splitSpace[i] + " ";
            else
                temp+= splitSpace[i];
        }

            System.out.println(temp);

    }



    public static int convertToInt(String words){
        int sumWords = 0;
        for(int i = 0;i<words.length();i++){
            sumWords+= words.charAt(i);
        }
        return sumWords;
    }
}
