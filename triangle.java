public int triangle(int rows) {
  if (rows==0)
  rows=0;
  else{
  if(rows==1)
  rows=1;
  else
  rows=rows+triangle(rows-1);
  }
  return rows;
}