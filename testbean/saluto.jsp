<html>
	<jsp:useBean id="s" class="mieibeans.CiaoBean"/>
	<p>Beans</p>

	<h3>Metodo Get</h3>
	<form action="" method="get">
	<jsp:setProperty name="s" property="termine" param="Abbondante" />
	<input type="text"name="termine">
	<input type="submit" value="">
	</form>


	<h3>Metodo Post</h3>
	<form action="" method="post">

		
	</form>


	<jsp:getProperty name="s" property="saluto" />
	<jsp:getProperty name="s" property="utenti" />

</html>
