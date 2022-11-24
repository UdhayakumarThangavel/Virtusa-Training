import ExpensesListCard from "./Components/ExpenseListCard";
import Axios from 'axios';
import React, { useEffect, useState } from 'react';

const ExpensesPage = () =>{
    const [data,setdata] =useState([]);
    const fetchdata = async () =>{
        Axios.get('http://192.168.133.81:1111/User').then((response)=>{
          setdata(response.data.data);
        });
      
      }
      
      useEffect(() => {
        fetchdata();
      },[]);
    return(
        <>
        {data.map((item) =>(
            <ExpensesListCard title={item.name} amount="100"></ExpensesListCard>
        ))}
        
        </>
    )
}

export default ExpensesPage;