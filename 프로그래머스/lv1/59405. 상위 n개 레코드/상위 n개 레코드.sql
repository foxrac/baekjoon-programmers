select name 
from ANIMAL_INS
where DATETIME=(select MIN(DATETIME) from ANIMAL_INS)