
class Service{


    static get(theUrl, getter, callback)
    {
        var xmlHttp = new XMLHttpRequest();
        xmlHttp.onreadystatechange = function() {
            if (xmlHttp.readyState == 4 && xmlHttp.status == 200){
                callback(getter,xmlHttp.response);
            }
        }
        xmlHttp.open("GET", theUrl, true);
        xmlHttp.send(null);
    }

    static post(theUrl,data, callback)
    {
        var xmlHttp = new XMLHttpRequest();
        xmlHttp.onreadystatechange = function() {
            if (xmlHttp.readyState == 4 && xmlHttp.status == 200)
                if(callback)
                    callback(xmlHttp.response);
        }
        xmlHttp.open("GET", theUrl, true);
        xmlHttp.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
        xmlHttp.send(JSON.stringify(data));
    }
}
