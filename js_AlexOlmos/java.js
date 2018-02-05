function cambioColor (box){ 
	box.style.backgroundColor = "orange"; 
};

function cambioColorReturn(box){ 
	box.style.backgroundColor= "white"; 
};


function mostrarBBDD(box){
var elemento = document.getElementById('Bbdd');
	if (elemento.style.display == "none") {
		elemento.style.display = "block"
	} else {
		elemento.style.display = "none"
	};
return true;
};

function mostrarLLMM(box){
var elemento = document.getElementById('Llmm');
	if (elemento.style.display == "none") {
		elemento.style.display = "block"
	} else {
		elemento.style.display = "none"
	};
	return true;
};

function mostrarProgramación(box){
	var elemento = document.getElementById('Progra');
	if (elemento.style.display == "none") {
		elemento.style.display = "block"
	} else {
		elemento.style.display = "none"
	};
	return true;
};

function mostrarFOL(box){
	var elemento = document.getElementById('Fol');
	if (elemento.style.display == "none") {
		elemento.style.display = "block"
	} else {
		elemento.style.display = "none"
	};
	return true;
};

function mostrarSSII(box){
	var elemento = document.getElementById('Ssii');
	if (elemento.style.display == "none") {
		elemento.style.display = "block"
	} else {
		elemento.style.display = "none"
	};
	return true;
};