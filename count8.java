public int count8(int n) {
  if (n==8)
  n=1;
  else{
    if(n%10==8 && (n/ 10)%10==8 && n>=10)
    n=2+count8(n/10);
    else{
    if(n % 10==8 && (n/10)%10!=8 && n>=10)
    n=1+count8(n/10);
    else{
      if(n % 10!=8 && n>=10)
      n=count8(n/10);
      else{
        if(n<10 && n!=8)
        n=0;
      }}
    }
  }
  return n;
}