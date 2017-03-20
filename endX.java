public String endX(String str) {
  int a=str.length();
  
  if(str.equals("x")==true)
  str=str;
  else{
    if(str.equals("x")==false && a<2)
  str=str;
  else{
    String b=str.substring(0,1);
    if(b.equals("x")==true){
    str=endX(str.substring(1,a));
    str=str+"x";}
    else
    str=b+endX(str.substring(1,a));
  }
  }
  return str;
}
