function findUniq(arr) {
    arr = arr.sort();
    if (arr[0] == arr[1]) {
        return arr.pop(); 
    } else {
        return arr[0];
    }
}
  
