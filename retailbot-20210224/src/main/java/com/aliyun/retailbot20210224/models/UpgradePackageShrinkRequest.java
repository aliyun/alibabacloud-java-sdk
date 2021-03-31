// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpgradePackageShrinkRequest extends TeaModel {
    // 机器人code
    @NameInMap("RobotCodes")
    public String robotCodesShrink;

    // 需要升级的行业包
    @NameInMap("PackageDTO")
    public String packageDTOShrink;

    // 操作人信息
    @NameInMap("Operator")
    public String operatorShrink;

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

    public UpgradePackageShrinkRequest setOperatorShrink(String operatorShrink) {
        this.operatorShrink = operatorShrink;
        return this;
    }
    public String getOperatorShrink() {
        return this.operatorShrink;
    }

}
