public int array11(int[] nums, int index) {
  int b=0;
  int a=nums.length;
  if (index<a){
  if(a==1 && nums[index]==11)
  b=1;
  else{
    if(a==1 && nums[index]!=11)
    b=0;
    else{
      if(a>1 && nums[index]==11)
      b=1+array11(nums, index+1);
      else
      b=array11(nums, index+1);
    }
  }
  
}
return b;
}