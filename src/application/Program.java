package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		
		System.out.print("Nome do departamento: ");
		String nameDepartament = sc.nextLine();
		System.out.print("Dia de pagamento: ");
		int payDay = sc.nextInt();
		sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();
		Department department = new Department(nameDepartament, payDay, new Address(email, telefone));
		
		
		System.out.print("Quantos funcionarios tem o departamento? ");
		int nFuncionario = sc.nextInt();
		
		for (int i=0; i<nFuncionario; i++) {
			System.out.println("Dados do funcionario " + (i+1)+ ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			Employee employee = new Employee(name, salario);
			department.addEmployee(employee);
		}
		showReport(department);
		
		sc.close();
	}

	public static void showReport(Department department) {
		System.out.println("\nFOLHA DE PAGAMENTO:");
		System.out.printf("Departamento %s = R$ %.2f%n",department.getName(), department.payroll());
		System.out.println("Pagamento realizado no dia "+ department.getPayDay());
		System.out.println("Funcionarios:");
		
		for (Employee emp: department.getEmployee()) {
			System.out.println(emp.getName());
		}
		
		System.out.println("Para dúvidas favor entrar em contato: " + department.getAddress().getEmail());
		
	}
}
