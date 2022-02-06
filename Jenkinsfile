pipeline{
	agent any
	
	stages{
		stage('Build'){
			steps {
				git 'https://github.com/aimadkha/emplyee_management_jpa.git'
				//sh './mvnw clean compile'
				bat '.\mvn clean complie'
				
			}
		}
		
		stage('Test'){
			steps {
				//sh './mvnw test'
				bat '.\mvn test'
			}

			post{
				always{
					junit '**/target/surefire-reports/TEST-*.xml'
				}
			}
		}
	}
}