public class App {
    public static void main(String[] args) throws Exception {
        //! Factory
        //! una classe che, in base a dei parametri, ritorna un oggetto.

    //! Adesso, se voglio creare un oggertto e NON preoccumarmi del casting, devo utilizzare la classe JeegFactoryPrototype
       JeegFactorySingleton jeegFactorySingleton = new JeegFactorySingleton();
       LanciaMissili lm = jeegFactorySingleton.instanceCasting(JeegComponentType.LanciaMissiliDx, LanciaMissili.class);
       LanciaMissili lms = jeegFactorySingleton.instanceCasting(JeegComponentType.LanciaMissiliSx, LanciaMissili.class);
       Laser laser = jeegFactorySingleton.instanceCasting(JeegComponentType.LaserSx, Laser.class);
       Legs legs = jeegFactorySingleton.instanceCasting(JeegComponentType.Legs, Legs.class);

       Legs legs2 = jeegFactorySingleton.instanceCasting(JeegComponentType.Legs, Legs.class);
       LanciaMissili lm2 = jeegFactorySingleton.instanceCasting(JeegComponentType.LanciaMissiliDx, LanciaMissili.class);
       Jeeg j1 = new Jeeg(lm, laser, legs);
       Jeeg j2 = new Jeeg(lm2, lms, legs2);

    }
}
