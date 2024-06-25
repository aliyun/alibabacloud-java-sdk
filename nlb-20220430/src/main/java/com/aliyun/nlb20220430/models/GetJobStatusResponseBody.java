// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetJobStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the task. Valid values:</p>
     * <ul>
     * <li><strong>Succeeded</strong>: The task is successful.</li>
     * <li><strong>processing</strong>: The ticket is being executed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
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
