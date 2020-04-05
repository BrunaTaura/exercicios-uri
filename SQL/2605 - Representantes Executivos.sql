select p.name, f.name from products p 
join providers f on f.id = p.id_providers 
join categories c on c.id = p.id_categories 
where c.id = '6';