public int mystery(int a, int b) {
    // If b is 1, the method returns a. This is the termination condition for the recursion.

    if (b == 1) {
        return a;
    } 
    // If b is not 1, the method returns a plus the result of mystery(a, b - 1).
    // This effectively reduces the problem by decreasing b by 1 in each recursive call and adding a each time until b becomes 1.
    else {
        return a + mystery(a, b - 1);
    }
}
