/*
  Test of expression syntax.
*/
class A {
    int A;
    bool B;
    char C;
    string S;
    int i;
    int j;
    int k;
    bool a;
    bool b;
    bool c;
    int ad = i + 100 - 5*j / (k/20);
    int ae = a * 4 / '6' + (3 * i - 1);
    int af = (-a + b * '3') / (c - +b);
}
class B {
    int A = -A.A;
    bool B = ! A.B;
    char C = A.C;
    string S = A.S;
    int D = +A.A;
}
