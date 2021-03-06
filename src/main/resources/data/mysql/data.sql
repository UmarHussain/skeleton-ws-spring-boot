/*
 * MySQL script.
 * Load the database with reference data and unit test data.
 */
-- password is 'password'
INSERT INTO Account (referenceId, username, password, enabled, credentialsexpired, expired, locked, version, createdBy, createdAt, updatedBy, updatedAt) VALUES ('a07bd221-3ecd-4893-a0f0-78d7c0fbf94e', 'user', '$2a$10$9/44Rne7kQqPXa0cY6NfG.3XzScMrCxFYjapoLq/wFmHz7EC9praK', true, false, false, false, 0, 'user', NOW(), NULL, NULL);
-- password is 'operations'
INSERT INTO Account (referenceId, username, password, enabled, credentialsexpired, expired, locked, version, createdBy, createdAt, updatedBy, updatedAt) VALUES ('7bd137c8-ab64-4a45-bf2d-d9bae3574622', 'operations', '$2a$10$CoMVfutnv1qZ.fNlHY1Na.rteiJhsDF0jB1o.76qXcfdWN6As27Zm', true, false, false, false, 0, 'user', NOW(), NULL, NULL);

INSERT INTO Role (id, code, label, ordinal, effectiveAt, expiresAt, createdAt) VALUES (1, 'ROLE_USER', 'User', 0, '2015-01-01 00:00:00', NULL, NOW());
INSERT INTO Role (id, code, label, ordinal, effectiveAt, expiresAt, createdAt) VALUES (2, 'ROLE_ADMIN', 'Admin', 1, '2015-01-01 00:00:00', NULL, NOW());
INSERT INTO Role (id, code, label, ordinal, effectiveAt, expiresAt, createdAt) VALUES (3, 'ROLE_SYSADMIN', 'System Admin', 2, '2015-01-01 00:00:00', NULL, NOW());

INSERT INTO AccountRole (accountId, roleId) SELECT a.id, r.id FROM Account a, Role r WHERE a.username = 'user' and r.id = 1;
INSERT INTO AccountRole (accountId, roleId) SELECT a.id, r.id FROM Account a, Role r WHERE a.username = 'operations' and r.id = 3;

INSERT INTO Greeting (referenceId, text, version, createdBy, createdAt, updatedBy, updatedAt) VALUES ('1e0d5287-67fd-4043-9ac4-b8d358d6d7ce', 'Hello World!', 0, 'user', NOW(), NULL, NULL);
INSERT INTO Greeting (referenceId, text, version, createdBy, createdAt, updatedBy, updatedAt) VALUES ('37c3178d-3b49-47b6-99d1-277b1a3e8df8', 'Hola Mundo!', 0, 'user', NOW(), NULL, NULL);

INSERT INTO location (referenceId,city,country,region,createdBy,createdAt,version)values(UUID(),'Karachi','Pakistan','Karachi','user',NOW(),0);

INSERT INTO employeetype(referenceId,createdBy,createdAt,version,name,type)VALUES (UUID(),'user',NOW(),0,'Nisum Pakistan',1);

INSERT INTO user(referenceId,createdBy,createdAt,version,accountId,locationId,employeeId,firstName,lastName,email,functionGroup)
VALUES (UUID(),'user',NOW(),0,1,1,1,'Muhammad Umar','Hussain','muhussain@nisum.com','Software Developement');


--  operations
INSERT INTO Account (referenceId, username, password, enabled, credentialsexpired, expired,
                     locked, version, createdBy, createdAt, updatedBy, updatedAt)
VALUES (UUID(), 'zohaib', '$2a$10$CoMVfutnv1qZ.fNlHY1Na.rteiJhsDF0jB1o.76qXcfdWN6As27Zm', true, false, true, false, 0, 'user', NOW(), NULL, NULL);

INSERT INTO AccountRole (accountId, roleId) SELECT a.id, r.id FROM Account a, Role r WHERE a.username = 'zohaib' and r.id = 1;

INSERT INTO user(referenceId,createdBy,createdAt,version,accountId,locationId,employeeId,firstName,lastName,email,functionGroup)
VALUES (UUID(),'user',NOW(),0,3,1,1,'Muhammad Zohaib','Abbasi','muhussain@nisum.com','Software Developement');


