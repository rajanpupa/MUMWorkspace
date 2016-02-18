class in08 {

void t1() {
	return ;
}

int five() {
	return 5;
}

int square(int i) {
	return i*i;
}

string concat(string a, string b) {
	return a+b;
}

string concatN(string s, string a, int copies) {
	if (copies <= 0) {
	    return s;
	} else {
	}
	while (0 < copies) {
	    s = s + a;
	    copies = copies - 1;
	}
	return s;
}

void vectorAdd(int a[], int b[], int c[], int size) {
	int i = 0;
	while (i < size) {
	    c[i] = a[i] + b[i];
	    i = i + 1;
	}
}

void main() {
	int c = 7;
	int i;
	int j;
	string a;
	string b;

	i = 4;
	j = 7;
	a = "aaa";
	b = "bb";
	t1();
	print(five());
	print(square(i));
	print(concat(a, b));
	print(concatN(a, b, 3));
	print(concatN(a, "cd", 7));
	print(concatN("xyz", b, i));

	{
		int A[14];
		int B[14];
		int C[14];

		i = 0;
		while (i < 14) {
			A[i] = 3*i;
			B[i] = i*i;
			i = i + 1;
        	}
		i = 0;
		while (i < 14) {
			print(A[i], " ");
			i = i + 1;
		}
		print("\n");
		i = 0;
		while (i < 14) {
			print(B[i], " ");
			i = i + 1;
		}
		print("\n");
		vectorAdd(A, B, C, 14);
		i = 0;
		while (i < 14) {
			print(C[i], " ");
			i = i + 1;
		}
		print("\n");
		vectorAdd(C, B, A, 14);
		i = 0;
		while (i < 14) {
			print(A[i], " ");
			i = i + 1;
		}
		print("\n");
	}
}

}
