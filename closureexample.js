function whatever (){
    //declaring a variable in "parent"?
    let x = "example";
    //declaring "child" function
    //closure is "created everytime a function is created"
    function wateva2(){

        alert(x); 

    }   
    wateva2();
    //"to use closure you must expose function, return it, or pass to another function"

}
whatever();