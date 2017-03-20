public int countHi2(String str) {
  int a=str.length();
  int cont=0;
  if(a<2 || (a==2 && str.equals("hi")==false))
  cont=0;
  else{
    if(str.equals("hi")==true)
    cont=1;
    else{
      String b=str.substring(a-2,a);
      String c=str.substring(a-3,a-2);
      if (b.equals("hi")==true && c.equals("x")==false)
      cont=1+countHi2(str.substring(0,a-1));
      else{
        cont=countHi2(str.substring(0,a-1));
      }
      
      
    }}
  return cont;
}