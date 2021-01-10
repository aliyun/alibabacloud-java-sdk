// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasDingtalkRobotupdateauthRequest extends TeaModel {
    @NameInMap("RobotId")
    public String robotId;

    @NameInMap("RequestBodyJsonStr")
    public String requestBodyJsonStr;

    public static UpdateHasDingtalkRobotupdateauthRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasDingtalkRobotupdateauthRequest self = new UpdateHasDingtalkRobotupdateauthRequest();
        return TeaModel.build(map, self);
    }

    public UpdateHasDingtalkRobotupdateauthRequest setRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }
    public String getRobotId() {
        return this.robotId;
    }

    public UpdateHasDingtalkRobotupdateauthRequest setRequestBodyJsonStr(String requestBodyJsonStr) {
        this.requestBodyJsonStr = requestBodyJsonStr;
        return this;
    }
    public String getRequestBodyJsonStr() {
        return this.requestBodyJsonStr;
    }

}
