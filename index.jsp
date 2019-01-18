<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("#login")
				.click(
						function() {
							var roll = $("#roll").val();
							var uname = $("#uname").val();
							//alert(uname);
							var url = "http://localhost:8080/RestWithJavaConfig/rest/student/test?name="
									+ uname;
							$("#getData").load(url);
						});
	});
</script>
<body>
	<span id="getData"></span>
	<br> Roll No :
	<input type="text" id="roll" name="roll">
	<br> Name :
	<input type="text" id="uname" name="uname">
	<br>
	<button id="login">Login</button>
</body>