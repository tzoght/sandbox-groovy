/**
 * MaaS sandbox-groovy
 * Created by tzoght on 2017-04-05.
 */


@Grab('commons-lang:commons-lang:2.4')
import org.apache.commons.lang.ClassUtils
class Outer {
    class Inner {}
}
assert !ClassUtils.isInnerClass(Outer)
assert ClassUtils.isInnerClass(Outer.Inner)