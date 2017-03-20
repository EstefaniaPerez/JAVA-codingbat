public int powerN(int base, int n) {
  if(n==1)
  base=base;
  else
  base=base*powerN(base,n-1);
  
  return base;
}