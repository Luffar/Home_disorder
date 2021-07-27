public class Flyer {

    EngineFly engineFly;

    public static void main(String[] args) {
        Flyer flyer = new Flyer();
        flyer.engineFly.startEngine();
        flyer.engineFly.stopEngine();
    }
   public class EngineFly {
        private boolean isFlying;
        public void startEngine() {
            isFlying = true;
        }
        public void stopEngine(){
            isFlying = false;
        }

    }
}
