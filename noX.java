public String noX(String str) {
  int a=str.length();
  String b;
  if((a==1 && str.equals("x")==false)||(a==0))
  str=str;
  else{
    if(a==1 && str.equals("x")==true)
  str="";
  else{
    b=str.substring(0,1);
    if (b.equals("x")==true)
    str=noX(str.substring(1,a));
    else
    str=str.substring(0,1)+noX(str.substring(1,a));
  }
  }
  
  return str;
}