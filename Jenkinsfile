pipeline{
	agent any
	
	stages{
		stage('Build project'){
			steps {
				git url: 'https://github.com/aimadkha/emplyee_management_jpa.git', branch: 'main'
				//sh './mvn clean compile'
				sh 'mvn clean install -DskipTests'
				//sh 'mvn build'
				
			}
		}
		
		stage('Test'){
			steps {
				//sh './mvn test'
				sh 'mvn test'
			}

			post{
				always{
					junit '**/target/surefire-reports/TEST-*.xml'
				}
			}
		}
	}
}