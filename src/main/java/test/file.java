package test;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: zhen
 * @DateTime: 2021/3/20 16:40
 * @Description: TODO
 */
public class file {
    public static Integer num = 0;

    public static void main(String[] args) {
        String fileName = "H:\\imooc\\金职位_Java工程师2020版[完结]\\阶段1：Java零基础入门\\第3周 面向对象之封装与继承";
        File file = new File(fileName);
        findFile(file);
        System.out.println(num);

    }

    private static void findFile(File file) {
        if (file.isDirectory()) {
            for (int i = 0; i < file.listFiles().length; i++) {
                findFile(file.listFiles()[i]);
            }
        } else {
            raolaceName(file);
        }
    }


    private static void raolaceName(File file) {
        String name = file.getName();
        if (name.contains("(2).")) {
            num++;
        } else {
            return;
        }
        System.out.println(name);
         String newName= name.replace("(2).",".");

        /*newName= newName.replace("(更多IT教程 微信352852792)","");

        newName= newName.replace("【更多IT教程 微信352852792】","");*/
/*
        newName= newName.replace("[QQ微信352852792]","");
        newName= newName.replace("_[QQ微信352852792]","");
        newName= newName.replace("-更多IT资源加微信2268731更多IT资源加微信2268731","");
        newName= newName.replace("【优质it资源微信2268731】","");
        newName= newName.replace("_ubkz.com免费IT资源请加微信2268731","");
        newName= newName.replace("更多IT资源加微信2268731更多IT资源加微信2268731","");
        newName= newName.replace("【瑞客论坛 www.ruike1.com】","");
        newName= newName.replace("【网课精灵liudafan.com】","");
        newName= newName.replace("_IT视频学习网【www.itspxx.com】","");
        newName= newName.replace("-更多IT资源微信 352852792","");*/

        /*      newName= newName.replace(" _更多IT资源微信 352852792","");*/
        /*   newName= newName.replace("_免费IT资源加微信2268731","");*/

        //  System.out.println(newName);
      System.out.println(newName);
        rename(file,newName);
       // delefilFile(file);
    }

    public static boolean rename(final File file, final String newName) {
        // file is null then return false
        if (file == null) {
            return false;
        }
        // file doesn't exist then return false
        if (!file.exists()) {
            return false;
        }
        // the new name is space then return false}
        if (newName.equals(file.getName())) {
            return true;
        }
        File newFile = new File(file.getParent() + File.separator + newName);
        // the new name of file exists then return false
        return !newFile.exists()
                && file.renameTo(newFile);

    }

    public static void delefilFile(File file) {
        file.delete();
    }

    public static void addString(String str) {

        return;
    }
}
