/*
 * Brutos Web MVC http://www.brutosframework.com.br/
 * Copyright (C) 2009 Afonso Brandao. (afonso.rbn@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.brandao.brutos.annotation;

import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.brandao.brutos.BrutosConstants;
import org.brandao.brutos.annotation.helper.action.app1.App1TestController;
import org.brandao.brutos.annotation.helper.action.fail.Fail2TestController;
import org.brandao.brutos.annotation.helper.action.fail.Fail3TestController;
import org.brandao.brutos.annotation.helper.action.fail.Fail4TestController;
import org.brandao.brutos.annotation.helper.action.fail.FailTestController;
import org.brandao.brutos.annotation.web.test.MockAnnotationWebApplicationContext;
import org.brandao.brutos.test.MockRenderView;
import org.brandao.brutos.web.ConfigurableWebApplicationContext;
import org.brandao.brutos.web.ContextLoader;
import org.brandao.brutos.web.test.WebApplicationContextTester;
import org.brandao.brutos.web.test.WebApplicationTester;

/**
 *
 * @author Brandao
 */
public class ActionTest extends TestCase {
    
    public void test1() throws Throwable{
        WebApplicationContextTester.run(
            "/App1Test/test1", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );

                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                }

                public void prepareRequest(Map<String, String> parameters) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    
                    MockRenderView renderView = (MockRenderView) applicationContext.getRenderView();

