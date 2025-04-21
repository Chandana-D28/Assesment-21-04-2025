const expenses = [ 
    { category: "Food", amount: 120 }, 
    { category: "Travel", amount: 300 }, 
    { category: "Food", amount: 80 }, 
    { category: "Bills", amount: 200 }, 
    { category: "Travel", amount: 100 }, 
    ]; 
    
function getCategorySummary(expenses){
    let amount1;
    for(let e in expenses){
   if(expenses[e].category=="food")
   {
       console.log("hi");
       
   }
   } 
  
   
}
getCategorySummary(expenses)

