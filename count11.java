public int count11(String str) {
  int a=str.length();
  int cont=0;
  
  if(a<2)
  cont=0;
  else{
    if(a==2 && str.equals("11")==false)
    cont=0;
    else{
      if(a==2 && str.equals("11")==true)
    cont=1;
    else{
      String b=str.substring(0,2);
      if(b.equals("11")==true)
      cont=1+count11(str.substring(2,a));
      else
       cont=count11(str.substring(1,a));
    }
    }
  }
  return cont;
}