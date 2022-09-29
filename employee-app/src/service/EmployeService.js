import { api } from "../api/Baseurl";

class  EmployeService{
 getEmployee(){
return(api.get("employes"))
}
postEmployee(data){
    return(api.post("employes",data)) 

}
getEmployeeByid(id){
    return(api.get("employes/{id}"))
}
}
export default new EmployeService()