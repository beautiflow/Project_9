let index = {
    init: function () {
        $("#btn-save").on("click", () => {
            this.save();
        });
        $("#btn-login").on("click", () => {
            this.login();
        });
    },

    save: function () {
       //  alert('user의 save 함수 호출됨');
        let data = {
            username: $("#username").val(),
            password: $("#password").val(),
            email: $("#email").val()
        };

        //console.log(data);
        $.ajax({
            type: "POST",
            url: "/api/user",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "text"
        }).done(function (resp) {
            alert("회원가입이 완료되었습니다.");
            console.info();
            location.href = "/"
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },

    login: function () {
        //  alert('user의 save 함수 호출됨');
        let data = {
            username: $("#username").val(),
            password: $("#password").val(),
        };

        $.ajax({
            type: "POST",
            url: "/api/user/login",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: "text"
        }).done(function (resp) {
            alert("로그인이 완료되었습니다.");
            location.href = "/"
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }
}

index.init();