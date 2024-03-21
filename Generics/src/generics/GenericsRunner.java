package generics;

public class GenericsRunner {

	public static void main(String[] args) {

		MyCustom<String> list = new MyCustom<>();
		list.addelements("elements1");
		list.addelements("elements2");
		list.addelements("elements3");
		String value = list.get(0);
		System.out.println(value);

		MyCustom<Integer> list2 = new MyCustom<>();
		list2.addelements(Integer.valueOf(5));
		list2.addelements(Integer.valueOf(6));
		list2.addelements(Integer.valueOf(7));
		Integer number = list2.get(0);
		System.out.println(number);


	}

}
