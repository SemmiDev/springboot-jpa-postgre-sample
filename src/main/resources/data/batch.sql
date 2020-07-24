DELETE FROM Batch;
DELETE FROM batch_students;

INSERT INTO Batch (id, start_batch, finish_batch, id_course)
    VALUES ('fe002ad1-426a-4cb7-9bbf-52b2b3dd2a7b', '2020-09-20', '2020-10-05', '80546363-47f5-41d8-a18b-d06964a594c6');
INSERT INTO Batch (id, start_batch, finish_batch, id_course)
    VALUES ('333c15e3-a99e-4140-8a5b-3ed800048f0d', '2020-09-25', '2020-10-10', '802a0449-b993-4723-a9b3-a84ea1969e4f');
INSERT INTO Batch (id, start_batch, finish_batch, id_course)
    VALUES ('899811a5-c75f-42d7-b423-a868de36ebf1', '2020-09-28', '2020-10-15', 'b3832ba5-f208-4685-8255-9866f4098169');
INSERT INTO Batch (id, start_batch, finish_batch, id_course)
    VALUES ('34f2c00b-ca1f-43f7-af06-922db26ad99b', '2020-09-30', '2020-10-20', 'fe002ad1-426a-4cb7-9bbf-52b2b3dd2a7b');

INSERT INTO batch_students (batch_id, students_id)
    VALUES ('fe002ad1-426a-4cb7-9bbf-52b2b3dd2a7b', '7da771c2-73e9-4e0e-b6d1-1458d31a2fc8');
INSERT INTO batch_students (batch_id, students_id)
    VALUES ('fe002ad1-426a-4cb7-9bbf-52b2b3dd2a7b', 'ec4e32ed-8b0c-4915-9ba4-4e6c4a173dff');
INSERT INTO batch_students (batch_id, students_id)
    VALUES ('fe002ad1-426a-4cb7-9bbf-52b2b3dd2a7b', 'ffa42713-b376-4f89-b62c-ab4e8a2df106');
INSERT INTO batch_students (batch_id, students_id)
    VALUES ('fe002ad1-426a-4cb7-9bbf-52b2b3dd2a7b', '67ff6991-5691-4411-a9e6-bdc24ad6f930');