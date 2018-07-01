package com.ltf.studyspringcloud.observer;

import java.util.Observable;
import java.util.Observer;

/**
  * java.util中的观察者模式
  * @author <a href="mailto:luo_tian_fu@163.com">luotianfu</a>
  * @version $Id:Observerable 2018年07月01日 13:08:32 luotianfu$
  * @since 1.0
  */
public class Observerable {
    public static void main(String[] args) {
        MyObserver observable = new MyObserver("房屋价格升高了！");
        observable.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("我接收到了消息:"+((MyObserver)o).getMsg());
            }
        });
        // 需要设置这个才能接收到消息，而setChange是protected，所以我们可以继承并重写setChanged
        observable.setChanged();
        observable.notifyObservers();
    }

    private static class MyObserver extends Observable{
        private String msg;

        public MyObserver(String msg) {
            this.msg = msg;
        }

        @Override
        public synchronized void setChanged() {
            super.setChanged();
        }

        /**
         * Gets the value of msg.
         *
         * @return the value of msg
         */
        public String getMsg() {
            return msg;
        }
    }
}
