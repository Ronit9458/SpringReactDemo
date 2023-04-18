import React from 'react'
import './Login.css'
import logo from './images/light.png'
import pass from './images/passgrey.jpg'
import user from './images/ser.png'

function Login() {
 return (
<div  className='child'>
<img src={logo} className="logo" style={{height : '200px'}} alt="logo" />
<div className='input-container'>
<img src={user}  alt="logo"  className='img'   />
<input placeholder='Username' className='input-style'></input>
</div>
<div  className='input-container'>
<img src={pass}  className='img'   alt="logo"  />
<input type="password" placeholder='Password' className='input-style' ></input>
</div>

<div  className='button-container' >
<button type="button" className="button ">LOGIN</button>
</div>
    </div>
  )
}

export default Login