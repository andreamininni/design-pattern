public class JeegFactory {
    //! ritorneà gli oggetti con cui creerò Jeeg
    public Object instance(JeegComponentType componentType){
        Object component = null;
        switch(componentType){
            case Legs:
                component = new Legs();
                break;
            case Tank:
                component = new Tank();
                break;
            case LanciaMissiliDx:
                component = new LanciaMissili("Destro");
                break;
            case LanciaMissiliSx:
                component = new LanciaMissili("Sinistro");
                break;
            case LaserSx:
                component = new Laser("Sinistro");
                break;
            case LaserDx:
                component = new Laser("Destro");
                break;
        }

        return component;
    }
}
