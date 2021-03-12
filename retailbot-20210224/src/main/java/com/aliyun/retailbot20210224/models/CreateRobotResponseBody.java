// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateRobotResponseBody extends TeaModel {
    // 机器人code
    @NameInMap("RobotCode")
    public String robotCode;

    // request id
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRobotResponseBody self = new CreateRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRobotResponseBody setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public CreateRobotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
