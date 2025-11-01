// src/components/LoginForm.js
import React, { useState } from "react";

function LoginForm() {
  const [email, setEmail] = useState("");
  const [pwd, setPwd] = useState("");
  const submit = async () => {
    
    console.log("Email:", email, "Password:", pwd);

    const response = await fetch("https://api.example.com/login", {
      method: "POST",
      body: JSON.stringify({ email, pwd }),
    });

    if (response.ok) alert("Login success!");
    else alert("Error logging in!");
  };

  return (
    <div style={{ marginTop: "50px" }}>
      <h3>Login</h3>
      <input
        type="text"
        placeholder="Enter email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
      />
      <input
        type="password"
        placeholder="Enter password"
        value={pwd}
        onChange={(e) => setPwd(e.target.value)}
      />
      <button onClick={submit}>Login</button>
    </div>
  );
}

export default LoginForm;
