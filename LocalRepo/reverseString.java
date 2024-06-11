class reverseString
{

public static void main(String[] args)
    {
        String s="Manoj Agnihotri";
        String rev=""; //Empty String
        for(int i=0;i<s.length();i++)
        {
          char c=s.charAt(i);
          rev=c+rev;    
        }
        System.out.println("Tghe reverse of "+s+ "is " +rev);
    }

}