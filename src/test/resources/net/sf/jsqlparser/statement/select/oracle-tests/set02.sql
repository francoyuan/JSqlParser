---
-- #%L
-- JSQLParser library
-- %%
-- Copyright (C) 2004 - 2019 JSQLParser
-- %%
-- Dual licensed under GNU LGPL 2.1 or Apache License 2.0
-- #L%
---
select nt.column_value as distinct_element
     from   table(set(varchar2_ntt('a','b','c','c'))) nt

--@SUCCESSFULLY_PARSED_AND_DEPARSED first on Aug 3, 2021, 7:20:08 AM
--@FAILURE: Encountered unexpected token: "from" "FROM" recorded first on 2022年12月9日 下午5:50:45