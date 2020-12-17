// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ExecuteChangeSetResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ExecuteChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteChangeSetResponse self = new ExecuteChangeSetResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteChangeSetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
