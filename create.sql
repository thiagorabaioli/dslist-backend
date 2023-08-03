create table tb_belonging (position integer, list_id bigint not null, game_id bigint not null, primary key (game_id, list_id));
create table tb_game (id bigserial not null, genre varchar(255), img_url varchar(255), long_description TEXT, platforms varchar(255), score varchar(255), short_description TEXT, title varchar(255), game_year integer, primary key (id));
create table tb_game_list (id bigserial not null, name varchar(255), primary key (id));
alter table if exists tb_belonging add constraint FKrchwdikeu66uky1hf75ym1kh foreign key (list_id) references tb_game_list;
alter table if exists tb_belonging add constraint FK2slybclee7wdfxhfltbvqkgpg foreign key (game_id) references tb_game;
