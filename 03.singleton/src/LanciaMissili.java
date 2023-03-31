public class LanciaMissili extends Arm {

    public LanciaMissili(String sideLabel) {
        super(sideLabel);
    }

    public void attacca(){
        System.out.println("Lancio un missile con il braccio " + this.sideLabel);
    }

}
