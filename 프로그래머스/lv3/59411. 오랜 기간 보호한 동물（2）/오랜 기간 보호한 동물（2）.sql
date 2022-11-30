select a.ANIMAL_ID,a.NAME
from ANIMAL_INS a
left join ANIMAL_OUTS b
on a.ANIMAL_ID = b.ANIMAL_ID
where b.DATETIME is not null
order by DATEDIFF(b.DATETIME,a.DATETIME) desc limit 2