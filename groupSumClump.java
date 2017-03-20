public boolean groupSumClump(int start, int[] nums, int target) {
  int a=nums.length;
  boolean r=false;
  int cont=1;
  
  if(target==0 )
  r=true;
  else{
    if (a==1 && nums[start]!=target)
      r=false;
      else{
    if (start<a){
    if(nums[start]==target)
    r=true;
    else{
        while (start+1<a && nums[start]==nums[start+1]){
          start++;
          cont++;}
          if (cont>0)
        r=groupSumClump(start+1, nums, target-(nums[start])*cont);
        
        if(r==false && cont>0)
        r=groupSumClump(start+1, nums, target);
        
        else{
          if (cont==0 && nums[start]<target)
          r=groupSumClump(start+1, nums, target-nums[start]);
          
          if(cont==0 && nums[start]<target && r==false)
          r=groupSumClump(start+1, nums, target);
        }
      }
    
    
    }
  }}
  
  return r;
}
