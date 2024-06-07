create table company (
    id_company serial primary key,
    company_name varchar(20) NOT NULL
);

create table pension_fund (
    id_pension_fund serial primary key,
    id_company int4 NOT NULL,
    fund_name varchar(20) NOT NULL,
    CONSTRAINT fkid_company FOREIGN KEY (id_company) REFERENCES company(id_company)
);

create table investment_line (
    id_investment_line serial primary key,
    id_pension_fund int4 NOT NULL,
    investment_line_name varchar(20) NOT NULL,
    CONSTRAINT fkid_pension_fund FOREIGN KEY (id_pension_fund) REFERENCES pension_fund(id_pension_fund)
);

insert into company(id_company, company_name) values (1, 'allianz');
insert into pension_fund(id_pension_fund, id_company, fund_name) values (1, 1, 'insieme');
insert into investment_line(id_investment_line, id_pension_fund, investment_line_name) values (1, 1, 'espansione');