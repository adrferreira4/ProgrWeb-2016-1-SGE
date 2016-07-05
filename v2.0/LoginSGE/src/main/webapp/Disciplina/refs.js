
function InserirDisc(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";	 	
	document.getElementById('InserirDisc').className="active";
 	document.getElementById('subConteudoDisciplina').innerHTML='<iframe src="InserirDisc.html" width=100% height=100%  frameborder="no" scrolling="yes"> </iframe>'
 	//$("#conteudo").load('PagDisc.html'); 
 }



function ExcluirDisc(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";
 	document.getElementById('ExcluirDisc').className="active";
 	document.getElementById('subConteudoDisciplina').innerHTML='<iframe src="ExcluirDisc.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';
 		
}

function ListarDisc(){
	var x = document.getElementsByClassName('active');
	if(x[0] != null) x[0].className="inactive";
 	document.getElementById('ListarDisc').className="active";
 	//document.getElementById('subConteudoDisciplina').innerHTML='<iframe src="ListarDisc.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';
 	document.getElementById('subConteudoDisciplina').innerHTML = '<iframe src="../pageNotFound.html" width=80% height=100%  frameborder="no" scrolling="yes"> </iframe>';	
}