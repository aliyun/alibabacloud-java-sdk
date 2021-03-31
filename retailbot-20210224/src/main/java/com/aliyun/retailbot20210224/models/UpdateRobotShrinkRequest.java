// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateRobotShrinkRequest extends TeaModel {
    // 机器人信息
    @NameInMap("RobotDTO")
    public String robotDTOShrink;

    // 操作人信息
    @NameInMap("Operator")
    public String operatorShrink;

    public static UpdateRobotShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRobotShrinkRequest self = new UpdateRobotShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRobotShrinkRequest setRobotDTOShrink(String robotDTOShrink) {
        this.robotDTOShrink = robotDTOShrink;
        return this;
    }
    public String getRobotDTOShrink() {
        return this.robotDTOShrink;
    }

    public UpdateRobotShrinkRequest setOperatorShrink(String operatorShrink) {
        this.operatorShrink = operatorShrink;
        return this;
    }
    public String getOperatorShrink() {
        return this.operatorShrink;
    }

}
