第十章: 树项目
edu.colorado.ch10.heap

平衡二叉树
	当且仅当两个子树的高度差不超过1时，这个树是平衡二叉树。(同时是排序二叉树) 
完全二叉树
	二叉树的所有子树要么没有孩子，要么一定有左孩子
	若设二叉树的高度为h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h 层从右向左连续缺若干结点，这就是完全二叉树。 
满二叉树
	一棵深度为k，且有2的(k)次方－1个节点的二叉树 特点：每一层上的结点数都是最大结点数
堆是一棵遵守以下2条规则的二叉树
	1. 每个结点的元素值必须大于等于该结点孩子结点的元素值
	2. 堆是一棵完全二叉树
向堆中插入元素
	向上重排
从堆中删除元素
	向下重排
	与较大的孩子结点进行交换,而不管左右 
不平衡树
B树
	1. B树孩子结点可以大于2
	2. 每个结点可以包含多个元素
B树规则:
	1. 根结点最多只可以包含1个元素,其他结点必须包含至少MINIMUM元素
	2. 结点包含元素个数最大值是MINIMUM的两倍
	3. B树的每个结点元素按从小到大顺序存储在数组中
	4. 非叶子结点的子树数目比该结点元素的数目大1
	5. 对于任何非叶子结点
		1) 某结点的i号元素比该结点的i号子树的任何元素都大
		2) 某结点的i号元素比该结点的i+1号子树的任何元素都小
	6. B树中的叶子有相同的深度

B树的叶子结点深度不会太深
B树的集合类
IntBalancedSet
	需要自己实现
	
java对树的支持
	javax.swing.tree.DefaultMutableTreeNode
	TreeExample
	
树,日志和时间复杂度分析