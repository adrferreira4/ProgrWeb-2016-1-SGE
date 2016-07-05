 function loadProfessor(){
 	var x = document.getElementsByClassName('active');
		if(x[0] != null) x[0].className="inactive";
 	document.getElementById('PagProfessor').className="active";
 	document.getElementById('conteudo').innerHTML='<iframe src="Professor/PagProfessor.html" width=100% height=100% frameborder="no" scrolling="no"> </iframe>'
 	//$("#conteudo").load('PagDisc.html'); 
 	
}

 function loadAluno(){
 	var x = document.getElementsByClassName('active');
		if(x[0] != null) x[0].className="inactive";
 	document.getElementById('PagAluno').className="active";
 	document.getElementById('conteudo').innerHTML='<iframe src="Aluno/PagAluno.html" width=100% height=100% frameborder="no" scrolling="no"> </iframe>'
 	//$("#conteudo").load('PagDisc.html'); 
 	
}

 function loadDisciplina(){
 	var x = document.getElementsByClassName('active');
		if(x[0] != null) x[0].className="inactive";
 	document.getElementById('PagDisciplina').className="active";
 	document.getElementById('conteudo').innerHTML='<iframe src="Disciplina/PagDisciplina.html" width=100% height=100% frameborder="no" scrolling="no"> </iframe>'
 	//$("#conteudo").load('PagDisc.html'); 
 	
}

 function loadTurma(){
 	var x = document.getElementsByClassName('active');
		if(x[0] != null) x[0].className="inactive";
 	document.getElementById('PagTurma').className="active";
 	document.getElementById('conteudo').innerHTML='<iframe src="Turma/PagTurma.html" width=100% height=100% frameborder="no" scrolling="no"> </iframe>'
 	//$("#conteudo").load('PagDisc.html'); 
 	
}