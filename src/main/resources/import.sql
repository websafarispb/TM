-- Users
INSERT INTO users (id, name, address, email, phone, login, password, role) VALUES (1, 'Alice Admin', '123 Admin St', 'alice@bookshop.com', '1234567890', 'admin', 'adminpass', 'ADMIN');

INSERT INTO users (id, name, address, email, phone, login, password, role) VALUES (2, 'Mark Manager', '456 Manager Rd', 'mark@bookshop.com', '0987654321', 'manager', 'managerpass', 'MANAGER');

INSERT INTO users (id, name, address, email, phone, login, password, role) VALUES (3, 'Cathy Customer', '789 Customer Ave', 'cathy@bookshop.com', '1112223333', 'customer', 'custpass', 'CUSTOMER');

-- Products
INSERT INTO product (id, name, description, author, price, image_path) VALUES (1, 'Book 1', 'Awesome book', 'Author 1', 9.99, 'img/book1.jpg');

INSERT INTO product (id, name, description, author, price, image_path) VALUES (2, 'Book 2', 'Another one', 'Author 2', 12.50, 'img/book2.jpg');

-- Bookings
INSERT INTO booking (id, user_id, product_id, delivery_address, delivery_date, delivery_time, status, quantity) VALUES (1, 1, 1, '123 Admin St', '2025-04-10', '2025-04-10T15:00:00', 'SUBMITTED', 2);

INSERT INTO booking (id, user_id, product_id, delivery_address, delivery_date, delivery_time, status, quantity) VALUES (2, 3, 2, '789 Customer Ave', '2025-04-12', '2025-04-12T18:30:00', 'CANCELLED', 1);

-- Store items (book_store)
INSERT INTO book_store (id, product_id, available_qty, booked_qty, sold_qty) VALUES (1, 1, 10, 2, 5);

INSERT INTO book_store (id, product_id, available_qty, booked_qty, sold_qty) VALUES (2, 2, 7, 1, 3);

