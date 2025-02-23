function getSecondLargest(nums) {

    console.log(nums)
    nums.sort().reverse();
    console.log(nums)
    if (nums.length === 1) {
        segundoMaior = nums.shift();
    } else if (nums.length === 2) {
        nums.shift();
        return nums.shift();
    } else {
        console.log(nums)
        var indexMaxLast = nums.lastIndexOf(nums.shift());

        console.log(indexMaxLast)
        console.log(nums)
        if (indexMaxLast === -1) {
            return +nums.slice(0, 1);
        }else {
            indexMaxLast++;
            return +nums.slice(indexMaxLast, ++indexMaxLast);    
        }
        
    }
}

//let arr = [2, 3, 6, 6, 5];
let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(getSecondLargest(arr));
