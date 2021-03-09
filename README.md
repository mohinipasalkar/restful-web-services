# restful-web-services
Implementation of restful webservices using SpringBoot
 
# RESTful web services for Social Media application

User makes a lot of posts.

Implementation of following web-services

Users -> Posts

- Retrieve all Users		- GET /users
- Create a User				- POST /users
- Retrieve one User			- GET /users/{id} -> /users/1
- Delete a specific User	- DELETE /users/{id} -? /users/1

- Retrieve all posts for a User 	- GET /users/{id}/posts
- Create a posts for a User 		- POST /users/{id}/posts
- Retrieve the details of a post 	- GET /users/{id}/posts/{post_id}
