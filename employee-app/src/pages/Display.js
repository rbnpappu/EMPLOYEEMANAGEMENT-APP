import React from 'react'

const Display = ({data}) => {

const listItems = data.map((emp,index) =>
<li key={index}>{emp.empid}: {emp.empname} :{emp.domain}</li>
);
  return (
    <div>
        <ul>
    {/* {
        data.map((emp)=>{
         
           return (   <li>{emp.empid}: {emp.empname} :{emp.domain}</li>)
              
            
       
        })
    } */}

    {listItems}
    </ul>
    </div>
  )
}

export default Display
