package Java并发编程基础;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MultiThread {
    public static void main(String[] args) {
        MultiThread multiThread = new MultiThread();
        multiThread.findThread();
    }

    void findThread(){
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        for(ThreadInfo threadInfo:threadInfos){
            System.out.println("["+threadInfo.getThreadId()+"] "+threadInfo.getThreadName() + " LockName:" + threadInfo.getLockName() + " ");
        }
    }
}
