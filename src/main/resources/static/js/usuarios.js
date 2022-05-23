// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargaUsuarios();
  $('#usuarios').DataTable();
});

async function cargaUsuarios(){
  const request = await fetch('usuario/234', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const usuarios = await request.json();
  console.log(usuarios);
}
