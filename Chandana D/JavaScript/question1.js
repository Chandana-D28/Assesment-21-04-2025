function countVowels(str){
    let str1=str.toLowerCase()
    let count=0;
    for(let i=0; i<str1.length;i++){
        if(str1[i]=='a'){           
            count=count+1;                                      
        }
        else if(str1[i]=='e'){           
            count=count+1;                                      
        }
        else if(str1[i]=='i'){           
            count=count+1;                                      
        }
        else if(str1[i]=='o'){           
            count=count+1;                                      
        }
        else if(str1[i]=='u'){           
            count=count+1;                                      
        }
        else{
            console.log("No vowels");           
        }
    }
    console.log("Number of vowels",count);
    
}
countVowels('Hello World');