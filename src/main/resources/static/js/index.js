$(
    initData()
);

function initData() {
    $.ajax({
        type : "post",
        url : "/userInfo",
        data : "",
        async : false,
        dataType: 'json',
        success : function(result) {
            debugger;
            var str = "<label>姓名：" + result.name + "</label>"
                + "<label>年龄：" + result.age + "</label>"
                + "<label>性别：" + result.sax + "</label>";
            layer.alert(str);
        },
        error:function(result){
            alert("error");
        }
    });
}