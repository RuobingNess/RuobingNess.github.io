let myList=null;
fetch('data.json')
            .then(response => response.json())
            .then(data => {
                //Get the list element
                const list = document.getElementsByClassName('data');
                myList=data;
                console.log(myList);
                //loop through the data and each item to the list 
                data.forEach(student => {
                const li = document.createElement ('li');
                const a = document.createElement ('a');

                //set the text content and the attributes for the link
                
                

                //add the link to the list 
                
               });
})

const keyword="New School id";  
      const item= myList.find(function(item,index,arr){
            console.log(item.Name);
             return item.Name.indexOf(keyword)>=0;
      });
      console.log('click');
      console.log(item);
      if(item!=null){
         const sidebar= document.getElementsByClassName('sidebar');
         sidebar[0].innerHTML="Name:" + item.Name+"<br/><br/>Date:"+item.Date+"<br/><br/>Location:"+item.Locatio+"<br/><br/>Access:"+item.Access+"<br/><br/>How:"+item.How;
      }
 
});