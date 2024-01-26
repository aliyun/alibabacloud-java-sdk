// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class SetTaskStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetTaskStatusResponseBody self = new SetTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
