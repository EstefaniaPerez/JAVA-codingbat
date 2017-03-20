public String pairStar(String str) {
  int a=str.length();
  String d;
  if(a<2)
   str=str;
   else{
     String b=str.substring(0,1);
     String c=str.substring(1,2);
     if (b.equals(c)==true){
       d=b+"*";
       str=d+pairStar(str.substring(1,a));
     }
     else
     str=b+pairStar(str.substring(1,a));
   }
  return str;
}