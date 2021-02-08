pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github-mysite', url: 'https://github.com/zxstar/mymvnweb.git/']]])
            }
        }
        
        stage("build project") {
            steps {
                sh "mvn clean package"
            }
        }
        
        stage("deploy project") {
            steps {
                deploy adapters: [tomcat8(credentialsId: 'tomcat_user', path: '', url: 'http://47.111.230.39:8080/')], contextPath: null, war: 'target/mavenweb.war'
            }
        }
    }
}

