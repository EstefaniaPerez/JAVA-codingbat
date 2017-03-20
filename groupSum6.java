public boolean groupSum6(int start, int[] nums, int target) {
  int a=nums.length;
  boolean resp=false;
  
   if(target==0 && (start==0 || start==a-1)){
    if((start==a-1 && nums[start]!=6) || start==0)
    resp=true;}
 
  else{
    if(start >=a)
  resp=false;
  
  else{
    if(nums[start]!=target && start==a-1)
    resp=false;
    else{
      if(nums[start]==target && start==a-1)
    resp=true;
    else{
       if(nums[start]==6 && start<a-1)
    resp=groupSum6(start+1, nums, target-6);
    else{
      if(nums[start]!=6 && start<a-1)
    resp=groupSum6(start+1, nums, target-nums[start]);
    
      if(nums[start]!=6 && start<a-1 && resp==false)
    resp=groupSum6(start+1, nums, target);
    }
    }
    }
    }
  }
  
 return resp; 
}
