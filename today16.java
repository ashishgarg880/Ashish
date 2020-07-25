import java.io.*;
import java.util.*;
class Chess_board
{
	Scanner sc= new Scanner(System.in);
	void Chess()
	{
		int k;
		k=sc.nextInt();
		char[][] a;
		a=new char[8][8];
		for (int i=0;i<8;i++) 
		{
			for (int j=0;j<8;j++) 
			{
				if (k>0) 
				{
					if (i==0 && j==0)
					{
						a[i][j]='O';
					}
					else
					{
						a[i][j]='X';
					}
					System.out.print(a[i][j]);
				}
				System.out.print("\n");
			}
		}
	}	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Chess_board c1 = new Chess_board();
		int t;
		t=sc.nextInt();	
		while(t-->1)
		{
			c1.Chess();
		}	
	}
}

 class Coding {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Palindrome solver = new Palindrome();

        int t = 1;
        t = in.nextInt();
//
        for (int i = 0; i < t; i++) {
            solver.solve(i + 1, in, out);
        }

        out.close();
    }

    static class Palindrome {
        static long mod = 1000000007;
        static long maxX = (long) 1e18;
        static long mod2 = 998244353;

        //  Check for boundary Condition because you are not Sehwag..
        //  For multiple Test cases take all input -> do not use return while taking input.
        //  at least check constraint for once it can be done in nested loops.
        // Think simple and short
        //  check for proof of solution
        //  Read editorial after contest.....

        void solve(int testNumber, ScanReader in, PrintWriter out) {
            int k = in.nextInt();

            int[][] a = new int[8][8];

            a[0][0] = 3;--k;

            for(int i = 0;i<8;i++) {
                for(int j = 0;j<8;j++) {
                    if(i==0 && j==0) {
                        continue;
                    }

                    if(k>0) {
                        k--;
                        a[i][j] = 3;
                    }
                }
            }

            int dx[] = {-1,0,1,1,1,0,-1,-1};
            int dy[] = {-1,-1,-1,0,1,1,1,0};

            for(int i = 0;i<8;i++) {
                for(int j = 0;j<8;j++) {

                    if(a[i][j] != 3) {
                        for(int aa = 0;aa<8;aa++) {
                            int xx = i + dx[aa];
                            int yy = j + dy[aa];

                            if(xx>= 0 && xx<8 && yy>=0 && yy<8) {
                                if(a[xx][yy] == 3) {
                                    a[i][j] = 2;
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            for(int i  = 0;i<8;i++) {
                for(int j = 0;j<8;j++) {
                    if(i==0 && j==0) {
                        out.print("O");
                        continue;
                    }

                    if(a[i][j] == 2) {
                        out.print("X");
                    } else {
                        out.print(".");
                    }
                }
                out.println();
            }

            out.println();


        }
    }

    static class ScanReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public ScanReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}
	
