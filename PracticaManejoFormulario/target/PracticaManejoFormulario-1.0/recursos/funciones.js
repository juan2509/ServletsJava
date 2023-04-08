function validarForm(form) {
    
    //Validacion del nombre
    var usuario = form.nombre;
    if (usuario.value == "") {
        alert("Ingresa tu nombre");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    //validacion del apellido
    var apellidoP = form.apellidoP;
    if (apellidoP.value == "") {
        alert("Ingresa tu apellido paterno");
        apellidoP.focus();
        apellidoP.select();
        return false;
    }
    
    //validacion del genero
    var genero = form.sexo;
    var radioSeleccionado = false;    
    
    for(var i = 0; i < genero.length ; i++) {
        if(genero[i].checked) {
            radioSeleccionado = true;
        }
    }
    
    if(!radioSeleccionado) {
        alert("Selecciona tu género");
        return false;
    }
    
    //Validacion del correo
    var correo = form.correo;
    if (correo.value == "") {
        alert("Ingresa tu correo");
        correo.focus();
        correo.select();
        return false;
    }
    
    //validacion del telefono
    var telefono = form.telefono;
    if(telefono.value == "") {
        alert("Ingresa tu teléfono");
        telefono.focus();
        telefono.select();
        return false;
    } else if(telefono.value.length > 10 || telefono.value.length < 10) {
        alert("Teléfono erróneo!, este debe ser exactamente de 10 dígitos.");
        telefono.focus();
        telefono.select();
        return false;
    }
    
    //validacion de fecha de nacimiento
    var fechaN = form.fechaNacimiento;
    if(fechaN.value == "") {
        alert("Ingrese su fecha de nacimiento");
        fechaN.focus();
        fechaN.select();
        return false;
    }
    
    //Validacion de la nacionalidad
    var nacionalidad = form.nacionalidad;
    if(nacionalidad.value == "") {
        alert("Ingrese su nacionalidad");
        nacionalidad.focus();
        nacionalidad.select();
        return false;
    }

    //Validacion de tecnologias
    var tecnologias = form.tecnologia;
    var checkSeleccionado = false;
    
    for(var i = 0; i < tecnologias.length; i++) {
        if(tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }
    
    if (!checkSeleccionado) {
        alert("Debe seleccionar al menos una tecnología");        
        return false;
    }
    
    //validacion de ocupacion
    var ocupacion = form.ocupacion;
    if(ocupacion.value == "") {
        alert("Seleccione su ocupación actual");
        return false;
    }
    
    //validacion de comentarios
    var comentario = form.comentarios;
    if(comentario.value == "") {
        alert("Por favor agregue un comentario para que su solicitud pueda ser enviada.");
        comentario.focus();
        comentario.select();
        return false;
    }
    
    // si el formulario esta correcto se regresa un TRUE
    alert("Formulario completo!!, la solicitud fue enviada.");
    return true;
    
}

