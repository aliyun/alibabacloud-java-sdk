// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CancelExecutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CancelExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelExecutionResponseBody self = new CancelExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
