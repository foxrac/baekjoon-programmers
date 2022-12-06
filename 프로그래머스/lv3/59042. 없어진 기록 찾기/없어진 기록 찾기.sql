select b.ANIMAL_ID,b.NAME
from ANIMAL_INS a
right join ANIMAL_OUTS b on b.ANIMAL_ID=a.ANIMAL_ID
where a.ANIMAL_ID is null
order by b.ANIMAL_ID,b.NAME