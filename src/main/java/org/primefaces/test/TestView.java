package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {

	private TestClass testClass;
	private List<TestClass> testClasses;

	@PostConstruct
	public void init() {
		testClass = new TestClass();
		testClasses = new ArrayList<>();
		testClasses.add(new TestClass(1));
	}

	public TestClass getTestClass() {
		return testClass;
	}

	public void setTestClass(TestClass testClass) {
		this.testClass = testClass;
	}

	public List<TestClass> getTestClasses() {
		return testClasses;
	}

	public void setTestClasses(List<TestClass> testClasses) {
		this.testClasses = testClasses;
	}

}
