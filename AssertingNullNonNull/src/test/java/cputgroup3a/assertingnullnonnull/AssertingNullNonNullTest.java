/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.assertingnullnonnull;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import cputgroup3a.assertingnullnonnull.configuration.AppConfig;
import cputgroup3a.assertingnullnonnull.service.AssertingNullNonNull;
import cputgroup3a.assertingnullnonnull.service.Impl.AssertingNullNonNullImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

/**
 *
 * @author kurvin
 */
public class AssertingNullNonNullTest {
    
    public AssertingNullNonNullTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    public static AssertingNullNonNull obj;
    
    @Test
    public static void testSendObject(){
        Assert.assertNull(obj.sendObj());
    }
    
    @Test
    public static void testSendData(){
        Assert.assertNotNull(obj.sendDataObj());
    }
    
    @Test
    public static void testSendMsg(){
        Assert.assertNotNull(obj.sendMsg(), "Contents of String varibale are: " + obj.sendMsg());
    }
    
    @Test
    public static void testSendLetter(){
        Assert.assertNotNull(obj.sendLetter(), "The contents of the letter object are:" + obj.sendLetter());
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        obj = (AssertingNullNonNull) ctx.getBean("Ann");
    }
    

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
