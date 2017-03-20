public int bunnyEars(int bunnies) {
  if (bunnies==0)
  bunnies=0;
  else
  bunnies=2+bunnyEars(bunnies-1);
  return bunnies;
}