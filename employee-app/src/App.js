
import './App.css';
import EmployeeRegister from './components/EmployeeRegister';
import Display from './pages/Display';
import {React,useState,useEffect} from 'react'
import EmployeService from './service/EmployeService';
function App() {

const [data,setData]  = useState([])
  const registerEmployee=(employee)=>{
    EmployeService.postEmployee(employee).then((res)=>{
      console.log("Data Save Successfully"+res.data)
      setData([...data,res.data])
    })
   
 }
 useEffect(() => {

  EmployeService.getEmployee().then((res)=>{
    console.log(res.data) 
    setData(res.data)
  
  }).catch((err)=>{console.log(err.response)})
  
 }, [])
  return (
<>
<EmployeeRegister  registerEmployee={registerEmployee}/>
<Display data={data}/> 
</>
  );

}

export default App;
