// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateRobotShrinkRequest extends TeaModel {
    // 机器人信息
    @NameInMap("RobotDTO")
    public String robotDTOShrink;

    public static CreateRobotShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRobotShrinkRequest self = new CreateRobotShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateRobotShrinkRequest setRobotDTOShrink(String robotDTOShrink) {
        this.robotDTOShrink = robotDTOShrink;
        return this;
    }
    public String getRobotDTOShrink() {
        return this.robotDTOShrink;
    }

}
