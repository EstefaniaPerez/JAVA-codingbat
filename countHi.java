public int countHi(String str) {
  int a=str.length();
  int cont=0;
  if(a==2 && str.equals("hi")==true)
  cont=1;
  else{
    if((a==2 && str.equals("hi")==false)||(a==1) ||(a==0))
  cont=0;
  else{
    String b=str.substring(0,2);
    if(a>2 && b.equals("hi")==true)
    cont=1+countHi(str.substring(1,a));
    else
    cont=countHi(str.substring(1,a));
  }
  }
  return cont;
  
}
