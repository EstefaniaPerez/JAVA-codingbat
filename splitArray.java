public boolean splitArray(int[] nums) {
 int n=0;
 int s1=0;
 int s2=0;
 int y=0;
  return recursiva(nums,n,s1,s2,y);
}

public boolean recursiva(int []nums, int n, int s1, int s2, int y){
   int a=nums.length;
   boolean r=false;
  y++;
   if (a==1 ||(a==2 && nums[0]!=nums[1]) )
   r=false;
   else{
     if((a==2 && nums[0]==nums[1]) || a==0 || (y>a && s1==s2))
     r=true;
     else{
       if(a>2 && n<a){
         s1=s1+nums[n];
         r=recursiva(nums, n+1,s1,s2,y);
       }
       if (a>2 && r==false && n<a){
         s1=s1-nums[n];
          s2=s2+nums[n];
         r=recursiva(nums, n+1,s1,s2,y);
       }
       
       
     }
   }
  
 return r; 
}