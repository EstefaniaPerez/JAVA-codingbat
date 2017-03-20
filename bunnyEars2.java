public int bunnyEars2(int bunnies) {
  if (bunnies==0)
  bunnies=0;
  else{
    if(bunnies % 2==0)
    bunnies=3+bunnyEars2(bunnies-1);
    else
    bunnies=2+bunnyEars2(bunnies-1);
  }
  return bunnies;
}