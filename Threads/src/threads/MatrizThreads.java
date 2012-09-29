/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;
import java.util.*;

public class MatrizThreads extends Thread {
	int [][] matriz = new int [1000][1000];
	int [][] matriz2 = new int [1000][1000];
	int [][] matriz3 = new int [1000][1000];
	
	int i, j, k;
	
	long tempoinicial, tempofinal, tempo;
	
	int inicio, fim;
	
	int qual;
		
	public MatrizThreads (int inicio, int fim, int [][] matriz, int [][] matriz2, int qual) {
		this.qual = qual;
		this.inicio = inicio;
		this.fim = fim;	
		this.matriz = matriz;
		this.matriz2 = matriz2;
	}
	
	public void run () {		
		
		tempoinicial = System.currentTimeMillis ();
		for (i = inicio; i < fim; i++) {	
			for (j = inicio; j < fim; j++) {
				for (k = inicio; k < fim; k++) {				
					matriz3 [i] [j] = (matriz [j] [k] * matriz2 [k] [j]);
				}
			}	
		}		
		tempofinal = System.currentTimeMillis ();
		tempo = (tempofinal - tempoinicial);		
		System.out.println (String.format("Tempo de processamento da thread %d: %02d segundo(s) e %02d milissegundo(s)", qual, (tempo/1000), (tempo%1000)));			
	}	
	
