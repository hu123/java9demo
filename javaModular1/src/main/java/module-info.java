module module1 {
    //间接引用了java.sql模块
    requires transitive java.sql;
    exports org.huluo.module1;
}