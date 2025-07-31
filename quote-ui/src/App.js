import React, { useState, useEffect } from 'react';
import './App.css';

function App() {
  const [quote, setQuote] = useState('');
  const [isLoading, setIsLoading] = useState(true);

  const fetchQuote = async () => {
    setIsLoading(true);
    try {
      const response = await fetch('http://localhost:8080/api/quote');
      const data = await response.text();
      setQuote(data);
    } catch (error) {
      console.error("Failed to fetch quote:", error);
      setQuote("Could not fetch a quote. Is the backend server running?");
    } finally {
      setIsLoading(false);
    }
  };

  useEffect(() => {
    fetchQuote(); // Fetch a quote when the app first loads
  }, []);

  return (
    <div className="app-container">
      <div className="quote-card">
        <h1 className="quote-text">
          {isLoading ? "Loading..." : `“${quote}”`}
        </h1>
        <button 
          className="quote-button" 
          onClick={fetchQuote} 
          disabled={isLoading}
        >
          {isLoading ? '...' : 'Get New Quote'}
        </button>
      </div>
    </div>
  );
}

export default App;