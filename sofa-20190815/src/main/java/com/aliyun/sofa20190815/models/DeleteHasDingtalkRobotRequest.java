// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasDingtalkRobotRequest extends TeaModel {
    @NameInMap("RobotId")
    public String robotId;

    public static DeleteHasDingtalkRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasDingtalkRobotRequest self = new DeleteHasDingtalkRobotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasDingtalkRobotRequest setRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }
    public String getRobotId() {
        return this.robotId;
    }

}
