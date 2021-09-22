// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class CreateRunResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunId")
    public String runId;

    public static CreateRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRunResponseBody self = new CreateRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRunResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

}
