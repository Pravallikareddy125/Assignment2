package Assignment2;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char [] g= {'p','r','a','v','a','l','l','i','k','a'};

for(int i=0;i<g.length;i++) {
	int count=1;
for(int j=i+1;j<g.length;j++) {
if(g[i]==g[j]) {
count++;
//System.out.println(count);
//count++;
	}
//System.out.println(count);

}
System.out.print(g[i]+":"+count+" ");
	}

}
}
