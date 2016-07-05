
function InserirTurma(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";	 	
	document.getElementById('InserirTurma').className="active";
 	document.getElementById('subConteudoTurma').innerHTML='<iframe src="InserirTurma.html" width=100% height=100%  frameborder="no" scrolling="yes"> </iframe>' 	//$("#conteudo").load('PagDisc.html'); 
 }



function ListarTurma(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";
 	document.getElementById('ListarTurma').className="active";
 	document.getElementById('subConteudoTurma').innerHTML='<iframe src="ListarTurma.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';
	//document.getElementById('subConteudoTurma').innerHTML = '<iframe src="../pageNotFound.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';
}

function EditarTurma(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";
 	document.getElementById('EditarTurma').className="active";
 	//document.getElementById('subConteudoTurma').innerHTML='<iframe src="ListarTurma.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';
	document.getElementById('subConteudoTurma').innerHTML = '<iframe src="../pageNotFound.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';
}