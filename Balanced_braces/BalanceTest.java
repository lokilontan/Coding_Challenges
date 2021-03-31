package core;

public class BalanceTest {
	
	public static void main(String[] args) {
		Balance b = new Balance();
		if (b.isBalanced("{}[]()")) System.out.println("1Balanced"); else System.out.println("1Not balanced");
		if (b.isBalanced("{[]()}")) System.out.println("2Balanced");else System.out.println("2Not balanced");
		if (b.isBalanced("{[](})")) System.out.println("3Balanced");else System.out.println("3Not balanced");
		if (b.isBalanced("({[]})(")) System.out.println("4Balanced");else System.out.println("4Not balanced");
		if (b.isBalanced("({[]}))")) System.out.println("5Balanced");else System.out.println("5Not balanced");
		if (b.isBalanced("({[(()())]})")) System.out.println("6Balanced");else System.out.println("6Not balanced");
		if (b.isBalanced("((((((((((((())))")) System.out.println("7Balanced");else System.out.println("7Not balanced");
		if (b.isBalanced(")))))))))((((((")) System.out.println("8Balanced");else System.out.println("8Not balanced");
		if (b.isBalanced("(((())))))))))")) System.out.println("9Balanced");else System.out.println("9Not balanced");
		if (b.isBalanced("(((())))")) System.out.println("9Balanced");else System.out.println("9Not balanced");
		if (b.isBalanced("(()(()))()")) System.out.println("9Balanced");else System.out.println("9Not balanced");
	}

}
