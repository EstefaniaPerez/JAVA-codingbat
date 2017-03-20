public String parenBit(String str) {
  int a=str.length();
  
if (a<2 && str.equals(")")==true)
  str=str;
  else{
    if (a<2 && str.equals(")")==false)
    str="";
    else{
    if(a>=2){
    String b=str.substring(0,1);
    String c=str.substring(1,2);
    if(a>=2 && b.equals("(")==true){
      str="*"+str.substring(1,a);
    str=b+parenBit(str);
    }
    else{
      if (b.equals("*")==true && c.equals(")")==false){
        str="*"+str.substring(2,a);
    str=c+parenBit(str);
      }
    else{
      if (b.equals("*")==true && c.equals(")")==true){
    str=c;
      }
    else{
      if(b.equals("*")==false && b.equals("(")==false)
    str=parenBit(str.substring(1,a));
   }}
  }}}}
  return str;
}
