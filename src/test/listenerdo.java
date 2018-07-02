package test;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;

public class listenerdo implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		arg0.getServletContext().log("定时器销毁");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		arg0.getServletContext().log("定时器已启动");
		
		ScheduledExecutorService executorService=new ScheduledThreadPoolExecutor(1,
				new BasicThreadFactory.Builder().namingPattern("example-schedule-pool-%d").daemon(true).build());
			executorService.scheduleAtFixedRate(new test(), 3, 3, TimeUnit.SECONDS);
	}

	
}
