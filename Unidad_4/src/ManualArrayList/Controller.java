package ManualArrayList;

@FunctionalInterface //Interfaz que cuenta con solo un metodo
public interface Controller {
    void execute();
}

/*
Formas de impklementar una interfaz:
 1. "implements"
    class A implements I {
    @Override
    public void ...{
        }
    }
    I obj = new A();

2. Clase anonima
    I obj = new I();{
    @Override
    public void ...{
        }
    }

3. Expresion lambda
    I obj = (i) -> {
        }

4. Referencias a metodos
    public void doSomething(int i){
        }
    I obj = this::doSomething;
    I obj2 = obj::doSomehting;
    I obj3 = Class::doSomething;
 */
