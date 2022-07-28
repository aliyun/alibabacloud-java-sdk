// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryByTaskIdRequest extends TeaModel {
    @NameInMap("RobotCode")
    public String robotCode;

    @NameInMap("TaskId")
    public Long taskId;

    public static QueryByTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryByTaskIdRequest self = new QueryByTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryByTaskIdRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

    public QueryByTaskIdRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
