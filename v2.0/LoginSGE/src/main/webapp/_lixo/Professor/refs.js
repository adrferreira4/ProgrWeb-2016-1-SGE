
function InserirProfessor(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";	 	
	document.getElementById('InserirProfessor').className="active";
 	document.getElementById('subConteudoProfessor').innerHTML='<iframe src="InserirProfessor.html" width=100% height=100%  frameborder="no" scrolling="yes"> </iframe>'
 	//$("#conteudo").load('PagDisc.html'); 
 }

function ListarProfessor(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";
 	document.getElementById('ListarProfessor').className="active";
 	document.getElementById('subConteudoProfessor').innerHTML = '<iframe src="ListarProfessor.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';	
}

function VinculosProfessor(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";
 	document.getElementById('VinculosProfessor').className="active";
 	document.getElementById('subConteudoProfessor').innerHTML='<iframe src="../pageNotFound.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';
 		
}