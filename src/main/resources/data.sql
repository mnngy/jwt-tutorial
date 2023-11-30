insert into member (member_id, username, password, nickname, activated)
values (1, 'admin', '47a475ae-e8d7-4698-9898-18301aedaaf4', 'admin', 1);

insert into user_authority (member_id, authority_name)
values (1, 'user');

insert into user_authority (member_id, authority_name)
values (1, 'user');