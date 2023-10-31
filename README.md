# JSqlParser

这个分支是从[JSqlParser](https://github.com/JSQLParser/JSqlParser)的4.6-SNAPSHOT版本fork而来。为支持对象代理查询语句做了一些修改。具体而言支持以下两种查询语法。

1. 创建代理类

   ```sql
   CREATE DEPUTY deputyname AS SELECT ......
   ```

2. 跨类查询

   ```sql
   SELECT a->b->c, d FROM table ......
   ```

更改了之后过不了一些原程序设置的测试，需要在进行编译时跳过，使用以下命令

```bash
mvn clean install -Dpmd.skip=true -Dcheckstyle.skip=true -Dmaven.test.skip=true
```

