/*
  Tests the new expression syntax.  If the syntax is not 
  properly specified, this program will not parse.
*/
class in09 {
    int C;
    int B;
    int testMethod(int A) {
	// the following will not parse unless the grammar 
	// has been changed to the new precedence and associativity!!!
	if (A-2 < B+7 == B > 10 != C==B)
		B = A;
	;
    }
    
    void testMethod2(char A) {
	if (A-2 < B+7 || B > 10 && C==B || A <= C  == B > 10 != C==B)
		C = A;
    }
}

