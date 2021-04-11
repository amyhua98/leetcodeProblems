/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x < 0) return 0;
    let first = x;
    let res = 0, div = 0;
    while(x) {
        div = x / 10 | 0;
        res = res * 10 + x % 10;
        x = div
    }
    return res === first;
};