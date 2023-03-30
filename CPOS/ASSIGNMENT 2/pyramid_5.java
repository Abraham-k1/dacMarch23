public class pyramid_5 
{
    
        public static void main(String[] args) {
            int rows = 9; // number of rows in the pyramid
            int center = 9; // center number of the pyramid
    
            // loop for each row of the pyramid
            for (int i = 0; i < rows; i++) {
                int num = center - i; // number for this row
                int j;
    
                // loop for printing numbers on left half of the pyramid
                for (j = 1; j <= rows - i; j++) {
                    System.out.print(num + " "); // print number and space
                    num--;
                }
    
                num += 2; // reset number for this row
    
                // loop for printing numbers on right half of the pyramid
                for (; j <= rows + i; j++) {
                    System.out.print(num + " "); // print number and space
                    num++;
                }
    
                System.out.println(); // move to next line
            }
        }
    }
    