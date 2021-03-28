## Part 1: Test it with SQL
--columns: id, employer, name, skills
--data types: no data in table; all values are null

## Part 2: Test it with SQL
SELECT * FROM employer
WHERE location = "Bentonville, AR";

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT name, description
FROM skill
INNER JOIN job_skills ON skill.id = job_skills.skills_id
WHERE jobs_id IS NOT NULL
ORDER BY name ASC;