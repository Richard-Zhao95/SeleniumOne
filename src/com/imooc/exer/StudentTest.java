package com.imooc.exer;
/*
 * 4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息

提示：
1) 生成随机数：Math.random()，返回值类型double;
2) 四舍五入取整：Math.round(double d)，返回值类型long。
 *
 *
 *
 *
 */
public class StudentTest {
    public static void main(String[] args) {
        //声明Student类型的数组
        Student[] students = new Student[20];
        for(int i=0;i<students.length;i++){
            //给数组元素赋值
            students[i] = new Student();
            //给Student对象的属性赋值
            students[i].number = i+1;
            //年级：[1,6]
            //[a,b]:(int)(Math.random()*(b-a+1)+a)
            students[i].state =(int)(Math.random()*(6-1+1)+1);
            //成绩：[0,100]
            students[i].score = (int)(Math.random()*(100-0+1)+0);
        }
        //遍历学生数组
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].info());
        }
        System.out.println("**************************");
        //问题一：打印出3年级(state值为3）的学生信息。
        for(int i=0;i<students.length;i++){
            if (students[i].state ==3){
                System.out.println(students[i].info());
            }
        }
        //问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        System.out.println("**************************");
        for(int i=0;i<students.length;i++){
            for(int j=0;j<students.length-i-1;j++){
                if(students[j].score>students[j+1].score){
                    //如果需要换序，交换的是数组的元素：Student对象！！！
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        //遍历学生数组
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].info());
        }

    }


}
class Student{
    int number;
    int state;
    int score;

    public String info(){
        return "学号："+number+" 年级："+state+" 成绩:"+score;
    }
}