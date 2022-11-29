select DATE_FORMAT(b.sales_date,'%Y') YEAR,DATE_FORMAT(b.sales_date,'%m') MONTH,
count(DISTINCT(b.USER_ID)) PUCHASED_USERS,round(COUNT(DISTINCT(b.USER_ID))/
(select count(*) from USER_INFO c where DATE_FORMAT(c.joined,'%Y')='2021'),1) PUCHASED_RATIO
from USER_INFO a
join ONLINE_SALE b on a.USER_ID=b.USER_ID
where DATE_FORMAT(a.joined,'%Y')='2021'
group by MONTH
order by YEAR asc,MONTH asc