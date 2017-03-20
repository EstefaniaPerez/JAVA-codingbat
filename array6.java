public boolean array6(int[] nums, int index) {
  int a=nums.length;
  boolean resp=false;
  if(index<a){
  if(a==1 && nums[index]==6)
  resp=true;
  else{
    if(a==1 && nums[index]!=6)
    resp=false;
    else{
      if(nums[index]==6)
      resp=true;
      else
      resp=array6(nums, index+1);
    }
  }
  }
  
  return resp;
}
