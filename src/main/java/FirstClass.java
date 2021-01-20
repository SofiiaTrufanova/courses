public class FirstClass {
    // Минимум трех чисел
        public static void main(String[] args) {
            //System.out.println(min(5,2,3));

        }
        public int min(int arr[]) {
            int minimum = arr[0];
            for (int l: arr) {
                minimum = minimum < l ? minimum : l;
            }
            return minimum;
        }
    }
