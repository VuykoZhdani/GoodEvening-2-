package Method;

import Realization.*;

public class Main {
    public static void main(String [] args)
    {
        Arena arena1=new Arena(12, 12.2);
        Coliseum coliseum1=new Coliseum(12, 12.2);
        Stadium[] chmo= {arena1,coliseum1};
        for (Stadium poz:chmo) {
            System.out.println(poz.getName()+"="+poz.getWatchmen()+","+poz.getWhitePower());
        }

    }
}
