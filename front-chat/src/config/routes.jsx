import React from 'react'
import {Routes, Route} from "react-router"
import App from '../App.jsx'
import ChatPage from "../components/Chatpage.jsx"

const AppRoutes = () => {
  return (
    <Routes>
        <Route path="/" element={<App/>}/>
        <Route path="/chat" element={<ChatPage/>}/>
        <Route path="/about" element={<h1>THis is Chat page</h1>}/>
        <Route path="*" element={<h1>THis is 404 Error page</h1>}/>

      </Routes>
  )
}

export default AppRoutes