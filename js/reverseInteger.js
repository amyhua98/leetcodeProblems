/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    if(x === 0) return 0;
    let res = 0, div = 0;
    while(x) {
        div = x / 10 | 0;
        res = res * 10 + x % 10;
        x = div
    }
    if(res < Math.pow(-2, 31) || res > (Math.pow(2, 31) - 1) ) return 0;
    return res;
};