// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetJobStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the task. Valid values:</p>
     * <br>
     * <p>*   **Succeeded**: The task is successful.</p>
     * <p>*   **processing**: The ticket is being executed.</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobStatusResponseBody self = new GetJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
