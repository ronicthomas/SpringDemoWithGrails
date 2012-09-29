beans = {

    xmlns context: 'http://www.springframework.org/schema/context'
    xmlns aop: "http://www.springframework.org/schema/aop"

    context.'component-scan'('base-package': 'com.springdemo.library')
    aop.config("proxy-target-class": true) {

    }
}
