/* 1. Return the nth Fibonacci number
    `x`
f(0) = 0
f(1) = 1
f(10) = 55
    */

homework.fibonacci = function (n) {

};
function fibonacci(n) {

    //declared array to store fib numbers and store first two numbers
    let fnums = [0, 1];

    //iterates, stores, and calculates

    let i;
    if (i = 0)
        return fnums[i];

    for (i = 2; i <= n; i++) {
        fnums[i] = fnums[i - 1] + fnums[i - 2];
    }

    return f[n];
}
fibonacci(n);


/*
 2. Sort array of integers

 f([2,4,5,1,3,1]) = [1,1,2,3,4,5]

 Don't use the Array sort() method... that would be lame.
*/

homework.sort = function (array) {

};
function sort(f) {
    //establish array
    let f = [2, 4, 5, 1, 3, 1];
    //iterate through array
    for (let i = 0; i < f.length; i++) {
        let target = f[i];
        //set nested arrary for switching around 
        //numbers while iterating through
        for (let j = i - 1; j >= 0 && (f[j] > target); j--) {
            f[j + 1] = f[j];
        }
        f[j + 1] = target;
    }
    console.log(f);
}
sort(f);


/*
 3. Return the factorial of n

 f(0) = 1
 f(1) = 1
 f(3) = 6
*/
homework.factorial = function (n) {
    
};
function factorial(n) {
    //establish result variable
    let total;
    //covers first two factors 0 & 1
    if (n == 0 || n == 1) {
        return 1;
    }
    //while 'n' above 1 then calculate factorial    
    while (n > 1) {
        n--;
        total *= n;
    }
    return total;

}
factorial(n);

/*


 4. Rotate left

 Given array, rotate left n times and return array

 f([1,2,3,4,5], 1) = [2,3,4,5,1]
 f([1,2,3,4,5], 6) = [2,3,4,5,1]
 f([1,2,3,4,5], 3) = [4,5,1,2,3]

*/
homework.rotateLeft = function (array, n) {

};
function rotate(f, dn) {
    //establish array
    let f = [0];
    //establish function to rotateOnce
    function rotateOnce(f, n) {
        let y;
        for (let j = 0; j < n - 1; j--) {
            f[j] = f[j + 1];
        }
        f[j] = y;
    }

    //function to rotate as many times as needed
    for (let i = 0; i < dn; i++) {
        rotateOnce();
    }

    console.log(f);
}
rotate(f, dn);

/*
 5. Balanced Brackets

 A bracket is any one of the following: (, ), {, }, [, or ]

 The following are balanced brackets:
    ()
    ()()
    (())
    ({[]})

 The following are NOT balanced brackets:
 (
 )
 (()
 ([)]

 Return true if balanced
 Return false if not balanced
*/
homework.balancedBrackets = function (bracketsString) {

};

