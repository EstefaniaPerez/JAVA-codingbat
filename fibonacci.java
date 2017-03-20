public int fibonacci(int n) {
  if (n==0)
  n=0;
  else{
    if(n==1 || n==2)
    n=1;
    else
    n=fibonacci(n-1)+fibonacci(n-2);
  }
  
  return n;
}
