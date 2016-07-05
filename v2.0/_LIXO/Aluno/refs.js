
function InserirAluno(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";	 	
	document.getElementById('InserirAluno').className="active";
 	document.getElementById('subConteudoAluno').innerHTML='<iframe src="InserirAluno.html" width=100% height=100%  frameborder="no" scrolling="yes"> </iframe>'
 	//$("#conteudo").load('PagDisc.html'); 
 }



function ListarAluno(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";
 	document.getElementById('ListarAluno').className="active";
 	document.getElementById('subConteudoAluno').innerHTML='<iframe src="ListarAluno.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';
 		
}

function EditarAluno(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";
 	document.getElementById('EditarAluno').className="active";
 	//document.getElementById('subConteudoDisciplina').innerHTML='<iframe src="ListarDisc.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';
 	document.getElementById('subConteudoAluno').innerHTML = '<iframe src="../pageNotFound.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';	
}