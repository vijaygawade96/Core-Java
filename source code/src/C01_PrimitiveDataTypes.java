
public class C01_PrimitiveDataTypes {
	char myChar;
	byte myByte;
	
	short myShort;
	int myInt;
	long myLong;
	
	float myFloat;
	double myDouble;
	
	boolean myBoolean;
	
	void printDataTypeWithDefaultValueRangeAndSize() {
		System.out.println(String.format("char     data type with default value='%c' and Size=%2d bytes and Value Range:'%c' to '%c'", myChar,Character.BYTES,Character.MIN_VALUE,Character.MAX_VALUE));
		
		System.out.println(String.format("byte     data type with default value='%d' and Size=%2d bytes and Value Range:'%d' to '%d'", myByte,Byte.BYTES,Byte.MIN_VALUE,Byte.MAX_VALUE));
		System.out.println(String.format("short    data type with default value='%d' and Size=%2d bytes and Value Range:'%d' to '%d'", myShort,Short.BYTES,Short.MIN_VALUE,Short.MAX_VALUE));
		System.out.println(String.format("int      data type with default value='%d' and Size=%2d bytes and Value Range:'%d' to '%d'", myInt,Integer.BYTES,Integer.MIN_VALUE,Integer.MAX_VALUE));
		System.out.println(String.format("long     data type with default value='%d' and Size=%2d bytes and Value Range:'%d' to '%d'", myLong,Long.BYTES,Long.MIN_VALUE,Long.MAX_VALUE));
		
		System.out.println(String.format("float    data type with default value='%f' and Size=%2d bytes and Value Range:'%f' to '%f'", myFloat,Float.BYTES,Float.MIN_VALUE,Float.MAX_VALUE));
		System.out.println(String.format("double   data type with default value='%f' and Size=%2d bytes and Value Range:'%f' to '%f'", myDouble,Double.BYTES,Double.MIN_VALUE,Double.MAX_VALUE));
		
		System.out.println(String.format("boolean  data type with default value='%s'", myBoolean));
		
	}
}
