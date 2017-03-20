public int sumDigits(int n) {
  if(n<10)
  n=n;
  else
  n=(n % 10)+sumDigits(n/10);
  
  return n;
}