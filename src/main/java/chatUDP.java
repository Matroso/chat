public class chatUDP {
    private class theReceiver extends Thread{
        @Override
        public synchronized void start() {
            super.start();
            System.out.println("hello from thread");
        }
    }

    private void antistatic(){
        System.out.println("hi");
        new theReceiver().start();
    }

    public static void main(String[] args) {
        new chatUDP().antistatic();
    }
}
