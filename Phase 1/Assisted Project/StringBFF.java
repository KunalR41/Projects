package Ass3;

public class StringBFF {
	
        public static void main(String args[]) {

               StringBuffer s_buffer = new StringBuffer("Hello mutable string. ");

              

               System.out.println(s_buffer);

               s_buffer.append("Another string added");

               System.out.println(s_buffer);
               
               
               StringBuilder s_builder = new StringBuilder("Hello mutable string by StringBuilder. ");
               
               
               
               System.out.println(s_builder);

               s_builder.append("Another string added");

               System.out.println(s_builder);


   }

	}


