# 代码生成器

## 1 基于 `若依` 项目的代码生成器

### 1 设置数据库信息 application-druid.yml

```properties
# 数据源配置
spring:
    datasource:
        type: com.alibaba.druid.pool.DruidDataSource
        driverClassName: com.mysql.jdbc.Driver
        druid:
            # 主库数据源
            master:
                url: jdbc:mysql://111.230.888.247:3306/anj
                username: root
                password: 
```

### 2 设置表信息 application.yml

```properties
# 代码生成
gen: 
  # 作者
  author:
  # 默认生成包路径 module 需改成自己的模块名称 如 system monitor tool
  packageName: com.anj.project
  # 自动去除表前缀，默认是true
  autoRemovePre: false
  # 指定要去除的表前缀(类名不会包含表前缀)
  tablePrefix:
  # 指定生成代码的路径和文件名
  outpath: c:\code.zip
  # 指定要处理的表,用 , 分隔
  tables: anj_project,anj_project_img,anj_project_detail
```

### 3 运行 `CodeGen` 类的测试方法

​	会在指定目录生成zip的文件压缩包 

## 2 通用mapper 代码生成器

​	通用mapper的代码生成器

### 1 修改配置设置数据库连接属性 config.properties

```properties
# 数据库配置
jdbc.driverClass = com.mysql.jdbc.Driver
jdbc.url = jdbc:mysql://localhost:3306/anj
jdbc.user = root
jdbc.password = 123456
```

### 2 设置代码生成目录和表 generatorConfig.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE generatorConfiguration
        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"
        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">

<generatorConfiguration>
    <properties resource="generator/config.properties"/>

    <context id="Mysql" targetRuntime="MyBatis3Simple" defaultModelType="flat">
        <property name="beginningDelimiter" value="`"/>
        <property name="endingDelimiter" value="`"/>

        <plugin type="tk.mybatis.mapper.generator.MapperPlugin">
            <property name="mappers" value="tk.mybatis.mapper.common.Mapper"/>
            <property name="caseSensitive" value="true"/>
        </plugin>

        <jdbcConnection driverClass="${jdbc.driverClass}"
                        connectionURL="${jdbc.url}"
                        userId="${jdbc.user}"
                        password="${jdbc.password}">
        </jdbcConnection>

        <javaModelGenerator targetPackage="com.anj.project" targetProject="src/main/java"/>

        <sqlMapGenerator targetPackage="mapper" targetProject="src/main/resources"/>

        <javaClientGenerator targetPackage="com.anj.project" targetProject="src/main/java"
                             type="XMLMAPPER"/>
        <table tableName="anj_project_detail">
            <generatedKey column="id" sqlStatement="JDBC"/>
        </table>
        <table tableName="anj_project_img">
            <generatedKey column="id" sqlStatement="JDBC"/>
        </table>
    </context>
</generatorConfiguration
```

### 3 运行 CodeGen 类的主方法

​	按上面的设置,代码生成位于项目根目录的src下


## 3 mybatis-zheng 

​	开源项目 zheng 里边的代码生成器,修改了一些拿来使用的 , 生成的mapper 使用原生的mybatis代码生成器生成,结合 example类进行快速的单表查询

### 1 修改配置文件 generatorConfig.xml

```properties
# 代码生成器的配置文件，不要改文件名！！！

# 数据库连接部分
generator.jdbc.driver=com.mysql.jdbc.Driver
# generator.jdbc.url=jdbc\:mysql\://localhost\:3306/zheng?useUnicode\=true&characterEncoding\=utf-8&autoReconnect\=true
generator.jdbc.url=jdbc:mysql://localhost:3306/anj?useUnicode=true&characterEncoding=utf-8&autoReconnect=true
generator.jdbc.username=root
generator.jdbc.password=123456
# 命名规范部分，指定模块名、数据库名、要操作的表的前缀、包名
generator.jdbc.moduleName=project
generator.jdbc.database=anj
generator.jdbc.tablePrefix=anj
generator.jdbc.packageName=com.fmi110
```

### 2 运行 CodeGenerator 的main 方法

​	运行后即可生成对应的模版代码,文件生成目录查看日志提示:

```sh
========== 开始生成generatorConfig.xml文件 ==========
数据库连接成功
anj_project
anj_project_detail
anj_project_img
释放数据库连接
========== 结束生成generatorConfig.xml文件 ==========
========== 开始运行MybatisGenerator ==========
========== 结束运行MybatisGenerator ==========
========== 开始生成Service ==========
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//controller/AnjProjectController.java
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//service/AnjProjectService.java
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//service/AnjProjectServiceMock.java
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//service/impl/AnjProjectServiceImpl.java
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//controller/AnjProjectDetailController.java
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//service/AnjProjectDetailService.java
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//service/AnjProjectDetailServiceMock.java
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//service/impl/AnjProjectDetailServiceImpl.java
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//controller/AnjProjectImgController.java
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//service/AnjProjectImgService.java
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//service/AnjProjectImgServiceMock.java
C:/02_idea_project/codegenerate/mybatis-zheng/project/project/src/main/java/com/fmi110//service/impl/AnjProjectImgServiceImpl.java
========== 结束生成Service ==========
```



