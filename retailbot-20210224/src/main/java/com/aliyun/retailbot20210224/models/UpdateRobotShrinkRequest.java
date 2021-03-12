// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateRobotShrinkRequest extends TeaModel {
    // 机器人信息
    @NameInMap("Robot")
    public String robotShrink;

    public static UpdateRobotShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRobotShrinkRequest self = new UpdateRobotShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRobotShrinkRequest setRobotShrink(String robotShrink) {
        this.robotShrink = robotShrink;
        return this;
    }
    public String getRobotShrink() {
        return this.robotShrink;
    }

}
