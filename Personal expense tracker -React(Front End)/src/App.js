import * as React from 'react';
import Box from '@mui/material/Box';
import BottomNavigation from '@mui/material/BottomNavigation';
import BottomNavigationAction from '@mui/material/BottomNavigationAction';
import PaidRoundedIcon from '@mui/icons-material/PaidRounded';
import AccountBalanceWalletRoundedIcon from '@mui/icons-material/AccountBalanceWalletRounded';
import AccountCircleRoundedIcon from '@mui/icons-material/AccountCircleRounded';
import ExpensesPage from './ExpnsesPage';
import AddExpensesList from './Components/AddExpenseList';


function App() {
  const [value, setValue] = React.useState(0);
  return (
    <div>
      <div>
        {value ===0?<ExpensesPage/>:value===1?<AddExpensesList/>:null}
      </div>
      <div style={{
      position: "fixed",
      width:"100%",
      bottom: "0",
      overflow: "auto",
      height: "auto"
    }}>
      <Box>
        <BottomNavigation
          showLabels
          value={value}
          onChange={(event, newValue) => {
            setValue(newValue);
            console.log(value)
          }}
        >
          <BottomNavigationAction label="Expenses" icon={<PaidRoundedIcon />} />
          <BottomNavigationAction label="Budget" icon={<AccountBalanceWalletRoundedIcon />} />
          <BottomNavigationAction label="Profile" icon={<AccountCircleRoundedIcon />} />
        </BottomNavigation>
      </Box>
      
    </div>
    </div>
  );
}

export default App;
