public int countX(String str) {
  int cont=0;
  int a=str.length();
 String d;
 char[] c;
  if(str.equals("x")==true)
  cont=1;
  else{
     if(a<2 && (str.equals("x")==false || str.equals("")==true))
      cont=0;
      else{
     d=str.substring(a-1, a);
     c=d.toCharArray();
     str=str.substring(0,a-1);
    if(d.equals("x")==true && a>1)
    cont=1+countX(str);
     else{
       if(d.equals("x")==false && a>1)
        cont=countX(str);
     }
   
  }}
  return cont;
}