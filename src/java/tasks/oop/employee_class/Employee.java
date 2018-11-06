package java.tasks.oop.employee_class;

public class Employee
{
  private int id;
  private String firstName;
  private String lastName;
  private int salary;

  public Employee(int id,String firstName,String lastName,int salary)
  {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    if(salary > 0)
    {
      this.salary = salary;
    }
    else
    {
      throw new IllegalArgumentException("salary must be > 0");
    }
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public int getSalary()
  {
    return salary;
  }

  public void setSalary(int salary)
  {
    if(salary > 0)
    {
      this.salary = salary;
    }
    else
    {
      throw new IllegalArgumentException("salary must be > 0");
    }
  }

  public int getAnnualSalary()
  {
    return salary * 12;
  }

  public int raiseSalary(int percent)
  {
    salary = salary + (int) (salary*percent/100.0);
    return salary;
  }

  @Override
  public String toString()
  {
    return "java_tasks_OOP.employee_class.Employee[" +
            "id=" + id +
            ", firstName='" + firstName +
            ", lastName='" + lastName +
            ", salary=" + salary +
            ']';
  }

  @Override
  public boolean equals(Object obj)
  {
    if(this == obj)
    {
      return true;
    }
    if(!(obj instanceof Employee))
    {
      return false;
    }
    Employee employee = (Employee) obj;

    return salary == employee.salary &&
            lastName.equals(employee.lastName) &&
            firstName.equals(employee.firstName) &&
            id == employee.id;
  }

  @Override
  public int hashCode()
  {
    int result = 17;

    result = 31 * result + id;
    result = 31 * result + firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    result = 31 * result + salary;

    return result;
  }

}
