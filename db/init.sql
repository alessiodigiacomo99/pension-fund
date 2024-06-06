create table pension_fund (
    id_pension_fund serial primary key,
    company varchar(20) NOT NULL,
    fund_name varchar(20) NOT NULL
);

insert into pension_fund(id_pension_fund, company, fund_name) values (1, 'allianz', 'insieme');