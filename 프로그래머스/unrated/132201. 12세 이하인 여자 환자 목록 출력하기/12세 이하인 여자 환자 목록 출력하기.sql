select PT_NAME, PT_NO, GEND_CD, AGE,IFNULL(TLNO,'NONE') as TLNO
from PATIENT
where age <='12'
AND GEND_CD = 'W'
order by age desc,PT_NAME