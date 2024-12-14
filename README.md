# JAVA版VCMP空白模板

- 作者：VEGETAZ
- 创建时间：Dec.14, 2024
- 更新时间：Dec.14, 2024
- 版本：0.0.2

## 来源

[github](https://github.com/newk5/vcmp-maven)

## 使用方法

1. 需自行搭建maven环境
2. pom.xml中可更改主类信息
3. pom.xml目录下使用mvn package构建生成jar文件
4. javaplugin.properties中分别配置

    - jvmLibPath：jvm的动态库
    - mainEventsClass：主事件完整类名，也就是主类
    - classPath：编译后的类目录，这里是maven构建打包后的jar文件
    - maxMemory：分配给jvm工作的最大内存

5. 运行引擎server64_0471.exe即可（可修改server.cfg配置文件）
