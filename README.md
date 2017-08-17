
# Struts2
Struts2学习code（小锋教学）

第一节 ：Struts2  简介
-------------
主页：http://struts.apache.org/
在用户请求和模块化处理方面以及页面的展现这块，Struts2 发挥的屌炸天作用；
相对于传统的 Jsp+Servlet 模式，Struts2 更适合企业级团队开发，方便系统的维护；

第二节 ：Struts2 HelloWorld
-------------------
``````xml
<filter>
<filter-name>Struts2</filter-name>
<filter-class>
org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter
</filter-class>
</filter>
<filter-mapping>
<filter-name>Struts2</filter-name>
<url-pattern>/*</url-pattern>
</filter-mapping>
`````````
核心控制器


第三节 ：Struts2 原理
-------------------
![image](https://github.com/zhonglunsheng/Struts2/blob/master/struts2原理图.jpg)

* 1.客户端（Client）向Action发用一个请求（Request）

* 2.Container通过web.xml映射请求，并获得控制器（Controller）的名字

* 3.容器（Container）调用控制器（StrutsPrepareAndExecuteFilter或FilterDispatcher）。在Struts2.1以前调用FilterDispatcher，Struts2.1以后调用StrutsPrepareAndExecuteFilter

* 4.控制器（Controller）通过ActionMapper获得Action的信息

* 5.控制器（Controller）调用ActionProxy

* 6.ActionProxy读取struts.xml文件获取action和interceptor stack的信息。

* 7.ActionProxy把request请求传递给ActionInvocation

* 8.ActionInvocation依次调用action和interceptor

* 9.根据action的配置信息，产生result

* 10.Result信息返回给ActionInvocation

* 11.产生一个HttpServletResponse响应

* 12.产生的响应行为发送给客服端。

第四节 ：Struts2  处理传入多个值
-------------
* 1，处理数目不定的字符串；
* 2，处理数目不定的 JavaBean 对象；

第五节 ：struts.xml  配置
------------
* 一，pageckage 配置

    name 包名

    extends 继承

    namespace 包命名空间

    abstract 抽象包

* 二，action 配置
    name action 名

    class 处理类

    method 方法

* 三，分模块配置方法
    <include file="" ></include>

* 四，使用通配符

第六节：动态方法调用
-----------
开启动态方法调用：
````xml
<constant name="struts.enable.DynamicMethodInvocation" value="true" />
````
第七节 ：Action 生命周期
--------------
第八节 ：result  配置
------------
* 1，type 默认是 dispatcher 内部转发；
* 2，type 为 redirect 重定向；
* 3，type 为 chain 链条；
* 4，type 为 redirectAction 重定向到 action；
* 5.result 全局配置
上面 4 个常用，一定要掌握；
其他 freemarker freemarker 模版
httpheader 返回一个已配置好的 HTTP 头信息响应
stream 将原始数据作为流传递回浏览器端，
velocity 呈现 Velocity 模板
xslt 该 XML 可以通过 XSL 模板进行转换
plaintext 返回普通文本类容

第三章 Struts2
=========
第一节 ：拦截器简介
-------
第二节 ：Struts2  预定义拦截器& 拦截器栈
---------
第三节 ：自定义拦截器简单实例一
-----------
第四节 ：自定义拦截器- 登录验证拦截器
-------------
Struts2 拦截器是在访问某个 Action 或 Action 的某个方法，字段之前或之后实施拦截，并且 Struts2 拦截器是可
插拔的，拦截器是ＡＯＰ的一种实现．
优点：通用功能的封装，提供了可重用性；

第四章 值栈与 OGNL
============
第一节：值栈简介
-----------
值栈是对应每个请求对象的一套内存数据的封装，Struts2 会给每个请求创建一个新的值栈。
值栈能够线程安全地为每个请求提供公共的数据存取服务。
第二节 ：OGNL  引入
-----------
OGNL 是对象图导航语言 Object-Graph Navigation Language 的缩写，它是一种功能强大的表达式语言。


OGNL 访问 ValueStack 数据

`````xml
<s:property value=”account” />
```````

OGNL 访问 ActionContext 数据

访问某个范围下的数据要用#
#parameters 请求参数 request.getParameter(...)；


#request 请求作用域中的数据 request.getAttribute(...)；


#session 会话作用域中的数据 session.getAttribute(...)；


#application 应用程序作用域中的数据 application.getAttribute(...)；


#attr 按照 page request session application 顺序查找值
第三节 ：OGNL  访问复杂对象
------------
* 1，访问 javaBean 对象；
* 2，访问集合对象；
* 3，访问 Map 对象；
* 1，访问静态属性；
* 2，访问静态方法；
`````xml
<constant name="struts.ognl.allowStaticMethodAccess" value="true"></constant>
```````
第四节 ：OGNL  访问静态方法和属性
--------------
* 1，访问静态属性；
* 2，访问静态方法；<constant name="struts.ognl.allowStaticMethodAccess" value="true"></constant>


第五章 Struts2  标签
==============
第一节 ：Struts2  标签简介
----------
Struts2 自己封装了一套标签，比 JSTL 强大，而且与 Struts2 中的其他功能无缝结合。
当然 Strust2 标签的内容很多，随着版本的升级，标签和属性越来越多。我们要掌握好核心标签及了解其他标签；
根据功能可以分为：数据标签，控制标签，界面标签，其他标签；
第二节 ：Struts2  数据标签
Property 标签：输出 OGNL 表达式的值；


Set 标签：设置变量；


Bean 标签：定义 javaBean 对象；


Date 标签：日期标签；


Debug 标签：调试标签；


Url&a 标签：超链接标签；


Include 标签：动态包含标签；


第三节 ：Struts2  控制标签
-----------------
Ifelse 标签：条件判断标签；


Iterator 标签：遍历标签；


Append 标签：叠加标签；


Generator 标签：分隔标签；


Merge 标签：组合标签；


Sort 标签：排序标签；


Subset 标签：截取标签

第四节 ：Strut2  界面标签
-----------------
Form 标签：表单提交标签；


Text 标签：文本标签；


Radios 标签：单选标签；


Checkboxlist 标签：复选框标签；


Select 标签：下拉框标签；

第五节 ：其他标签
--------------
Updownselect 标签；


Optiontransferselect 标签

第六章 Struts2  国际化
==============
第一节 ：国际化简介
------------------
国际化（Internationlization），通俗地讲，就是让软件实现对多种语言的支持；

第二节 ：Struts2  国际化设置
---------------
````xml
<constant name="struts.custom.i18n.resources" value="java1234"></constant>
<s:text name=""></s:text> 访问国际化资源
``````

第七章 Struts2  验证框架
===============
第一节 ：Struts2  验证简介
----------
Struts2 基于 Struts2 拦截器，为开发者提供了一套易用的验证框架，并可扩展；一般的验证都支持；
第二节 ：Struts2  内置验证
----------------------
一，普通字段验证；
二，验证表达式；
<s:actionerror/>

第三节 ：自定义验证
------------------


第八章 Struts2  文件上传和下载
==================
第一节 ：Struts2  文件上传
----------------
Struts2 文件上传基于 Struts2 拦截器实现；


Struts2 文件上传使用的是 fileupload 组件；


Form 配置 enctype="multipart/form-data"；


Struts2 获取上传文件：name (name 是文件表单的 name)


Struts2 获取上传文件名：name+FileName；


Struts2 获取上传文件的类型：name+ContentType；

第二节 ：配置文件的大小及类型
---------------
````xml
<param name="allowedTypes">image/bmp,image/x-png,image/gif,image/jpg,image/jpeg</param>
<param name="maximumSize">81101</param>
<s:fielderror></s:fielderror>
`````
第三节 ：大文件上传
-------------------
Struts2 文件上传大小默认是 2M；
````xml
<constant name="struts.multipart.maxSize" value="20000000"></constant>
`````
第四节 ：多文件上传
--------------------
第五节 ：Struts2  文件下载
--------------------
返回的是文件流
`````xml
<param name="contentDisposition">attachment;filename=${fileName}</param>
InputStream getInputStream()
``````





