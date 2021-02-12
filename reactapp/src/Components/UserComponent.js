import React, { useState, useEffect } from "react";
import axios from "axios";
function UserComponent() {
  const [users, setUsers] = useState([]);
  const URL = "http://localhost:8080/api/users";
  useEffect(() => {
    axios.get(URL).then((response) => {
      setUsers(response.data);
    });
  }, []);
  return (
    <div>
      <h1 className="text-center">User List</h1>
      <table className="table table-striped">
        <thead>
          <tr>
            <td>User_ID</td>
            <td>User_Name</td>
            <td>Technology</td>
            <td>Email</td>
            <td>Mobile Number</td>
          </tr>
        </thead>
        <tbody>
          {users.map((user) => (
            <tr key={user.id}>
              <td>{user.id}</td>
              <td>{user.username}</td>
              <td>{user.technology}</td>
              <td>{user.email}</td>
              <td>{user.mobileNumber}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default UserComponent;
