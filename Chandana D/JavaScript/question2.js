function flatAndSort(arr){
    let flatArr=arr.flat(Infinity)
    let sortArr=flatArr.sort((a,b)=>a-b);
    console.log(sortArr);

}
flatAndSort([[3, 2, 1], [4, 5, 2], [1, 6]]);