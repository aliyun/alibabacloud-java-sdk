// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class InstallPackageShrinkRequest extends TeaModel {
    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("Packages")
    public String packagesShrink;

    public static InstallPackageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallPackageShrinkRequest self = new InstallPackageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InstallPackageShrinkRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public InstallPackageShrinkRequest setPackagesShrink(String packagesShrink) {
        this.packagesShrink = packagesShrink;
        return this;
    }
    public String getPackagesShrink() {
        return this.packagesShrink;
    }

}
