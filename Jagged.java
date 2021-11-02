class Multi
{
	public static void main(String arg[])
	{
		int arr[][] = new int [3][2];


		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;

		System.out.println(arr[0][0]);		// 10
		System.out.println(arr[2][1]);		// 60
		System.out.println(arr.length);		// 3
		System.out.println(arr[0].length);	// 2
	}
}
