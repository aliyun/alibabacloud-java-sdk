// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasDingtalkRobotRequest extends TeaModel {
    @NameInMap("RobotId")
    public String robotId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasDingtalkRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasDingtalkRobotRequest self = new UpdateHasDingtalkRobotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasDingtalkRobotRequest setRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }
    public String getRobotId() {
        return this.robotId;
    }

    public UpdateHasDingtalkRobotRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
