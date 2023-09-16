package home6;

public class Example3 {
    /**
     * Добавляется интерфейс и теперь класс Car зависит от этого интерфейса,
     * а класс PetrolEngine имлементирует его и реализует необходимые методы.
     */
    public interface IEngine {
        public void start();
    }
    public class Car {
        private IEngine engine;
        public Car(IEngine engine) {
            this.engine = engine;
        }
        public void start() {
            this.engine.start();
        }
    }
    public class PetrolEngine implements IEngine{
        public void start() {
        }
    }
}
