pipeline{
	agent any
	tools{
		maven 'maven_3_8_4'
	}
	stages{
		stage('Build'){
			steps {
				git 'https://github.com/aimadkha/emplyee_management_jpa.git'
				//sh './mvn clean compile'
				bat 'mvn clean complie'
				
			}
		}
		
		stage('Test'){
			steps {
				//sh './mvn test'
				bat 'mvn test'
			}

			post{
				always{
					junit '**/target/surefire-reports/TEST-*.xml'
				}
			}
		}
	}
}