	public static void main (String [] args) {	
		
		int iii, ff, nthreads;				
		int [][] matrizz = new int [1000][1000];
		int [][] matrizz2 = new int [1000][1000];
		int qual;		
		
		for (int i = 0; i < 1000; i++) {	
			for (int j = 0; j < 1000; j++) {	
				matrizz [i] [j] = (i + j);	
				matrizz2 [i] [j] = (i + j);	
			}	
		}		
		
		System.out.println ("Informe o número de threads:");
		Scanner num = new Scanner (System.in);
		nthreads = num.nextInt ();
		
		System.out.println ("Número de threads: " + nthreads);

		System.out.println ("Processando...");

		
		if (nthreads == 1) {
			qual = 1;
			iii = 0;
			ff = 1000;			
			MatrizThreads matriz = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
			matriz.start ();			
		}
		else {
			if (nthreads == 2) {			
				iii = 0;
				ff = 500;
				qual = 1;				
				MatrizThreads matriz = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);				
				iii = 501;
				ff = 1000;
				qual = 2;				
				MatrizThreads matriz2 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
				matriz.start ();
				matriz2.start ();				
			}
			else {
				if (nthreads == 3) {					
					iii = 0;
					ff = 300;
					qual = 1;				
					MatrizThreads matriz = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);				
					iii = 301;
					ff = 600;
					qual = 2;				
					MatrizThreads matriz2 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
					iii = 601;
					ff = 1000;
					qual = 3;				
					MatrizThreads matriz3 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
					matriz.start ();
					matriz2.start ();
					matriz3.start ();
				}
				else {
					if (nthreads == 4) {						
						iii = 0;
						ff = 250;
						qual = 1;				
						MatrizThreads matriz = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);				
						iii = 251;
						ff = 500;
						qual = 2;				
						MatrizThreads matriz2 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
						iii = 501;
						ff = 750;
						qual = 3;				
						MatrizThreads matriz3 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
						iii = 751;
						ff = 1000;
						qual = 4;				
						MatrizThreads matriz4 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
						matriz.start ();
						matriz2.start ();
						matriz3.start ();
						matriz4.start ();					
					}
					else {
						if (nthreads == 5) {			
							iii = 0;
							ff = 200;
							qual = 1;				
							MatrizThreads matriz = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);				
							iii = 201;
							ff = 400;
							qual = 2;				
							MatrizThreads matriz2 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
							iii = 401;
							ff = 600;
							qual = 3;				
							MatrizThreads matriz3 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
							iii = 601;
							ff = 800;
							qual = 4;				
							MatrizThreads matriz4 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
							iii = 801;
							ff = 1000;
							qual = 5;				
							MatrizThreads matriz5 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
							matriz.start ();
							matriz2.start ();
							matriz3.start ();
							matriz4.start ();
							matriz5.start ();
						}
						else {
							if (nthreads == 6) {								
								iii = 0;
								ff = 166;
								qual = 1;				
								MatrizThreads matriz = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);				
								iii = 167;
								ff = 333;
								qual = 2;				
								MatrizThreads matriz2 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
								iii = 334;
								ff = 500;
								qual = 3;				
								MatrizThreads matriz3 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
								iii = 501;
								ff = 667;
								qual = 4;				
								MatrizThreads matriz4 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
								iii = 668;
								ff = 833;
								qual = 5;				
								MatrizThreads matriz5 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
								iii = 834;
								ff = 1000;
								qual = 6;				
								MatrizThreads matriz6 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
								matriz.start ();
								matriz2.start ();
								matriz3.start ();
								matriz4.start ();
								matriz5.start ();
								matriz6.start ();
							}
							else {
								if (nthreads == 7) {									
									iii = 0;
									ff = 143;
									qual = 1;				
									MatrizThreads matriz = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);				
									iii = 144;
									ff = 287;
									qual = 2;				
									MatrizThreads matriz2 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
									iii = 288;
									ff = 435;
									qual = 3;				
									MatrizThreads matriz3 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
									iii = 436;
									ff = 583;
									qual = 4;				
									MatrizThreads matriz4 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
									iii = 584;
									ff = 731;
									qual = 5;				
									MatrizThreads matriz5 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
									iii = 732;
									ff = 879;
									qual = 6;				
									MatrizThreads matriz6 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
									iii = 880;
									ff = 1000;
									qual = 7;				
									MatrizThreads matriz7 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
									matriz.start ();
									matriz2.start ();
									matriz3.start ();
									matriz4.start ();
									matriz5.start ();
									matriz6.start ();
									matriz7.start ();
								}
								else {
									if (nthreads == 8) {										
										iii = 0;
										ff = 125;
										qual = 1;				
										MatrizThreads matriz = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);				
										iii = 126;
										ff = 251;
										qual = 2;				
										MatrizThreads matriz2 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
										iii = 252;
										ff = 377;
										qual = 3;				
										MatrizThreads matriz3 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
										iii = 378;
										ff = 503;
										qual = 4;				
										MatrizThreads matriz4 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
										iii = 504;
										ff = 629;
										qual = 5;				
										MatrizThreads matriz5 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
										iii = 630;
										ff = 755;
										qual = 6;				
										MatrizThreads matriz6 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
										iii = 756;
										ff = 881;
										qual = 7;				
										MatrizThreads matriz7 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
										iii = 882;
										ff = 1000;
										qual = 8;				
										MatrizThreads matriz8 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
										matriz.start ();
										matriz2.start ();
										matriz3.start ();
										matriz4.start ();
										matriz5.start ();
										matriz6.start ();
										matriz7.start ();
										matriz8.start ();
									}
									else {
										if (nthreads == 9) {											
											iii = 0;
											ff = 111;
											qual = 1;				
											MatrizThreads matriz = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);				
											iii = 112;
											ff = 223;
											qual = 2;				
											MatrizThreads matriz2 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
											iii = 224;
											ff = 335;
											qual = 3;				
											MatrizThreads matriz3 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
											iii = 336;
											ff = 447;
											qual = 4;				
											MatrizThreads matriz4 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
											iii = 448;
											ff = 559;
											qual = 5;				
											MatrizThreads matriz5 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
											iii = 560;
											ff = 674;
											qual = 6;				
											MatrizThreads matriz6 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
											iii = 672;
											ff = 783;
											qual = 7;				
											MatrizThreads matriz7 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
											iii = 784;
											ff = 895;
											qual = 8;				
											MatrizThreads matriz8 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
											iii = 896;
											ff = 1000;
											qual = 9;				
											MatrizThreads matriz9 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
											matriz.start ();
											matriz2.start ();
											matriz3.start ();
											matriz4.start ();
											matriz5.start ();
											matriz6.start ();
											matriz7.start ();
											matriz8.start ();
											matriz9.start ();
										}
										else {
											if (nthreads == 10) {												
												iii = 0;
												ff = 100;
												qual = 1;				
												MatrizThreads matriz = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);				
												iii = 101;
												ff = 201;
												qual = 2;				
												MatrizThreads matriz2 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
												iii = 202;
												ff = 302;
												qual = 3;				
												MatrizThreads matriz3 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
												iii = 303;
												ff = 403;
												qual = 4;				
												MatrizThreads matriz4 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
												iii = 404;
												ff = 504;
												qual = 5;				
												MatrizThreads matriz5 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
												iii = 505;
												ff = 605;
												qual = 6;				
												MatrizThreads matriz6 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
												iii = 606;
												ff = 706;
												qual = 7;				
												MatrizThreads matriz7 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
												iii = 707;
												ff = 807;
												qual = 8;				
												MatrizThreads matriz8 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
												iii = 808;
												ff = 908;
												qual = 9;				
												MatrizThreads matriz9 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
												iii = 909;
												ff = 1000;
												qual = 10;				
												MatrizThreads matriz10 = new MatrizThreads (iii, ff, matrizz, matrizz2, qual);
												matriz.start ();
												matriz2.start ();
												matriz3.start ();
												matriz4.start ();
												matriz5.start ();
												matriz6.start ();
												matriz7.start ();
												matriz8.start ();
												matriz9.start ();
												matriz10.start ();												
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}		
	}
}