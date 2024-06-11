package sp.com.SpringMavenWithAnnotJavaConfig.main;

import org.springframework.context.ApplicationContext ;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sp.JavaConfig.JavaConfig;
import com.sp.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	Student std=(Student) context.getBean("stdObj");
    	std.Display();
    }
}
