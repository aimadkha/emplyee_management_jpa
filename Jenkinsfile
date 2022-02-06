pipeline{
	agent any
	
	stages{
		stage('Build'){
			steps {
				git url: 'https://github.com/aimadkha/emplyee_management_jpa.git', branch: 'main'
				//sh './mvn clean compile'
				sh 'mvn clean complie'
				
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