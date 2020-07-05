package com.vinspier.ioc;

import com.vinspier.ioc.controller.IocController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IocApplicationTest {

    @Test
    public void testBeanFactory(){
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("customizeBeanFactory.xml"));
        IocController controller = (IocController)factory.getBean("iocController");
        controller.print();
    }

}