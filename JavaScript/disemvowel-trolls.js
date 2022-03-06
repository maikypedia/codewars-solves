function disemvowel(str) {
    let vocals = ["a", "e", "i", "o", "u"];
  
    for (x of str) {
        for (i of vocals) {
            if (x.toLowerCase() == i) {
                str = str.replace(x, "");
            }
        }
    }
    return str;
}