public boolean array220(int[] nums, int index) {
  int a=nums.length;
  boolean b=false;
  
  if(a==1)
  b=false;
  else{
    if(index+1<a){
    if (nums[index]*10==nums[index+1])
    b=true;
    else
    b=array220(nums, index+1);
  }}
  return b;
}