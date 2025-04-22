import axios from "axios";

const func = {
    getId: async () => {
      try {
       
        const response = await axios.get("http://localhost:8080/user")
        const data = await response.data; // assuming the response is JSON
        return data;
      } catch (error) {
        console.error("Fetch error:", error);
        return null;
      }
    }
  };
  
  export default func;
  