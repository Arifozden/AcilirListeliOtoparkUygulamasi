$(function (){
    tumArabalariGetir();
});

function tumArabalariGetir(){
    $.get("/arabalariGetir",function (arabalar){
        arabalariDuzenle(arabalar);
    });
}

function arabalariDuzenle(arabalar){
    let yaz="<select id='seciliMarka' onchange='modelBul()'>";
    let oncekiMarka="";
    yaz+="<option>Marka Sec</option>";

    for(const araba of arabalar){
        if(araba.marka!==oncekiMarka){
            yaz+="<option>"+araba.marka+"</option>";
        }
        oncekiMarka=araba.marka;
    }
    yaz+="</select>";
    $("#marka").html(yaz);
}

function modelBul(){
    const seciliMarka=$("#seciliMarka").val();
    $.get("/arabalariGetir",function (arabalar){
        modelleriDuzenle(arabalar,seciliMarka);
    });
}

function modelleriDuzenle(arabalar, seciliMarka){
    let yaz="<select id='seciliModel'>";
    for(const araba of arabalar){
        if(araba.marka===seciliMarka){
            yaz+="<option>"+araba.model+"</option>";
        }
    }
    yaz+="</select>";
    $("#model").html(yaz);
}
function kayit() {
    const musteri = {
        tc: $("#tc").val(),
        isim: $("#isim").val(),
        soyisim: $("#soyisim").val(),
        adres: $("#adres").val(),
        plaka: $("#plaka").val(),
        marka: $("#seciliMarka").val(),
        model: $("#seciliModel").val(),
        yil: $("#yil").val()
    };
    $.post("/kayit", musteri, function () {
        hepsiniGetir();
    });
    $("#tc").val("")
    $("#isim").val("")
    $("#soyisim").val("")
    $("#adres").val("")
    $("#plaka").val("")
    $("#seciliMarka").val("")
    $("#seciliModel").val("")
    $("#yil").val("")
}
function hepsiniGetir(){
    $.get("/hepsiniGetir",function (data){
        bilgiDuzen(data);
    });
}

function bilgiDuzen(musteriler){
    let yaz="<table class='table table-striped'><tr><th>TC</th><th>Isim</th>" +
        "<th>Soyisim</th><th>Adres</th>" +
        "<th>Plaka</th><th>Marka</th><th>Model</th><th>Yil</th></tr>";
    for(const musteri of musteriler){
        yaz+="<tr><td>"+musteri.tc+"</td><td>"+musteri.isim+"</td><td>"+musteri.soyisim+
            "</td><td>"+musteri.adres+"</td><td>"+musteri.plaka+"</td><td>"+musteri.marka+
            "</td><td>"+musteri.model+"</td><td>"+musteri.yil+"</td></tr>"
    }
    yaz+="</table>";
    $("#musteriler").html(yaz);
}

function hepsiniSil(){
    $.get("/hepsiniSil",function (){
        hepsiniGetir();
    });
}
