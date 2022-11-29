select a.FOOD_TYPE,a.REST_ID,a.REST_NAME,a.FAVORITES
from REST_INFO as a ,(select MAX(FAVORITES) as d from REST_INFO b group by FOOD_TYPE) c
where a.FAVORITES= d
group by FOOD_TYPE
order by FOOD_TYPE desc