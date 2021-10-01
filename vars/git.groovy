def call(map stageParams){
  checkout([
	$class: 'GitSCM', 
	branches: [[name: '*/master']], 
	extensions: [], 
	userRemoteConfigs: [[url: 'https://github.com/AKBARMOHAMMAD/Sample_maven_project.git']]
])

}
