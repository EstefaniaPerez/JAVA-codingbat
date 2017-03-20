public String allStar(String str) {
  int a=str.length();
  
  if(a<2)
  str=str;
  else{
    String b=str.substring(0,1);
  str=b+"*"+allStar(str.substring(1,a));
  }
  
  return str;
}
