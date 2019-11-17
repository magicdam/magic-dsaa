# magic-dsaa
JAVA的数据结构和算法库(dsaa=Data Structures and Algorithms)

## 排序算法(升序)
包含冒泡排序、插入排序、选择排序、堆排序、归并排序、快速排序。  
可直接用于byte、char、short、int、long、各种封装类型、List的排序。  
示例：  
int array[]={3,2,1};  
Sort sort=Sort.getBubbleSort();  
sort.sort(array);  
System.out.println(Arrays.toString(array));  
