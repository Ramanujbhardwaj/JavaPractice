package com.macys.reader;

class Student extends Person1{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    public Student(String firstName, String lastName, int identification, int[] test){
        super(firstName, lastName, identification);
        testScores = test;
        this.calculate();
    }
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate(){
    	int sum = 0;
    	for(int i=0; i<testScores.length; i++){
    		sum += testScores[i];
    	}
    	int avg = sum/testScores.length;
    	if(avg>=90&&avg<=100)
            return 'O';
        if(avg>=80&&avg<90)
            return 'E';
        if(avg>=70&&avg<80)
            return 'A';
        if(avg>=55&&avg<70)
            return 'P';
        if(avg>=40&&avg<55)
            return 'D';
        if(avg<40)
            return 'T';
    	return '0';
    }
    // Write your method here
}