import java.util.*;
import java.io.*;

public class Dragons
{
	public static void main (String[] args) throws Exception
	{
		Scanner scan = new Scanner (new File ("dragons.in"));
		while (scan.hasNext())
		{
			System.out.println(scan.nextLine());
		}
	}
}