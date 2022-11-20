public class pronic
{
    public int pron(int n)
    {
        int i,f=0;
        for(i=1;i<=n/2;i++)
        {
            if(i*(i+1)==n){
            f=1;
            break;
        }
        }
      return f;    
    }
    
}