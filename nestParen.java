public boolean nestParen(String str) {
  int a=str.length();
  boolean resp=false;
  if (str.equals("")==true)
  resp=true;
  else{
  if(a % 2 !=0)
  resp=false;
  else{
    if(a % 2==0){
    String b=str.substring(0,1);
    String c=str.substring(a-1, a);
    if(a==2 && b.equals("(")==true && c.equals(")")==true)
    resp=true;
    else{
       if(a==2 && b.equals(c)==false)
    resp=false;
    
    else{
    if(a>2 && b.equals("(")==true && c.equals(")")==true)
    resp=nestParen(str.substring(1,a-1));
    else{
    if(a>2 && b.equals(c)==false)
    resp=false;
    }
  }}
  }}}
  return resp;
}
