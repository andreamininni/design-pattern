public class App {
    public static void main(String[] args) throws Exception {
        //! Factory
        //! una classe che, in base a dei parametri, ritorna un oggetto.

    //! Adesso, se voglio creare un oggertto e NON preoccumarmi del casting, devo utilizzare la classe JeegFactoryPrototype
        JeegFactoryPrototype jeegFactoryPrototype = new JeegFactoryPrototype();
        LanciaMissili lm = jeegFactoryPrototype.instanceCasting(JeegComponentType.LanciaMissiliDx, LanciaMissili.class);
        Laser laser = jeegFactoryPrototype.instanceCasting(JeegComponentType.LaserDx, Laser.class);
        Legs legs = jeegFactoryPrototype.instanceCasting(JeegComponentType.Legs, Legs.class);
        Jeeg j1 = new Jeeg(lm, laser, legs);
        j1.muovitiInAvanti();
        j1.attacca();
        j1.muovitiIndietro();

        LanciaMissili lm2 = jeegFactoryPrototype.instanceCasting(JeegComponentType.LanciaMissiliDx, LanciaMissili.class);
        Laser laser2 = jeegFactoryPrototype.instanceCasting(JeegComponentType.LaserDx, Laser.class);
        Tank t = jeegFactoryPrototype.instanceCasting(JeegComponentType.Tank, Tank.class);

        Jeeg j2 = new Jeeg(lm2, laser2, t);
        j2.muovitiInAvanti();
        j2.attacca();
        j2.muovitiIndietro();
    }
}
