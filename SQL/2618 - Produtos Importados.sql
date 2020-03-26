select p.name, f.name, c.name from products p 
join providers f on f.id = p.id_providers
join categories c on c.id = p.id_categories
where f.name like 'Sansul SA' and c.name like 'Imported';