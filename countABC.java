public int countAbc(String str) {
  int a=str.length();
  int cont=0;
  if(a<3)
  cont=0;
  else{
    if (a==3 && (str.equals("abc")==true || str.equals("aba")==true))
    cont=1;
    else{
      if(a==3 && (str.equals("abc")==false || str.equals("aba")==false))
      cont=0;
    else{
      String b=str.substring(0,3);
      if(b.equals("abc")==true || b.equals("aba")==true)
      cont=1+countAbc(str.substring(1,a));
      else
      cont=countAbc(str.substring(1,a));
    }
  }}
  return cont;
}