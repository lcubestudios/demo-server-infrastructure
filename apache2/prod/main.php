<?php

$host = '172.18.0.2';
$dbname = 'intouch';
$user = 'postgres';
$password = 'postgres';
//$db_handle = pg_connect($host, $dbname, $user, $password);
$db_handle = pg_connect("host=$host port=5432 dbname=$dbname user=$user password=$password");
if ($db_handle) {

echo 'Connection attempt succeeded.';

} else {

echo 'Connection attempt failed.';

}
echo "<h3>Connection Information</h3>";

echo "DATABASE NAME:" . pg_dbname($db_handle) . "<br>";

echo "HOSTNAME: " . pg_host($db_handle) . "<br>";

echo "PORT: " . pg_port($db_handle) . "<br>";

pg_close($db_handle);

?>