package org.huluo.module2;


import org.huluo.module1.SayHello;

import java.sql.Date;

public class JavaModular2App {
    public static void main(String[] args) {

        /**
         * 这边使用了javaModular1模块中的类,所以应该在module-info.java文件中声明出来
         */
        SayHello sayHello = new SayHello();
        sayHello.iWantSayHello();
        /*
        这边想要使用java.sql模块下的Date对象。根据模块化的原则,我们是需要进行requires进来的,但是我们当前的javaModular2这个模块依赖了javaModular1
        javModular1 又 requires transitive java.sql; 又间接得依赖了java.sql模块,所以无需再在module-info.java中requires
         */
        Date date = new Date(1L);
        System.out.println(date.toLocalDate());

    }
}
