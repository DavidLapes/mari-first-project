import React, { Component } from 'react';
import './App.css';

class Homepage extends Component {
    render() { 
        return (
            <div className = "container">
                <h1 className="text-homepage">Mari´s diary</h1>
                <h2 className="title-homepage">The best ideas start here.</h2>
                <button className="button-homepage">Curriculum Vitae</button>
            </div>
        );
    }
}
 
export default Homepage;
