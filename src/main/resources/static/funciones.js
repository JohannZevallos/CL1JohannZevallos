function eliminar (id){
	swal({
	  title: "¿ Estás seguro de eliminar?",
	  text: "¡ Una vez eliminado, no podrás recuperar este archivo imaginario!",
	  icon: "advertencia",
	  buttons: true,
	  dangerMode: true,
	})
	.then((OK) => {
	  if (OK) {
		  $.ajax({
			  url:"/eliminar/"+id,
			  success: function(res){
				  console.log(res);
			  }
		  });
	    swal("¡Tu archivo imaginario ha sido eliminado!", {
	      icon: "success",
	    }).then((ok)=>{
			if(ok){
				location.href="/listar";
			}
		});
	  } else {
	    swal("¡ Tu archivo imaginario está a salvo!");
	  }
	});
}