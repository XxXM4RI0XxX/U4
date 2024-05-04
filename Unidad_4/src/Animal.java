/*
CLASE ASBTRACTA
- Metodos abstractos
- Metodos concretos (normales)
- Atributos "normales" (publicos, privates,etc)

INTERFAZ
- Todos los metodos son abtractos, no existen metodos concretos
- Atributos, pero todos SIEMPRE son STATIC y FINAL
-> Toda clase que implemente una interfaz tiene que forzozamente utilizar todos los metodos de la interfaz
 */
public interface Animal {

    int edad = 10; // Siempre toda variable va inicializada
    public void comer();

    public void hablar();//Estos dos metodos ya son abstractos por el siemple
    // hecho de estar dentro de la interfaz, siempre van vacios

}
