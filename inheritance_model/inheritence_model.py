class Employee:
    def __init__(self, name: str, id: int, base_salary: float):
        self.name = name
        self.id = id
        self.base_salary = base_salary

    def calculate_salary(self) -> int:
        """
        Returns self.base_salary
        """
        return self.base_salary

    def display_info(self) -> str:
        print(f"Employee name: {self.name}")
        print(f"Employee ID: {self.id}")
        print(f"Employee Salary: {self.calculate_salary()}")

class FullTimeEmployee(Employee):
    def __init__(self, name: str, id: int, base_salary: float, bonus: float):
        super().__init__(name, id, base_salary)
        self.bonus = bonus
    
    def calculate_salary(self) -> int:
        """
        Returns base salary + bonus
        """
        return super().calculate_salary() + self.bonus
    
class PartTimeEmployee(Employee):
    def __init__(self, name: str, id: int, base_salary: float):
        super().__init__(name, id, base_salary)

    @staticmethod
    def say_hello() -> None:
        print("Hello I'm an intern")
    
def main() -> None:
    employees: list[Employee] = [
        FullTimeEmployee(
            name="Aidan Hoo", 
            id=1443155, 
            base_salary=99500, 
            bonus=500,
        ),
        PartTimeEmployee(
            name="John Doe", 
            id=8097214, 
            base_salary=40000, 
        ),
    ]

    for emp in employees:
        emp.display_info()
        if isinstance(emp, PartTimeEmployee):
            emp.say_hello()
    
if __name__ == "__main__":
    main()
