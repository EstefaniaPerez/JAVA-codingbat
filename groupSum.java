public boolean groupSum(int start, int[] nums, int target) {
  int a=nums.length;
  boolean resp=false;
  
  if(target==0)
  resp=true;
  else{
    if (start>=a)
    resp=false;
    else{
      if(nums[start]>target && start<a-1)
      resp=groupSum(start+1,nums,target);
      else{
        if(nums[start]>target && start==a-1)
      resp=false;
      else{
    if(start<a && nums[start]==target)
    resp=true;
    else{
      if (start+1<a && nums[start]<target)
      resp=groupSum(start+1,nums,target-nums[start]);
     
        if(start+1<a && nums[start]<target && resp==false)
        resp=groupSum(start+1,nums,target);
        
      }
    }}}}
  return resp;
}
