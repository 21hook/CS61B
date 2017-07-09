    public class MyNumber {

       /**
        * Find the maximum value of an int array
        * @param  m an int array with positive numbers
        * @return   the maximum value of the int array
        */
       public static int max(int[] m) {
            int maxVal = 0;

            for (int i=0; i<m.length; i++) {
                if(maxVal < m[i])         
                    maxVal = m[i];
            }

            return maxVal;
       }

       public static void main(String[] args) {
          int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      

          System.out.println(max(numbers));
       }
    }
