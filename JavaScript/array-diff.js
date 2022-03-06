function arrayDiff(a, b) {
    arr = a.filter(item => !b.includes(item));
    return arr;
}
