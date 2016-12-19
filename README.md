#QuickOrder项目的说明
#QuickOrder项目：
#•	主要是用户通过预订桌号、还有时间，在查看菜单进行点菜，然后根据用户点餐可以进行结算，跟传统的做法相比减少了人力，也合理地利用了资源。
#QuickOrder项目主要完成的功能：
#•	首次使用的用户需要注册，然后登陆，有记住账号功能；
#•	进入主界面，进入主菜单；
#•	然后根据预定桌号，还有时间；
#•	顾客点菜
#•	最后根据用户点餐可以进行结算；
#QuickOrder项目的部署
#开发环境
#•	JDK1.7+
#•	Java ADT
#•	Android Stuido
#安装
#•	JDK1.7+
#•	Java ADT
#•	Android Stuido
#安装与配置教程
#下载软件
n JDK 1.7+   到  http://java.sun.com/javase/downloads/index.jsp 下载

n Eclipse 4.3(Europa) 到  http://www.eclipse.org/downloads/ 下载 

n Android SDK 到  http://developer.android.com/sdk/1.5_r1/index.html 下载


2  安装软件和配置环境
2.1  安装JDK
下载好的JDK是一个可执行安装程序，双击安装。假设安装路径为：C:/Program Files/Java/jdk1.7.0_05（当然其他路径也可以）。 

JDK安装完成之后要设置系统环境变量： 我的电脑点右键，选择“属性”，选择“高级”标签，进入环境变量设置。环境变量设置，分别设置三个环境变量：JAVA_HOME、path变量、classpath变量。

2.1.1  设置JAVA_HOME
在系统环境变量那一栏中点->新建JAVA_HOME （JAVA_HOME指向的是JDK的安装路径）。  变量名： JAVA_HOME；变量值： C:/Program Files/Java/jdk1.7.0_05

设置JAVA_HOME量的目的：

l 为了方便引用，比如，JDK安装C:/Program Files/Java/jdk1.6.0_05目录里，则设置JAVA_HOME为该目录路径, 那么以后要使用这个路径的时候, 只需输入%JAVA_HOME%即可, 避免每次引用都输入很长的路径串;

l 归一原则, 当JDK路径改变的时候, 仅需更改JAVA_HOME的变量值即可, 否则,就要更改任何用绝对路径引用JDK目录的文档, 要是万一没有改全, 某个程序找不到JDK, 后果是可想而知的----系统崩溃!

l 第三方软件会引用约定好的JAVA_HOME变量, 不然, 你不能正常使用该软件.

2.1.2  设置path变量
在系统变量里找到path变量,选择->编辑；(里面已经有很多的变量值,是在变量值的最前面或其他位置加上%JAVA_HOME%/bin;)。变量名:path ；变量值:   %JAVA_HOME%/bin; 

目的：使得我们能够在系统中的任何地方运行java应用程序，比如javac、java、javah等,这就要找到我们安装JDK的目录，比如我们的JDK安装在C:/Program Files/Java/jdk1.6.0_05目录下,那么在C:/Program Files/Java/jdk1.6.0_05/bin目录下就是我们常用的java应用程序,我们就需要把C:/jdk1.6.0/bin这个目录加到path环境变量里面。

2.1.3  设置classpath环境
在系统环境变量那一栏中点->新建classpath。变量名: classpath ；变量值:.;%JAVA_HOME%/lib/;%JAVA_HOME%/jre/lib/（注意，CLASSPATH最前面是有个“.”的，表示当前目录，这样当我们运行java AClass的时候，系统就会先在当前目录寻找AClass文件了。）


2.1.4  JDK环境测试
配置完成下面写一个简单的java程式来测试J2SDK是否已安装成功：

public class HelloWorld{ 

       public static void main(String[] args){ 

           System.out.println("Hello world!"); 

         } 

} 

将程式保存为文档名为HelloWorld.java的文档。 打开命令提示符窗口，进入到HelloWorld.java所在目录，键入下面的命令：

javac HelloWorld.java

java HelloWorld


2.2  安装Eclipse
将下载的Eclipse压缩包解压到相应的安装目录即可。
如果对Eclipse的下载以及ADT不是很了解，那么还有一个方法，在别人下载下来配置好之后，只要自己的jdk版本是1.7以上，那么你就可以直接把整个文件夹拉过来就可以使用了
