select count(*) as USERS
from USER_INFO
where age>=20
and age<=29
and 2021= DATE_FORMAT(JOINED,'%Y')