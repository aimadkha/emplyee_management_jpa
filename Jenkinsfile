pipeline{
	agent any
	
	stages{
		stage('Build'){
			steps {
				git 'https://github.com/aimadkha/emplyee_management_jpa.git'
				sh './mvn clean compile'
				// bat '.\mvnw clean complie'
				
			}
		}
		
		stage('Test'){
			steps {
				sh './mvn test'
				// bat '.\mvnw test'
			}

			post{
				always{
					junit '**/target/surefire-reports/TEST-*.xml'
				}
			}
		}
	}
}