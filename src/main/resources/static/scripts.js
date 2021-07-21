$(".delete-button").on("click", function (){
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    headers = {};
    headers[header] = token
    url =`/convidados/${this.value}`
    $.ajax({
        "type": 'delete',
        "url": url,
        "headers": headers
    }).done(function(){
        window.location = "/convidados"
   	})
})

$(".confirm-button").on("click", function (){
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    headers = {};
    headers[header] = token
    url =`/convidados/${this.value}`
    $.ajax({
        "type": 'get',
        "url": url,
        "headers": headers
    }).done(function(){
        window.location = "/convidados"
   	})

})