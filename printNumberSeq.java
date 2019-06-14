package PracticeCoding;

public class printNumberSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=0;
// 0=0x10+1=1
// 1=1x10+2=12
// 12x10+3+123
// 123x10+4=1234
// 1234+10+5=12345
for(int i =1;i<=4;i++) {
	a=a*10+i;
	System.out.print(a+" ");
}
	}

}
