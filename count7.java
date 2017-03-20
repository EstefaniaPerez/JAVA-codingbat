public int count7(int n) {
  if (n==7)
  n=1;
  else{
    if(n % 10==7 && n>=10)
    n=1+count7(n/10);
    else{
      if(n % 10!=7 && n>=10)
      n=count7(n/10);
      else{
        if(n<10 && n!=7)
        n=0;
      }
    }
  }
  return n;
}