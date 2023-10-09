import './App.scss';
import { Routes, Route } from 'react-router-dom';
import Header from './components/Header';
import { Container } from 'react-bootstrap';
import Employee from './pages/Employee';
import Department from './pages/Department';
import Project from './pages/Project';

function App() {
  return (
    <div className='app-container'>     
      <Header />
      <Container>
        <Routes>
          <Route path='/' element={<Employee/>} />
          <Route path='/department' element={<Department/>} />
          <Route path='/project' element={<Project/>} />
        </Routes> 
      </Container>
    </div>
  );
}

export default App;
