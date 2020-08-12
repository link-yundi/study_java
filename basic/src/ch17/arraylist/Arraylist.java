package ch17.arraylist;

/*
ArrayList：标准java数组的长度是固定的，它们在创建之后不能扩展或缩小
ArrayList使用初始大小创建，但是当超过这个大小时，集合会自动增大
当对象被删除时，ArrayList可能会缩小。
当你需要快速访问数据时，请使用ArrayList；当需要进行大量的插入和删除操作时，请使用LinkedList
 */

import java.util.ArrayList;

public class Arraylist {
    ArrayList colors = new ArrayList();
    ArrayList<String> colors2 = new ArrayList<String>(5);
}
