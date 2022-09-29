import {React,useState} from 'react'


const EmployeeRegister = ({registerEmployee}) => {
    const [data,setData] =  useState({
        empid:"",
        empname:"",
        domain:""
    });


    const handleChange = (e)=>{
        setData({...data,[e.target.name]:e.target.value})
    }
    const handleSubmit = (e)=>{
        e.preventDefault()
        registerEmployee(data)

    }
  return (
    <div>
      <form onSubmit={handleSubmit}>
        <label htmlFor="empID">Employee ID</label>
        <input type={'number'} id="empId" name="empid" value={data.empid} onChange={(e)=>{handleChange(e)}}/>
        <br/>
        <label htmlFor="empName">Employee Name</label>
        <input type={'text'} id="empName" name="empname" value={data.empname} onChange={(e)=>{handleChange(e)}}/>
        <br/>
        <label htmlFor="empDomain">Employee Doamin</label>
        <input type={'text'} id="empDomain" name="domain" value={data.domain} onChange={(e)=>{handleChange(e)}}/>
        <br/>
        <input type={'submit'}/>
        
      </form>
    </div>
  )
}

export default EmployeeRegister
