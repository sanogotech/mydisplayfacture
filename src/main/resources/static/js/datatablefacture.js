$(document).ready( function () {

	 var table = $('#facturesTable').DataTable({
			"sAjaxSource": "/facture",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "drName"},
		          { "mData": "numFacture" },
				  { "mData": "periodeFacture" },
				  { "mData": "exploitation" },
				  { "mData": "refContratIdentifiant" },
				  { "mData": "nomPrenom" },
				  { "mData": "montantFactTTC" },
				  { "mData": "totalMontantImpayes" }
		
			]
	 });
	 
	  //for table row
	  $("tr:even").css("background-color", "#F4F4F8");
	  $("tr:odd").css("background-color", "#EFF1F1");
});


