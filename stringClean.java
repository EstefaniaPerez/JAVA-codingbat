public String stringClean(String str) {
  int a=str.length();
  
  if(a<2)
  str=str;
  else{
     String b=str.substring(0,1);
    String c=str.substring(1,2);
    if(a==2 && b.equals(c)==true)
    str=b;
    else{
       if(a==2 && b.equals(c)==false)
    str=b+c;
    else{
    if(a>=3){
    String d=str.substring(2,3);
    if(b.equals(c)==true && b.equals(d)==false)
    str=b+stringClean(str.substring(2,a));
    else{
      if(b.equals(c)==true && b.equals(d)==true)
    str=stringClean(str.substring(1,a));
    
    else
    str=b+stringClean(str.substring(1,a));
    
  }}
  }}}
  return str;
  
}