                    Assert.assertEquals("result", request.getAttribute(BrutosConstants.DEFAULT_RETURN_NAME));
                    Assert.assertEquals("/WEB-INF/app1test/test1action/index.jsp", renderView.getView());
                    Assert.assertEquals(BrutosConstants.DEFAULT_DISPATCHERTYPE, renderView.getDispatcherType());
                }

                public void checkException(Throwable e) {
                }
            },
            new Class[]{App1TestController.class});
    }
    
    public void test2() throws Throwable{
        WebApplicationContextTester.run(
            "/App1Test/test2", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }

                public void prepareRequest(Map<String, String> parameters) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    
                    MockRenderView renderView = (MockRenderView) applicationContext.getRenderView();

                    Assert.assertEquals("result2", request.getAttribute(BrutosConstants.DEFAULT_RETURN_NAME));
                    Assert.assertEquals("/WEB-INF/app1test/test2/index.jsp", renderView.getView());
                    Assert.assertEquals(BrutosConstants.DEFAULT_DISPATCHERTYPE, renderView.getDispatcherType());
                }
                
                public void checkException(Throwable e) {
                }
            },
            new Class[]{App1TestController.class});
    }

    public void test3() throws Throwable{
        WebApplicationContextTester.run(
            "/App1Test/test00", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }

                public void prepareRequest(Map<String, String> parameters) {
                }
                
                public void checkException(Throwable e) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    
                    MockRenderView renderView = (MockRenderView) applicationContext.getRenderView();

                    Assert.assertEquals("result3", request.getAttribute(BrutosConstants.DEFAULT_RETURN_NAME));
                    Assert.assertEquals("/WEB-INF/app1test/test3/index.jsp", renderView.getView());
                    Assert.assertEquals(BrutosConstants.DEFAULT_DISPATCHERTYPE, renderView.getDispatcherType());
                }
            },
            new Class[]{App1TestController.class});
    }

    public void test4() throws Throwable{
        WebApplicationContextTester.run(
            "/App1Test/test01", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }

                public void prepareRequest(Map<String, String> parameters) {
                }
                
                public void checkException(Throwable e) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    
                    MockRenderView renderView = (MockRenderView) applicationContext.getRenderView();

                    Assert.assertEquals("result4", request.getAttribute(BrutosConstants.DEFAULT_RETURN_NAME));
                    Assert.assertEquals("/WEB-INF/app1test/test4/index.jsp", renderView.getView());
                    Assert.assertEquals(BrutosConstants.DEFAULT_DISPATCHERTYPE, renderView.getDispatcherType());
                }
            },
            new Class[]{App1TestController.class});
    }

    public void test5() throws Throwable{
        WebApplicationContextTester.run(
            "/App1Test/test02", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }

                public void prepareRequest(Map<String, String> parameters) {
                }
                
                public void checkException(Throwable e) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    
                    MockRenderView renderView = (MockRenderView) applicationContext.getRenderView();

                    Assert.assertEquals("result4", request.getAttribute(BrutosConstants.DEFAULT_RETURN_NAME));
                    Assert.assertEquals("/WEB-INF/app1test/test4/index.jsp", renderView.getView());
                    Assert.assertEquals(BrutosConstants.DEFAULT_DISPATCHERTYPE, renderView.getDispatcherType());
                }
            },
            new Class[]{App1TestController.class});
    }

    public void test6() throws Throwable{
        WebApplicationContextTester.run(
            "/App1Test/test04", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }

                public void prepareRequest(Map<String, String> parameters) {
                }
                
                public void checkException(Throwable e) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    
                    MockRenderView renderView = (MockRenderView) applicationContext.getRenderView();

                    Assert.assertNull(request.getAttribute(BrutosConstants.DEFAULT_RETURN_NAME));
                    Assert.assertEquals("/WEB-INF/app1test/test04.jsp", renderView.getView());
                    Assert.assertEquals(BrutosConstants.DEFAULT_DISPATCHERTYPE, renderView.getDispatcherType());
                }
            },
            new Class[]{App1TestController.class});
    }

    public void test7() throws Throwable{
        WebApplicationContextTester.run(
            "/App1Test/test05", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }

                public void prepareRequest(Map<String, String> parameters) {
                }
                
                public void checkException(Throwable e) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    
                    MockRenderView renderView = (MockRenderView) applicationContext.getRenderView();

                    Assert.assertNull(request.getAttribute(BrutosConstants.DEFAULT_RETURN_NAME));
                    Assert.assertEquals("/test05.jsp", renderView.getView());
                    Assert.assertEquals(BrutosConstants.DEFAULT_DISPATCHERTYPE, renderView.getDispatcherType());
                }
            },
            new Class[]{App1TestController.class});
    }

    public void test8() throws Throwable{
        WebApplicationContextTester.run(
            "/App1Test/test06", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }

                public void prepareRequest(Map<String, String> parameters) {
                }
                
                public void checkException(Throwable e) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    
                    MockRenderView renderView = (MockRenderView) applicationContext.getRenderView();

                    Assert.assertNull(request.getAttribute(BrutosConstants.DEFAULT_RETURN_NAME));
                    Assert.assertEquals("/test06.jsp", renderView.getView());
                    Assert.assertEquals(org.brandao.brutos.DispatcherType.REDIRECT, renderView.getDispatcherType());
                }
            },
            new Class[]{App1TestController.class});
    }

    public void test9() throws Throwable{
        WebApplicationContextTester.run(
            "/App1Test/test03", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }

                public void prepareRequest(Map<String, String> parameters) {
                }
                
                public void checkException(Throwable e) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    
                    MockRenderView renderView = (MockRenderView) applicationContext.getRenderView();

                    Assert.assertNull(request.getAttribute(BrutosConstants.DEFAULT_RETURN_NAME));
                    Assert.assertEquals("/WEB-INF/app1test/test03.jsp", renderView.getView());
                    Assert.assertEquals(BrutosConstants.DEFAULT_DISPATCHERTYPE, renderView.getDispatcherType());
                }
            },
            new Class[]{App1TestController.class});
    }

    public void test10() throws Throwable{
        WebApplicationContextTester.run(
            "", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }
                
                public void checkException(Throwable e) {
                    Assert.assertNotNull(e);
                }

                public void prepareRequest(Map<String, String> parameters) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    Assert.fail();
                }
            },
            new Class[]{FailTestController.class});
    }

    public void test11() throws Throwable{
        WebApplicationContextTester.run(
            "", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }
                
                public void checkException(Throwable e) {
                    Assert.assertNotNull(e);
                }

                public void prepareRequest(Map<String, String> parameters) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    Assert.fail();
                }
            },
            new Class[]{Fail2TestController.class});
    }

    public void test12() throws Throwable{
        WebApplicationContextTester.run(
            "", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }
                
                public void checkException(Throwable e) {
                    Assert.assertNotNull(e);
                }

                public void prepareRequest(Map<String, String> parameters) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    Assert.fail();
                }
            },
            new Class[]{Fail3TestController.class});
    }

    public void test13() throws Throwable{
        WebApplicationContextTester.run(
            "", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );
                    
                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }
                
                public void checkException(Throwable e) {
                    Assert.assertNotNull(e);
                    Assert.assertEquals("invalid action id", e.getMessage());
                }

                public void prepareRequest(Map<String, String> parameters) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    Assert.fail();
                }
            },
            new Class[]{Fail4TestController.class});
    }

    public void test14() throws Throwable{
        WebApplicationContextTester.run(
            "/App1Test/test0006", 
            new WebApplicationTester(){

                public void prepareContext(Map<String, String> parameters) {
                    parameters.put(
                            ContextLoader.CONTEXT_CLASS,
                            MockAnnotationWebApplicationContext.class.getName()
                    );

                    parameters.put(
                            MockAnnotationWebApplicationContext.IGNORE_RESOURCES,
                            "true"
                    );
                    
                }

                public void prepareRequest(Map<String, String> parameters) {
                }

                public void checkResult(HttpServletRequest request, HttpServletResponse response, 
                        ServletContext context, ConfigurableWebApplicationContext applicationContext) {
                    
                    MockRenderView renderView = (MockRenderView) applicationContext.getRenderView();

                    Assert.assertEquals("result006", request.getAttribute(BrutosConstants.DEFAULT_RETURN_NAME));
                    Assert.assertEquals(BrutosConstants.DEFAULT_DISPATCHERTYPE, renderView.getDispatcherType());
                }

                public void checkException(Throwable e) throws Throwable{
                    throw e;
                }
            },
            new Class[]{App1TestController.class});
    }
    
}