import java.time.Instant;


public class FizzBuzz {
    public static String checkFizzBuzz(int n)
    {
        if(n<=0 || n>100)
        {
            return "Số nhập vào phải lớn hơn 0 và nhỏ hơn 100";
        }else
        {
            if(n % 3 ==0)
            {
                if(n % 5 ==0)
                {
                    return "FizzBuzz";
                }else
                {
                    if(containNumber(n,3))
                    {
                        return "Fizz";
                    }
                    return "Fizz";
                }
            } else if (containNumber(n,5)||n % 5 ==0) {
                return "Buzz";
            }
        }
        return numberToString(n);

    }
    public static boolean containNumber(int a,int num)
    {
        String s =Integer.toString(a);
        char[] arr = s.toCharArray();
        for(int i =0;i<arr.length;i++)
        {
            if((int)arr[i]==num)
            {
                return true;
            }
        }
        return false;
    }
    public static String numberToString(int numeric)
    {
        String result= "";
        int tens = numeric/10;
        int ones = numeric%10;
        switch (tens)
        {
            case 1 :
                result +="Muoi ";
                break;
            case 2:
                result +="Hai ";
                break;
            case 3:
                result +="Ba ";
                break;
            case 4:
                result +="Bon ";
                break;
            case 5:
                result +="Nam ";
                break;
            case 6:
                result +="Sau ";
                break;
            case 7:
                result+="Bay ";
                break;
            case 8:
                result+="Tam ";
                break;
            case 9:
                result+="Chin ";
                break;

        }
        switch (ones)
        {
            case 1 :
                result +="mot";
                break;
            case 2:
                result +="hai";
                break;
            case 3:
                result +="ba";
                break;
            case 4:
                result +="bon";
                break;
            case 5:
                result +="nam";
                break;
            case 6:
                result +="sau";
                break;
            case 7:
                result+="bay";
                break;
            case 8:
                result+="tam";
                break;
            case 9:
                result+="chin";
                break;

        }
        return result;
    }
}
