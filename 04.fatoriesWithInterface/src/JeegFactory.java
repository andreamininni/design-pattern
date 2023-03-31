public abstract class JeegFactory {
    //! ritorneà gli oggetti con cui creerò Jeeg
    abstract Object instance(JeegComponentType componentType);
    abstract <T> T instanceCasting(JeegComponentType componentType, Class<T> classType);
}
