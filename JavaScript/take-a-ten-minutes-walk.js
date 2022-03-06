function isValidWalk(walk) {
    x = 0;
    y = 0;

    data = {
        "n" : 1,
        "s" : -1,
        "w" : 1,
        "e" : -1
    };
    if (walk.length !== 10) {
        return false;
    } else {
        for (i of walk) {
            if (i == "n" || i == "s") {
                x += data[i];
            } else if (i == "w" || i == "e") {
                y += data[i];
            }
        }
    }
    if (x == 0 && y == 0) {
        return true;
    } else { 
        return false;
    }
}