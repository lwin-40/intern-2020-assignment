window.addEventListener("load", function(){
	var inputMessage = document.getElementById('input_message');
	
	var inputCount = document.getElementById('input_count');
	var color=document.getElementById('input_color1');
	var backgroundcolor=document.getElementById('input_color2');
	var buttonPrint = document.getElementById('button_print');
	//var buttonClear = document.getElementById('button_clear').;
	var outputContxt = document.getElementById('contxt');
 


	buttonPrint.addEventListener("click",function(){
		createElements(inputCount.value, inputMessage.value , color.value, backgroundcolor.value,  outputContxt );
	});
	
	
});

 function createElements(count, message, txtColor , backColor ,outputContxt) {
 	var i;
	for (i = 0; i < count; i++) {
 		var pTag = document.createElement("p");
 		var text = document.createTextNode(message);
		pTag.appendChild(text);
		outputContxt.appendChild(pTag).style.color = txtColor;
		outputContxt.appendChild(pTag).style.backgroundColor=backColor;
		
		
 	}
 	 }
