public boolean strCopies(String str, String sub, int n) {
  int a=str.length();
  int b=sub.length();
  int cont=0;
  boolean resp=false;
  
  if(b>a)
  cont=0;
  else{
  if(b==a && str.equals(sub)==true)
  cont=1;
  else{
    if(b==a && str.equals(sub)==false)
  cont=0;
  else{
    String c=str.substring(0,b);
    if(c.equals(sub)==true){
    cont=1;
    resp=strCopies(str.substring(1,a),sub,n-1);
  }
    else{
      cont=0;
      resp=strCopies(str.substring(1,a),sub,n);
    }
  }
  }