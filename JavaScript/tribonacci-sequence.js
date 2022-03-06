function tribonacci(signature,n){
    let arr = [];
    let new_element;
    if (n == 0) { return arr; }  
    i = signature.length;
    while (signature.length != n) {
        new_element = signature[i-1] + signature[i-2] + signature[i-3];
        signature.push(new_element);
        i++;
    }
    return signature;
}

arr = [1,2,3,1,23,,123,12,12,3,1,1,2,2];
console.log(tribonacci(arr, 10));