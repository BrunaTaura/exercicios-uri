select p.name, f.name from products p 
join providers f 
on f.id = p.id_providers 
where f.name like 'Ajax SA';
