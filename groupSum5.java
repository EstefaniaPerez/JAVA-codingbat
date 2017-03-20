public boolean groupSum5(int start, int[] nums, int target) {
  int a=nums.length;
  boolean r=false;
  
  if(target==0 && (start==0 || start==a-1))
  r=true;
  else{
    if(start==a-1 && nums[start]==target)
    r=true;
    else{
      if (start<a-1 && nums[start]%5==0 && (nums[start+1]!=1 || target-nums[start]==0))
      r=groupSum5(start+1, nums, target-nums[start]);
      else{
         if (start<a-1 && nums[start]%5==0 && nums[start+1]==1)
      r=false;
      else{
        if (start<a-1 && nums[start]%5!=0)
      r=groupSum5(start+1, nums, target-nums[start]);
      
      if (start<a-1 && nums[start]%5!=0 && r==false)
      r=groupSum5(start+1, nums, target);
        
        
      }
      }
    }
  }
  return r;
}
