public int countPairs(String str) {
  int a=str.length();
  int cont=0;
  
  if(a<3)
  cont=0;
  else{
    String b=str.substring(0,1);
    String c=str.substring(2,3);
    if(b.equals(c)==true)
    cont=1+countPairs(str.substring(1,a));
    else
      cont=countPairs(str.substring(1,a));
    
    
    
    
  }
  return cont;
}