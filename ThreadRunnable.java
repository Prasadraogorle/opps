class ThreadA implements Runnable {
    String name;

    ThreadA(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " is running");
    }
}

class ThreadRunnable {
    public static void main(String[] args) {
        Thread x = new Thread(new ThreadA("Thread -x"));
        ThreadA y = new ThreadA("Thread -y");
        y.run();
        x.start();
    }
}
