public int strCount(String str, String sub) {
  int a=sub.length();
  int b=str.length();
  int cont=0;
  if(a>b)
  cont=0;
  else{
  if(a==b && str.equals(sub)==true)
  cont=1;
  else{
    if(a==b && str.equals(sub)==true)
  cont=0;
  else{
    String c=str.substring(0,a);
    if(c.equals(sub)==true && a>1)
    cont=1+strCount(str.substring(2,b),sub);
    else{
      if (c.equals(sub)==true && a==1)
    cont=1+strCount(str.substring(1,b),sub);
    else{
    if(c.equals(sub)==false)
    cont=strCount(str.substring(1,b),sub);
   
  }}}}}
  return cont;
}