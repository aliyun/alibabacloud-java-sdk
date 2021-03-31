// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSubscriptionByRobotRequest extends TeaModel {
    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    public static ListSubscriptionByRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSubscriptionByRobotRequest self = new ListSubscriptionByRobotRequest();
        return TeaModel.build(map, self);
    }

    public ListSubscriptionByRobotRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

}
