pipeline {
	agent none
	stages {
	
		stage('Step-by-Step'){
			agent{
				label 'master'
			}
			steps{
				echo 'This stage will be the first'
			}
		}
		stage('Run Tests in Parallel'){
			parallel{
				stage('Test on local'){
					agent {
						label 'master'
					}
					steps {
						echo 'Task on local'
					}
				}
				stage('Test on external HDD'){
					agent {
						label 'Windows_Node'
					}
					steps {
						echo 'Task on external HDD'
					}
				}
			}
		}
	}
}
