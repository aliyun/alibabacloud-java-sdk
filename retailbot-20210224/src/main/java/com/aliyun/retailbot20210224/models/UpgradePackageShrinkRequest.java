// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpgradePackageShrinkRequest extends TeaModel {
    @NameInMap("RobotCodes")
    public String robotCodesShrink;

    @NameInMap("PackageDTO")
    public String packageDTOShrink;

    public static UpgradePackageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradePackageShrinkRequest self = new UpgradePackageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpgradePackageShrinkRequest setRobotCodesShrink(String robotCodesShrink) {
        this.robotCodesShrink = robotCodesShrink;
        return this;
    }
    public String getRobotCodesShrink() {
        return this.robotCodesShrink;
    }

    public UpgradePackageShrinkRequest setPackageDTOShrink(String packageDTOShrink) {
        this.packageDTOShrink = packageDTOShrink;
        return this;
    }
    public String getPackageDTOShrink() {
        return this.packageDTOShrink;
    }

}
