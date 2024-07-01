package code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_1959_두개의숫자열 {
	static int T, N, M;
	static int[] A, B;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			A = new int[N];
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			
			B = new int[M];
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<M; i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}
			
			int[] big, small;
			if(N<=M) {
				small = A;
				big = B;
			} else {
				small = B;
				big = A;
			}
			
			int max = Integer.MIN_VALUE;
			for(int i=0; i+small.length<=big.length; i++) {
				int now = 0;
				for(int j=0; j<small.length; j++) {
					now += small[j] * big[i+j];
				}
				max = Math.max(max, now);
			}
			
			
			bw.write("#"+tc+" "+max+"\n");
		}
		bw.flush();
		bw.close();
	}

}
