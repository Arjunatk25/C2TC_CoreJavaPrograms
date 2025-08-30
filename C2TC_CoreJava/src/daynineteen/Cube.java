//Program to demonstrate Functional Interface

package daynineteen;

@FunctionalInterface
interface Cube {
	int calculate(int a); // only one abstract method
	//int sqr(int n);
}