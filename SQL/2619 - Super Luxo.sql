select p.name, f.name, p.price from products p 
join providers f on f.id = p.id_providers
join categories c on c.id = p.id_categories
where p.price > '1000' and c.name like 'Super Luxury';