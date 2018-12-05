$(document).ready( function () {
	 var table = $('#statementTable').DataTable({
			"sAjaxSource": "/statement",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "tran_id"},
		      { "mData": "Transacton_Type" },
				  { "mData": "Description" },
				  { "mData": "Amount" },
				  { "mData": "Date" },
				  { "mData": "Current_Bal" }
			]
	 })
});