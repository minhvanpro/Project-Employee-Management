import { Admin, Resource } from "react-admin";
import simpleRestProvider from "ra-data-simple-rest";
import { ListDepartments, EditDepartment, CreateDepartment, ShowDepartment} from './components/Departments';
import {ListEmployees, EditEmployee, CreateEmployee} from './components/Employees';
import {ListProjects, EditProject, CreateProject, ShowProject} from './components/Projects';

function App() {
  return (
    <div className='app-container'>
      <Admin dataProvider={simpleRestProvider('http://localhost:8080/api/v2')}>
        <Resource name="employees" list={ListEmployees} edit={EditEmployee} create={CreateEmployee} options={{
          label: "Employees"
        }} />
        <Resource name="departments" list={ListDepartments} edit={EditDepartment} create={CreateDepartment} show={ShowDepartment} options={{
          label: "Departments"
        }} />
        <Resource name="projects" list={ListProjects} edit={EditProject} create={CreateProject} show={ShowProject} options={{
          label: "Projects"
        }} />
      </Admin>
    </div>
  );
}

export default App;
