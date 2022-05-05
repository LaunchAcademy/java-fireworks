# Instructions

- On `/fireworks/new` there should be a form to add a new firework with all it's fields
- After submitting the form, the new firework should be added to the list stored in session.
- The user should be redirected back to `/fireworks`
  
  
- When I navigate to `/fireworks`, I should see a list all fireworks
- For each firework, list it's name and description
- For each firework, there should be a link that takes me to `/fireworks/<id>` that shows the full
  description of the firework
  
  
- On the firework show page (`/fireworks/<id>`), I want to see all of the specific firework's
  attributes:
  name, description, price, loudnessRating;
- On the firework show page, I want to see the font color changed based on the loudness rating of
  the firework.
    - Account for possible loudness ratings from 1 to 3.
