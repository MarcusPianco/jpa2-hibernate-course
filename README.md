# jpa2-hibernate-curse

Curso Introdutório de JPA/Hibernate ministrado para a Turma de ciências da Computação do Instituto de Computação - UFAL 

Este Curso tem o propósito de demonstrar de maneira  prática o uso de JPA/Hibernate para a persistência de dados em um Data Base.

Aplicações e Frameworks utilizadas durante o Curso:

  	JDK 8,
  	Eclipse SDK,
	MySql,
  	Hibernate;
  
O projeto é criado a partir de uma ferramenta denominada MAVEN, desenvolvida e mantida pela Apache e integrada a muitos SDks tais como Eclipse, ItelliJ IDE e outros. A ferramenta Maven tem o propósito gerenciar as dependências e automatizar seus builds. Suas configurações são editadas e acessadas pelo file  pom.xml  contido na pasta raiz de um dado projeto.

	Vantagens de usar Maven:
		Centralizar Libraries;
		Manutensão em Projetos Compartilhados;
		Vasta quantidade de libraries disponíveis.
	


Intruções de Instalação:

Instalando JDK 8:

  Ubuntu :
        
        Abrir o terminal e digitar os seguintes comandos:
            sudo add-apt-repository ppa:webupd8team/java
            sudo apt-get update
            sudo apt-get install oracle-java8-installer
        
            sudo apt-get install oracle-java8-set-default
        
        Testando a Instalação:
          Abrir o terminal e digitar os seguintes comandos:
            
                java -version
                
            Deve Aparecer as Seguintes informações:
            
                java version "1.8.0_91"
                Java(TM) SE Runtime Environment (build 1.8.0_91-b14)
                Java HotSpot(TM) 64-Bit Server VM (build 25.91-b14, mixed mode)
                
    Obs:. A versão (java version "1.8.0_91") pode variar de acordo com as atualizações feitas pela Oracle.
    
Instalando MySql:

  Ubuntu :
        
        Abrir o terminal e digitar os seguintes comandos:
           
            sudo apt-get install mysql-server
            
        obs:. Configurar o usuario ROOT com o password: admin
        
        
            sudo apt-get install mysql-workbench
        
           
           
           
Download Instalador Eclipse Ubuntu:
    
    https://www.eclipse.org/downloads/download.php?file=/oomph/epp/neon/R/eclipse-inst-linux64.tar.gz&mirror_id=576
    
    Após baixar, extrair o file eclipse-inst-linux64.tar.gz e executar o file eclipse-inst, apenas clicar na 1a opção de download e Clicar em Install.


Intruções de Instalação:
    
    Windows:
    
    
        Instalando JDK :
        
            https://www.youtube.com/watch?v=CMHU5buXvNw&feature=youtu.be
        
        
        Instalando MySql:
            
            http://www.devmedia.com.br/instalando-e-configurando-a-nova-versao-do-mysql/25813
            
        Download Instalador Eclipse no Windows:
            
            https://eclipse.org/downloads/
            
            obs:. Apenas Baixar e executar o Instalador.
            


Instruções de Criação do Projeto no Eclipse:

    File->New->Project->Maven->Maven Project
    
    Observações Importantes: 
    
        Preencher groupOd como :     "br.ufal.ic"
        Preencher artifactId como :  "crudLearningJPA"
        
        :. As Informações acima podem ser editadas sem maiores prejuizos.


Configuração do pom.xml:

    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	    <modelVersion>4.0.0</modelVersion>

	    <groupId>br.ufal.ic</groupId>
	    <artifactId>crudLearningJPA</artifactId>
	    <version>0.0.1-SNAPSHOT</version>
	    <packaging>jar</packaging>

	    <name>crudLearningJPA</name>
	    <url>http://maven.apache.org</url>

	    <properties>
		    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	    </properties>

	    <dependencies>

		    <dependency>
			    <groupId>mysql</groupId>
			    <artifactId>mysql-connector-java</artifactId>
			    <version>5.1.26</version>
		    </dependency>
		    
		    <dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>5.0.0.Final</version>
		</dependency>
		
	    </dependencies>
	
    </project>
    
    
As outras instruções foram dadas durante o Curso, qualquer dúvida entrar em contato:macpj@ic.ufal.br

Referências:

    http://tecadmin.net/install-oracle-java-8-jdk-8-ubuntu-via-ppa/#
    http://www.devmedia.com.br/instalando-e-configurando-a-nova-versao-do-mysql/25813
    http://docs.jboss.org/hibernate/orm/5.2/quickstart/html_single/#obtaining
    
    
    


        
    

    
        
        

            
            
    
        




  
  
