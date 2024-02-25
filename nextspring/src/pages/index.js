import { useCallback, useEffect, useState } from "react";

export default function Home() {
  const [jsonData, setJsonData] = useState([]);

  const fetchData = useCallback(async () => {
    try {
      const getData = await fetch('http://localhost:9090/getStudents', {
        method: "GET",
        headers: {
          "Content-Type": "application/json"
        }
      });

      const students = await getData.json();
      setJsonData(students);
      console.log("Incoming Spring boot Data:", students);
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  }, []);

  useEffect(() => {
    fetchData();
  }, [fetchData]);

  return (
    <>
      <h1>This Data is from Spring boot</h1>
      <table className="styled-table">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
          </tr>
        </thead>
        <tbody>
          {jsonData.map(student => (
            <tr key={student.id}>
              <td>{student.id}</td>
              <td>{student.name}</td>
              <td>{student.email}</td>
              <td>{student.phone}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
}
