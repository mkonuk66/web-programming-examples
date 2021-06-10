try {
  $(document).ready(function () {
    $("#updateForm").on("submit", function () {
      $.ajax({
        url: "rest/userInfo",
        type: "PUT",
        dataType: "application/xml",
        data: $("#updateForm").serialize(),
        success: function (xml) {
          console.log(xml);
          var user = "";
          $(xml)
            .find("User")
            .each(function () {
              $(this)
                .find("id")
                .each(function () {
                  var id = $(this).text();
                  console.log(id);
                  user = user + "ID: " + id;
                });
              $(this)
                .find("name")
                .each(function () {
                  var name = $(this).text();
                  console.log(name);
                  user = user + " Name: " + name;
                });
              $(this)
                .find("email")
                .each(function () {
                  var email = $(this).text();
                  console.log(email);
                  user = user + " Email: " + email;
                });
              $(this)
                .find("country")
                .each(function () {
                  var country = $(this).text();
                  console.log(country);
                  user = user + " Country: " + country;
                });
            });
          alert(user);
        },
      });
      return true;
    });

    $("#deleteForm").on("submit", function () {
      $.ajax({
        url: "rest/userInfo",
        type: "DELETE",
        dataType: "application/xml",
        data: $("#deleteForm").serialize(),
        success: function (xml) {
          console.log(xml);
          $(xml)
            .find("User")
            .each(function () {
              $(this)
                .find("id")
                .each(function () {
                  var id = $(this).text();
                  console.log(id);
                  alert("Deleted the user with id " + id);
                });
            });
        },
      });
      return true;
    });
  });
} catch (err) {
  document.innerHTML = err.message;
}
