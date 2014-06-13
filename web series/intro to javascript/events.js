function go() {
    var b = document.createElement('button');
    var t = document.createTextNode('Click me');
    b.appendChild(t);
    
	
	
	
	b.addEventListener('click', button);
	
    var d = document.getElementById('myId');
    d.appendChild(b);
	
}


function button(){
  window.alert('you clicked me');

}
window.addEventListener('load', go);