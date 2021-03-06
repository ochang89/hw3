public class SumOfDiagonals
{
    public static void main(String[] args)
    {
        String[][] s1 = {{"2", "3", "4"},
                {"5", "6", "7"},
                {"8", "9", "10"}};

        String[][] s2 = {{"1", "2", "3"},
                {"5", "6", "7"},
                {"9", "10", "11"},
                {"13", "14", "15"}};
        String[][] s3 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "pp"}};
        String[][] s4 = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        try
        {
            sumOfDiagonals(s1);
            sumOfDiagonals(s2);
            sumOfDiagonals(s3);
            sumOfDiagonals(s4);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Not a valid integer");
        }
        catch(IllegalArgumentException ex)
        {
            System.out.println("Array not a square");
        }
    } //j0   j1   j2
//    {"2", "3", "4"},   i0   arr0/ row 0, arr0[0]
//    {"5", "6", "7"},   i1   arr1,        arr1[1]
//    {"8", "9", "10"}   i2   arr2         arr2[2]
    public static void sumOfDiagonals(String[][] x)
    {
        int sum = 0;
        // for every array/row
            for (int i = 0; i < x.length; i++) {
                // check if its a perfect square: x length * array length
                if (x.length != x[i].length) {
                    // if not, throw exception
                    throw new IllegalArgumentException();
                }
                // if element contains letters, throw exception
                else if(x[i][i].contains("[a-zA-Z]")) {
                    throw new NumberFormatException();
                }
                // add number from row to sum
                sum += Integer.parseInt(x[i][i]);
            }
            System.out.println(sum);
        }
    }