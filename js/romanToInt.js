/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    const symArray = {
        'I' : 1,
        'V' : 5,
        'X' : 10,
        'L' : 50,
        'C' : 100,
        'D' : 500,
        'M' : 1000
    };
    let count = 0;
    let prev = -Infinity;
    for(let i = s.length -1; i >=0; i--) {
        const int = symArray[s[i]];
        if(int < prev) count -= int;
        else count += int;
        prev = int;
    }
    return count;
    
};