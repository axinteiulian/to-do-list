window.ToDoList = {

    API_BASE_URL:"http://localhost:8081/tasks",

    getTasks: function () {
        $.ajax({

            url:ToDoList.API_BASE_URL, method:"GET"
        }).done(function (response) {
            console.log(response);

        })

    }



};

ToDoList.getTasks();
