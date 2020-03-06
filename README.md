"# SpringBootMybatis" 
#步骤 Record
##添加依赖
##创建SpringBoot对象
1、 public class People()  
2、 添加表内属性 & Getter&Setter
##Mapper接口
1、 public interface PeopleMapper()  
2、 添加所需操作 @Select("select * from people")  
3、 调用方法：public List<People> getAllPeople();
##MapperTest
调用getAllPeople方法