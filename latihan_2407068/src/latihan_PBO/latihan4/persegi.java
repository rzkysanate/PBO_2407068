package latihan_PBO.latihan4;

public class persegi extends BangunDatar {

    public double LuasPersegi(){
        return getSisi()*getSisi();
    }

    public double KelilingPersegi(){
        return 4*getSisi();
    }
    
}