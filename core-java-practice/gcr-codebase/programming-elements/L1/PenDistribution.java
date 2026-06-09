class PenDistribution{
	public static void main(String[] args){
		int pen=14;
		int students=3;
		int penPerStudent=pen/students;
		int remaining=pen%students;
		System.out.println("pen per Students="+ penPerStudent +
							"\nRemaining pens ="+ remaining);
		
	}
}