function filter_list(l) {
    l = l.filter(e => typeof(e) !== 'string');
    return l;
}
