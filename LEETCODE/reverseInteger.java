//7. . Reverse Integer

public class reverseInteger {

        public static int reverse(int x) {
            
            int revNum = 0;
            while(x!=0){
                int ld = x%10;
                if (revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10 ||
                    (revNum == Integer.MAX_VALUE / 10 && ld > 7) || 
                    (revNum == Integer.MIN_VALUE / 10 && ld < -8)) {
                    return 0;
                }
                revNum=(revNum*10)+ld;
    
                x=x/10;
            }
            return revNum;
        }
        public static void main(String[] args) {
            int x = 123;
            System.out.println(reverse(x));
        }
    }

