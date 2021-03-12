// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateRobotResponseBody extends TeaModel {
    // request id
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRobotResponseBody self = new UpdateRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRobotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
