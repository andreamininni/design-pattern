public class App {
    public static void main(String[] args) throws Exception {
        //! Factory
        //! una classe che, in base a dei parametri, ritorna un oggetto.

        // LanciaMissili lm = new LanciaMissili("Destro");
        // Laser laser = new Laser("Sinistro");
        // Legs legs = new Legs();
        //* UTILIZZO LA FACToRY */
        //! ho creato una classe che implementa una funzione instance
        //! istanzia un oggetto di una classe
        //! io devo indicare di quale class voglio un oggetto
        //! alla funzione passo una stringa in base a cui seleziono l'oggetto

        //! questa funzione ritorna un oggetto do classe Object
        //! ad un oggetto di classe Lnaciamissili non posso assegnare un oggetto di classe Object, quindi devo castarlo
        JeegFactory factory = new JeegFactory();
        LanciaMissili lm = (LanciaMissili) factory.instance(JeegComponentType.LanciaMissiliDx);
        Laser laser = (Laser) factory.instance(JeegComponentType.LaserDx);
        Legs legs = (Legs) factory.instance(JeegComponentType.Legs);
        Jeeg j1 = new Jeeg(lm, laser, legs);
        j1.muovitiInAvanti();
        j1.attacca();
        j1.muovitiIndietro();
    }
}
