public int factorial(int n) {
  if (n==1 || n==2)
  n=n;
  else
    n=n*factorial(n-1);
  
  return n;
}