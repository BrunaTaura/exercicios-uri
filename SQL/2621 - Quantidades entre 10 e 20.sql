select p.name from products p 
join providers f on f.id = p.id_providers
where p.amount between '10' and '30' and f.name like 'P%';