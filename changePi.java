public String changePi(String str) {
  int a=str.length();
 
  if(str.equals("pi")==true)
  str="3.14";
  else{
    if (a<2)
    str=str;
    else{
     String b=str.substring(0,2);
    if (b.equals("pi")==true){
    b="3.14";
    str=b+changePi(str.substring(2,a));
    }
    else
      str=b.substring(0,1)+changePi(str.substring(1,a));
    
  }}
  return str;
}