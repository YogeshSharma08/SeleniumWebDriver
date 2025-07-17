import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreamsConcept  {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		JavaStreamsConcept ja = new JavaStreamsConcept();
//		//ja.streamFilter();
//		ja.streamMap();
//	}
	
	@Test
	public void streamFilter(){
		ArrayList<String> names = new ArrayList<String>();
		names.add("Yogesh");
		names.add("Ashish");
		names.add("Gauri");
		names.add("Shoam");
		names.add("Arush");
		long d = names.stream().filter(s-> s.startsWith("A")).count();
		System.out.println(d);
		
		long e = Stream.of("Yogesh","Ashish","Gauri","Shoam","Arush").filter(s ->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(e);
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test
	public void streamMap() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shreya");
		names.add("Shivam");
		names.add("Harshal");
		names.add("Ritesh");
		names.add("Aashu");
		
		Stream.of("Yogesh","Ashish","Gauri","Shoam","Arush").filter(s->s.endsWith("h")).map(s-> s.toUpperCase()).forEach(s-> System.out.println(s));;
		List<String> names1 = Arrays.asList("Yogesh","Ashish","Gauri","Shoam","Arush");
		names1.stream().filter(s-> s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		Stream<String> newstream =  Stream.concat(names.stream(), names1.stream());
		//newstream.sorted().forEach(s-> System.out.println(s));
		boolean b= newstream.anyMatch(s-> s.equalsIgnoreCase("Yogesh"));
		Assert.assertTrue(b);
		
	}
	
	@Test
	public void stramCollect() {
		
		List<String> str = Stream.of("Yogesh","Ashish","Gauri","Shoam","Arush").filter(s->s.endsWith("h")).map(s-> s.toUpperCase()).collect(Collectors.toList());
		str.get(0);
		List<Integer> num = Arrays.asList(6,4,8,9,7,6,5,1,2,5);
		num.stream().sorted().distinct().forEach(s-> System.out.println(s));
		List<Integer> li = num.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println( li.get(2));
		
		
		
	}


}
