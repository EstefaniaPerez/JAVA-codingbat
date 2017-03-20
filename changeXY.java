public String changeXY(String str) {
  int a=str.length();
  if(str.equals("x")==true)
  str="y";
  else{
    if(str.equals("x")==false && a<2)
  str=str;
  else{
    String b=str.substring(0,1);
    if(b.equals("x")==true){
    str=changeXY(str.substring(1,a));
    str="y"+str;}
    else{
    if(b.equals("x")==false)
    str=b+changeXY(str.substring(1,a));
  }}
  }
  return str;
}
