import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import Axios from 'axios';
import { useState } from "react";



function AddExpensesList() {
    const [Expensename, setExpensename] = useState({name:undefined});
    const Adddata = async ()  =>  {
        Axios.post('http://192.168.133.81:1111/User', Expensename).then((response) => {
            console.log(response.data.message);
        });
    }
    return (
        <>
            <div>
            <Box
                component="form"
                sx={{
                    '& > :not(style)': { m: 1, width: '94%' },
                }}
                noValidate
                autoComplete="off"
            >
                <TextField id="outlined-basic" value={Expensename.name} onChange={e => setExpensename({name : e.target.value})} label="Name" variant="outlined" />
            </Box>
            </div>
            <div>
            <Button variant="contained" onClick={()=> {Adddata()}}>Add</Button>
            </div>
            
        </>
    )
}

export default AddExpensesList;