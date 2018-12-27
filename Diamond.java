
public class Diamond
{
    public static void main(String[]args)
    {
        int size=Integer.parseInt(args[0])/2;
        int r=size/2;
        String x="";
        
        
        
        for(int i=-size;i<=size;i++)
        {
            for(int j=-size;j<=size;j++)
            {
                if((Math.abs(i)+Math.abs(j)+r)%3==0)x+="*";
                else x+=" ";
            }
            x+="\n";
        }
        System.out.print(x);
    }
}
