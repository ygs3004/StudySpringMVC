create sequence user_seq start with 1 increment by 1;
create table board_info_table(
                                 board_info_idx number constraint BOARD_INFO_PK primary key,
                                 board_info_name varchar2(500) not null
);

drop table board_info_table;
drop sequence user_seq;

insert into board_info_table(board_info_idx,board_info_name)values(1,'자유게시판');
insert into board_info_table(board_info_idx,board_info_name)values(2,'유머게시판');
insert into board_info_table(board_info_idx,board_info_name)values(3,'정치게시판');
insert into board_info_table(board_info_idx,board_info_name)values(4,'스포츠게시판');

select * from board_info_table;

commit;

create table user_table(
                           user_idx number  primary key,
                           user_name varchar2(50) not null,
                           user_id varchar2(100) not null,
                           user_pw varchar2(100) not null
);

create table content_table(
                              content_idx number primary key,
                              content_subject varchar2(500) not null,
                              content_text long not null,
                              content_file varchar2(500),
                              content_writer_idx number not null
                                  constraint CONTENT_FK1 references user_table(user_idx),
                              content_board_idx number not null
                                  constraint CONTENT_FK2 references board_info_table(board_info_idx),
                              content_date date not null
);
