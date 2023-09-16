package home6;

public class Example2 {
    public class SpeedCalculation {
        public double calculateAllowedSpeed(Vehicle vehicle) {
            /**
             * Вызов метода класса вместо нескольких условий.
             */
            return vehicle.calculateAllowedSpeed();
//            if (vehicle.getType().equalsIgnoreCase("Car")) {
//                return vehicle.getMaxSpeed() * 0.8;
//            } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
//                return vehicle.getMaxSpeed() * 0.6;
//            }
//            return 0.0;
        }
    }
    public class Vehicle {
        int maxSpeed;
        String type;
        public Vehicle(int maxSpeed, String type) {
            this.maxSpeed = maxSpeed;
            this.type = type;
        }
        public int getMaxSpeed() {
            return this.maxSpeed;
        }
        public String getType() {
            return this.type;
        }

        /**
         * Расчет скорости. Если не переопределен в классах-потомках,
         * то возвращается 0
         * @return
         */
        public double calculateAllowedSpeed() {
            return 0;
        }
    }

    public class Car extends Vehicle {
        public Car(int maxSpeed, String type) {
            super(maxSpeed, type);
        }

        /**
         * Переопределение расчета скорости
         * @return
         */
        @Override
        public double calculateAllowedSpeed() {
            return super.getMaxSpeed() * 0.8;
        }
    }

    public class Bus extends Vehicle {
        public Bus(int maxSpeed, String type) {
            super(maxSpeed, type);
        }

        /**
         * Переопределение расчета скорости
         * @return
         */
        @Override
        public double calculateAllowedSpeed() {
            return super.getMaxSpeed() * 0.6;
        }
    }
}
