# WAAspringProject

Web Applications Architecture and FrameWorks Spring Project
READ Me!!!!!!!!!!!!!

How it works. 

1. Download Zip or Clone from GIThub
2. Seet up application
3. Give Password and username for your database platform in application properties
4.After setting up Application Properties file with your database authentication info (Password and UserName);
5.Run the the Project
6.On the Welcome Page, Click sign up to add a user
7.Get to persons Table in your database to assign the the signed up user to be an administrator(This is accomplished by
8.setting role value to ADMIN and isAdmin value to 1)
9.Then you can now log in to the System as an administrator and see the administrator dashboard
10.If you log in using the created user details(email and Password) you will only see the user section of only being able to buy products
11.Maintain the list of products, Create and List persons, List Orders

////This Querry can insert an admin guy into the database://///

INSERT INTO person (id, email, enable, first_name, is_admin, last_name, password, phone, role, address_id)
VALUES (15, 'bbwambale@mum.edu', 0,'basi Yonah',1, 'Bwambale', 123, '+13126474291', 'ADMIN', 1);

