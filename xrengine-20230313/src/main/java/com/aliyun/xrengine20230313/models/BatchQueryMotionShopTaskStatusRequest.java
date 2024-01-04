// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class BatchQueryMotionShopTaskStatusRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("TaskId")
    public String taskId;

    public static BatchQueryMotionShopTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryMotionShopTaskStatusRequest self = new BatchQueryMotionShopTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryMotionShopTaskStatusRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public BatchQueryMotionShopTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
