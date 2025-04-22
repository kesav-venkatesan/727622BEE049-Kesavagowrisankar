import { useEffect, useState } from 'react';
import func from './Service';
import './App.css';
import userName from './data';

function App() {
  const [data, setData] = useState([]);
  const [click,setClick]=useState()
  useEffect(() => {
    const fetchData = async () => {
      const result = await func.getId();
      setData(result || []);
      console.log(result);
    };
    fetchData();
  }, []);

  return (
    <div className='body'>
      <button>Add User</button>
      
      <table>
        <caption>Total Users</caption>
        <thead>
          <tr className='head'>
            <th>User</th>
            <th>Id</th>
          </tr>
        </thead>
        <tbody>
          {data.map((e) => (
            <tr key={e.id}>
              <td>{e.id}</td>
              <td>{e.username}</td>
            </tr>
          ))}
        </tbody>
      </table>

      <table>
        <caption>Top 5</caption>
        <thead>
          <tr className='head'>
            <th>User</th>
            <th>Id</th>
          </tr>
        </thead>
        <tbody>
        {data.slice(0,5).map((e) => (
            <tr key={e.id}>
              <td>{e.id}</td>
              <td>{e.username}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;
