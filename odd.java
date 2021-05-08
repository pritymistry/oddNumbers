class odd{
	public static void main(String args[]){
	int a[]= new int[10];
		for(int i=0; i<args.length; i++){
			a[i]=Integer.parseInt(args[i]);
		}
		for(int i=0; i<args.length; i++){
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
	}
}