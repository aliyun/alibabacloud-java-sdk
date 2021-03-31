// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UninstallPackageShrinkRequest extends TeaModel {
    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // 取消订阅的行业包
    @NameInMap("Packages")
    public String packagesShrink;

    // 操作人信息
    @NameInMap("Operator")
    public String operatorShrink;

    public static UninstallPackageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallPackageShrinkRequest self = new UninstallPackageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UninstallPackageShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public UninstallPackageShrinkRequest setPackagesShrink(String packagesShrink) {
        this.packagesShrink = packagesShrink;
        return this;
    }
    public String getPackagesShrink() {
        return this.packagesShrink;
    }

    public UninstallPackageShrinkRequest setOperatorShrink(String operatorShrink) {
        this.operatorShrink = operatorShrink;
        return this;
    }
    public String getOperatorShrink() {
        return this.operatorShrink;
    }

}
