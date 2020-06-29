package com.SpringBoot;

import javax.persistence.*;

@Entity
	@Table(name="Jnit_emp")
	public class Employee{
		
		@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer Id;
		
		@Column(name="name")
		private String name;
		
		@Column(name="Salary")
		private Double Salary;

		public Integer getId() {
			return Id;
		}

		public void setId(Integer id) {
			Id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getSalary() {
			return Salary;
		}

		public void setSalary(Double salary) {
			Salary = salary;
		}
}


