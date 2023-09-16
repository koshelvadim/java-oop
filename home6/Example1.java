package home6;

public class Example1 {
    /**
     * Для квадрата нет смысла задавать 2 стороны, поэтому
     * должен остаться только один из методов setWidth или setHeight.
     * Но если его убрать, то при замене родительского класса на его потомка
     * потеряется возможность вызова удаленного метода, что приведет к ошибкам в программе.
     * Чтобы реализовать LSP сделаем Square базовым классом, от которого наследуется
     * Rectangle.
     * Тогда специфичные для прямоугольника методы будут реализованы только в нем.
     */
//    public class Rectangle {
    public class Rectangle extends Square {
        /**
         * Поле определено в родительском классе
         */
//        private int width;
        private int height;

        /**
         * Метод определен в родительском классе
         */
//        public void setWidth(int width) {
//            this.width = width;
//        }
        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public int area() {
            return super.width * this.height;
//            return this.width * this.height;
        }
    }
    //    public class Square extends Rectangle {
    public class Square {
        private int width;
        //        @Override
        public void setWidth(int width) {
            this.width = width;
//            super.width = width;
//            super.height = width;
        }
        public int area() {
            return this.width * this.width;
        }
        /**
         * Метод не нужен здесь совсем
         */
//        @Override
//        public void setHeight(int height) {
//            super.width = height;
//            super.height = height;
//        }
    }
}
