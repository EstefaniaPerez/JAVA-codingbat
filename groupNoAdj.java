public boolean groupNoAdj(int start, int[] nums, int target) {
  int a=nums.length;
  boolean r=false;
  
  if(target==0 && (start==0 || start==a-1))
  r=true;
  else{
    if(nums[start]==target)
    r=true;
    else{
      if(start+2<a){
      if(nums[start]<target)
      r=groupNoAdj(start+2, nums, target-nums[start]);}
      
      if(r==false && start+1<a)
      r=groupNoAdj(start+1, nums, target);
    }
    
    
    
  }
  
  
  return r;
}
