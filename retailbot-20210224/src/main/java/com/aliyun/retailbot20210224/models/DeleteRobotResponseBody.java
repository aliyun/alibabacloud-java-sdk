// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteRobotResponseBody extends TeaModel {
    // request id
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRobotResponseBody self = new DeleteRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRobotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
