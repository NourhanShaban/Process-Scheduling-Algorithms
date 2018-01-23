
package cpu.scheduling.algorithms;


public class Process {
    
    int   ProcessId;
    float ArrivalTime;
    float BurstTime;  
    float WaitingTime;
    int   Priority;
    
    public Process(int id,float t,float B)
    {
      this.ProcessId=id;
      this.BurstTime=B;
      this.ArrivalTime=t;
       
    }
     public Process(int id,float t,float B,float w)
    {
      this.ProcessId=id;
      this.BurstTime=B;
      this.ArrivalTime=t;
      this.WaitingTime=w;
       
    }
     public Process(int id,float t,float B,int p)
    {
      this.ProcessId=id;
      this.BurstTime=B;
      this.ArrivalTime=t;
      this.Priority=p;
       
    }
 
 
}
