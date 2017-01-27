
    USE streama;
    alter table generic_video_genre
        drop
        foreign key FK_qbsc0c1y5l6pif20x9xaqvlq9;

    alter table generic_video_genre
        drop
        foreign key FK_7xpnsi918cqjqb4hc3e01tr7v;

    alter table generic_video_tag
        drop
        foreign key FK_2jcg2soknt8stepalxg4hqhvv;

    alter table generic_video_tag
        drop
        foreign key FK_latl4i47su080pi4agth0boim;

    alter table movie_genre
        drop
        foreign key FK_15pc4mweh0ey16tu7ctyl7owg;

    alter table movie_genre
        drop
        foreign key FK_g1le8xhrsqw6xurj31r584f1m;

    alter table movie_tag
        drop
        foreign key FK_4joexp4kkef4eka9r5ol2o0en;

    alter table movie_tag
        drop
        foreign key FK_5xv7p8xiockw76w7fdn2xpk7i;

    alter table notification_queue
        drop
        foreign key FK_4escw9aojvoxknko95tma5xgx;

    alter table notification_queue
        drop
        foreign key FK_81a0hdvkvewcf1vlmj9e7ctg2;

    alter table notification_queue
        drop
        foreign key FK_fkc6tdimv7q458x5h1hgv2p4n;

    alter table tv_show
        drop
        foreign key FK_ndi3oshrhkfnsnv5se40m9yq7;

    alter table tv_show
        drop
        foreign key FK_liubtyej3kkpkcv5ehltemnee;

    alter table tv_show_genre
        drop
        foreign key FK_69vmspq6hpcwbe7wll94nylcf;

    alter table tv_show_genre
        drop
        foreign key FK_3anxogjt10p4571vgmobu8gun;

    alter table user_genre
        drop
        foreign key FK_6hj6h1ol55ou53vqt3l5urvy9;

    alter table user_genre
        drop
        foreign key FK_8epj1gc6k2lhiyndg5fgi4us8;

    alter table user_role
        drop
        foreign key FK_it77eq964jhfqtu54081ebtio;

    alter table user_role
        drop
        foreign key FK_apcc8lxk2xnug8377fatvbn04;

    alter table user_subscription
        drop
        foreign key FK_tlk7ecwqs6hglxyy1nkvljtj5;

    alter table video
        drop
        foreign key FK_of5w9pkdfm11jljxaurwcuhji;

    alter table video
        drop
        foreign key FK_ih63dtg59nyhysc4ng3cim20r;

    alter table video
        drop
        foreign key FK_dh4sucpmxniy7ce2bo1pe444w;

    alter table video_file
        drop
        foreign key FK_du7ppk0c18oddj6i7ht66ukwe;

    alter table video_file
        drop
        foreign key FK_id3m8efthum5b4v0lgnf6c3jg;

    alter table viewing_status
        drop
        foreign key FK_ero7fivf0p2yjmxcu3hcderby;

    alter table viewing_status
        drop
        foreign key FK_8loto0b3tlhosik7vix6ofbel;

    alter table viewing_status
        drop
        foreign key FK_hth8fa3gpp181wbq5ku2wcwkb;

    drop table if exists file;

    drop table if exists generic_video_genre;

    drop table if exists generic_video_tag;

    drop table if exists genre;

    drop table if exists movie_genre;

    drop table if exists movie_tag;

    drop table if exists notification_queue;

    drop table if exists role;

    drop table if exists settings;

    drop table if exists tag;

    drop table if exists tv_show;

    drop table if exists tv_show_genre;

    drop table if exists user;

    drop table if exists user_genre;

    drop table if exists user_role;

    drop table if exists user_subscription;

    drop table if exists video;

    drop table if exists video_file;

    drop table if exists viewing_status;

    create table file (
        id bigint not null auto_increment,
        version bigint not null,
        content_type varchar(255),
        date_created datetime not null,
        extension varchar(255),
        external_link varchar(255),
        last_updated datetime not null,
        name varchar(255),
        original_filename varchar(255),
        quality varchar(4),
        sha256hex varchar(64),
        size bigint,
        primary key (id)
    ) ENGINE=InnoDB;

    create table generic_video_genre (
        generic_video_genre_id bigint,
        genre_id bigint
    ) ENGINE=InnoDB;

    create table generic_video_tag (
        generic_video_tags_id bigint,
        tag_id bigint
    ) ENGINE=InnoDB;

    create table genre (
        id bigint not null auto_increment,
        version bigint not null,
        api_id integer not null,
        name varchar(255) not null,
        primary key (id)
    ) ENGINE=InnoDB;

    create table movie_genre (
        movie_genre_id bigint,
        genre_id bigint
    ) ENGINE=InnoDB;

    create table movie_tag (
        movie_tags_id bigint,
        tag_id bigint
    ) ENGINE=InnoDB;

    create table notification_queue (
        id bigint not null auto_increment,
        version bigint not null,
        date_created datetime not null,
        description varchar(255),
        is_completed bit,
        last_updated datetime not null,
        movie_id bigint,
        tv_show_id bigint,
        type varchar(255),
        video_to_play_id bigint,
        primary key (id)
    ) ENGINE=InnoDB;

    create table role (
        id bigint not null auto_increment,
        version bigint not null,
        authority varchar(255),
        display_name varchar(255),
        primary key (id)
    ) ENGINE=InnoDB;

    create table settings (
        id bigint not null auto_increment,
        version bigint not null,
        description text,
        required bit,
        settings_key varchar(255) not null,
        settings_type varchar(255),
        value varchar(255),
        primary key (id)
    ) ENGINE=InnoDB;

    create table tag (
        id bigint not null auto_increment,
        version bigint not null,
        date_created datetime not null,
        deleted bit not null,
        last_updated datetime not null,
        name varchar(255),
        primary key (id)
    ) ENGINE=InnoDB;

    create table tv_show (
        id bigint not null auto_increment,
        version bigint not null,
        api_id varchar(255),
        backdrop_image_id bigint,
        backdrop_path varchar(255),
        date_created datetime not null,
        deleted bit,
        first_air_date varchar(255),
        imdb_id varchar(255),
        last_updated datetime not null,
        manual_input bit,
        name varchar(255) not null,
        original_language varchar(255),
        overview varchar(5000),
        popularity double precision,
        poster_image_id bigint,
        poster_path varchar(255),
        vote_average double precision,
        vote_count integer,
        primary key (id)
    ) ENGINE=InnoDB;

    create table tv_show_genre (
        tv_show_genre_id bigint,
        genre_id bigint
    ) ENGINE=InnoDB;

    create table user (
        id bigint not null auto_increment,
        version bigint not null,
        account_expired bit not null,
        account_locked bit not null,
        date_created datetime,
        deleted bit not null,
        enabled bit not null,
        full_name varchar(255),
        invitation_sent bit not null,
        language varchar(255),
        last_updated datetime,
        `password` varchar(255),
        password_expired bit not null,
        pause_video_on_click bit not null,
        phone_number varchar(255) not null,
        subscribed_status bit not null,
        total_balance bigint not null,
        username varchar(255),
        uuid varchar(255),
        primary key (id)
    ) ENGINE=InnoDB;

    create table user_genre (
        user_favorite_genres_id bigint,
        genre_id bigint
    ) ENGINE=InnoDB;

    create table user_role (
        role_id bigint,
        user_id bigint,
        primary key (role_id, user_id)
    ) ENGINE=InnoDB;

    create table user_subscription (
        id bigint not null auto_increment,
        version bigint not null,
        amount bigint not null,
        end_date datetime not null,
        plan_name varchar(255) not null,
        start_date datetime not null,
        user_id bigint,
        primary key (id)
    ) ENGINE=InnoDB;

    create table video (
        id bigint not null auto_increment,
        version bigint not null,
        api_id varchar(255),
        date_created datetime,
        deleted bit,
        imdb_id varchar(255),
        intro_end integer,
        intro_start integer,
        last_updated datetime,
        original_language varchar(255),
        outro_start integer,
        overview varchar(5000),
        popularity double precision,
        vote_average double precision,
        vote_count integer,
        class varchar(255) not null,
        backdrop_path varchar(255),
        poster_image_id bigint,
        poster_path varchar(255),
        release_date varchar(255),
        title varchar(255),
        trailer_key varchar(255),
        backdrop_image_id bigint,
        air_date varchar(255),
        episode_string varchar(255),
        episode_number integer,
        name varchar(255),
        season_number integer,
        show_id bigint,
        still_path varchar(255),
        primary key (id)
    ) ENGINE=InnoDB;

    create table video_file (
        video_files_id bigint,
        file_id bigint
    ) ENGINE=InnoDB;

    create table viewing_status (
        id bigint not null auto_increment,
        version bigint not null,
        completed bit,
        current_play_time integer not null,
        date_created datetime,
        last_updated datetime,
        runtime integer,
        tv_show_id bigint,
        user_id bigint,
        video_id bigint not null,
        primary key (id)
    ) ENGINE=InnoDB;

    alter table role
        add constraint UK_irsamgnera6angm0prq1kemt2  unique (authority);

    alter table tag
        add constraint UK_1wdpsed5kna2y38hnbgrnhi5b  unique (name);

    alter table user
        add constraint UK_4bgmpi98dylab6qdvf9xyaxu4  unique (phone_number);

    alter table user
        add constraint UK_sb8bbouer5wak8vyiiy4pf2bx  unique (username);

    alter table generic_video_genre
        add constraint FK_qbsc0c1y5l6pif20x9xaqvlq9
        foreign key (genre_id)
        references genre (id);

    alter table generic_video_genre
        add constraint FK_7xpnsi918cqjqb4hc3e01tr7v
        foreign key (generic_video_genre_id)
        references video (id);

    alter table generic_video_tag
        add constraint FK_2jcg2soknt8stepalxg4hqhvv
        foreign key (tag_id)
        references tag (id);

    alter table generic_video_tag
        add constraint FK_latl4i47su080pi4agth0boim
        foreign key (generic_video_tags_id)
        references video (id);

    alter table movie_genre
        add constraint FK_15pc4mweh0ey16tu7ctyl7owg
        foreign key (genre_id)
        references genre (id);

    alter table movie_genre
        add constraint FK_g1le8xhrsqw6xurj31r584f1m
        foreign key (movie_genre_id)
        references video (id);

    alter table movie_tag
        add constraint FK_4joexp4kkef4eka9r5ol2o0en
        foreign key (tag_id)
        references tag (id);

    alter table movie_tag
        add constraint FK_5xv7p8xiockw76w7fdn2xpk7i
        foreign key (movie_tags_id)
        references video (id);

    alter table notification_queue
        add constraint FK_4escw9aojvoxknko95tma5xgx
        foreign key (movie_id)
        references video (id);

    alter table notification_queue
        add constraint FK_81a0hdvkvewcf1vlmj9e7ctg2
        foreign key (tv_show_id)
        references tv_show (id);

    alter table notification_queue
        add constraint FK_fkc6tdimv7q458x5h1hgv2p4n
        foreign key (video_to_play_id)
        references video (id);

    alter table tv_show
        add constraint FK_ndi3oshrhkfnsnv5se40m9yq7
        foreign key (backdrop_image_id)
        references file (id);

    alter table tv_show
        add constraint FK_liubtyej3kkpkcv5ehltemnee
        foreign key (poster_image_id)
        references file (id);

    alter table tv_show_genre
        add constraint FK_69vmspq6hpcwbe7wll94nylcf
        foreign key (genre_id)
        references genre (id);

    alter table tv_show_genre
        add constraint FK_3anxogjt10p4571vgmobu8gun
        foreign key (tv_show_genre_id)
        references tv_show (id);

    alter table user_genre
        add constraint FK_6hj6h1ol55ou53vqt3l5urvy9
        foreign key (genre_id)
        references genre (id);

    alter table user_genre
        add constraint FK_8epj1gc6k2lhiyndg5fgi4us8
        foreign key (user_favorite_genres_id)
        references user (id);

    alter table user_role
        add constraint FK_it77eq964jhfqtu54081ebtio
        foreign key (role_id)
        references role (id);

    alter table user_role
        add constraint FK_apcc8lxk2xnug8377fatvbn04
        foreign key (user_id)
        references user (id);

    alter table user_subscription
        add constraint FK_tlk7ecwqs6hglxyy1nkvljtj5
        foreign key (user_id)
        references user (id);

    alter table video
        add constraint FK_of5w9pkdfm11jljxaurwcuhji
        foreign key (poster_image_id)
        references file (id);

    alter table video
        add constraint FK_ih63dtg59nyhysc4ng3cim20r
        foreign key (backdrop_image_id)
        references file (id);

    alter table video
        add constraint FK_dh4sucpmxniy7ce2bo1pe444w
        foreign key (show_id)
        references tv_show (id);

    alter table video_file
        add constraint FK_du7ppk0c18oddj6i7ht66ukwe
        foreign key (file_id)
        references file (id);

    alter table video_file
        add constraint FK_id3m8efthum5b4v0lgnf6c3jg
        foreign key (video_files_id)
        references video (id);

    alter table viewing_status
        add constraint FK_ero7fivf0p2yjmxcu3hcderby
        foreign key (tv_show_id)
        references tv_show (id);

    alter table viewing_status
        add constraint FK_8loto0b3tlhosik7vix6ofbel
        foreign key (user_id)
        references user (id);

    alter table viewing_status
        add constraint FK_hth8fa3gpp181wbq5ku2wcwkb
        foreign key (video_id)
        references video (id);
