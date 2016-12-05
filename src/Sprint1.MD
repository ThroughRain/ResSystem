#团队名：ThroughRain
#项目确定：《餐厅到店点餐系统》
#项目背景：本次项目是专门为餐厅开发的一套订餐系统。大家有没有发现在节假日去餐厅吃饭会超级麻烦，人很多，
热门的餐厅基本没有座位，我们需要在外面苦苦等待，不仅顾客烦恼，餐厅管理者也觉得很烦，因为这样会影响顾客
用餐体验，带来不好的口碑。本产品能够合理化安排餐厅的工作，从顾客进入餐厅点餐到用餐结束，提供一套全面，
方便，高效的服务，提高餐厅的管理效率，给用户带好良好的用餐体验，这也是我们开发这个项目的目的。
#项目分工：
#1.产品负责人：容杰，主要负责构思产品的功能，开发的内容。
#2.项目经理：王大华，领导，监督，带领团队完成工作。
#3.用户体验：冯梓凡，我们开发产品的目的是给客户使用，充当一名使用者，反馈产品的信息
#4.master:梁仕标，保证团队按计划，有安排完成任务
#第一次冲刺时间：
# 11月14-11月23
#第一次冲刺目标及分配：
#1.注册登录界面            认领：王大华
#2.界面跳转                  认领：梁仕标
#3.点餐界面                  认领：冯梓凡
#4.付款界面                  认领：容杰
#5.管理界面                  认领：冯梓凡
#燃尽图：
#项目界面：
#1.登录界面：
 
 
 
#主界面为比较常规的，需要注册以及登录，这样比较方便管理，用户可以查看一些记录的功能
 
 
 
#2.主界面：
 
#这个界面可以看到我们点餐系统的所有功能，用户可以选择自己需要的功能进行点击
 
 
#3.订座界面
 
#这个界面可以看到是否还有座位，以及确定自己订座的一些信息
 
 
 
#4.菜单界面
 
#这个功能可以让用户提前点好喜欢的菜，到餐厅后可以直接上菜，免去等待时间
 
 
#5.餐厅销量界面
 
#这可以让用户看到那些菜品比较热销，提供参考


#6.付款界面
 
#本界面可以让用户直接网上支付餐费，提供了多种支付方式
 
 
#部分代码：
#主界面MainActivity：
#Button button1,button2,button3,button4,button5;
#@Override
#protected void onCreate(Bundle savedInstanceState) {
#super.onCreate(savedInstanceState);
#setContentView(R.layout.activity_main);
#button1=(Button)findViewById(R.id.serve);

#button2=(Button)findViewById(R.id.caidan);

#button3=(Button)findViewById(R.id.tongji);

#button4=(Button)findViewById(R.id.pay);

#button4.setOnClickListener(new OnClickListener() {

#@Override
#public void onClick(View arg0) {
#// TODO Auto-generated method stub
#Intent intent=new Intent();
#intent.setClass(MainActivity.this, Pay.class);
#startActivity(intent);

#}
#});

#button3.setOnClickListener(new OnClickListener() {

#@Override
#public void onClick(View arg0) {
#// TODO Auto-generated method stub
#Intent intent=new Intent();
#intent.setClass(MainActivity.this, Tongji.class);
#startActivity(intent);
#}
#});
#button1.setOnClickListener(new OnClickListener() {

#@Override
#public void onClick(View arg0) {
#// TODO Auto-generated method stub
#Intent intent=new Intent();
#intent.setClass(MainActivity.this, Serve.class);
#startActivity(intent); 

#}
#});

#button2.setOnClickListener(new OnClickListener() {

#@Override
#public void onClick(View arg0) {
#Intent intent =new Intent();
#intent.setClass(MainActivity.this,Caidan.class);
#startActivity(intent);
#}
#});
#}
#这部分代码实现了比较核心的功能，界面的跳转等。
 
#总结：
#   在第一次冲刺中，团队完成了点餐系统的基本架构，实现了各个页面的跳转，理清楚了APP的各项功能该如何实现和分布，具体的功能实现以及后续的部分需要在下两次的冲刺中完成，现在的部分还有所欠缺，但我们会继续努力，完成好的。
 


