 class Switcher {
	 
   public static void main(String[] args) {
      int week = 4;
      String day;
	        
      switch (week) {
         case 1:
        	 day="monday";
        	 break;
         case 2:
        	 day="tuesday";
        	 break; 
         case 3:
        	 day="wednesday";
        	 break;
        default :
        	day="invalid day";
        	break;
      }
        	System.out.println(day);

      }
   }
