// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitWorkflowJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A01C8FF4-C106-4431-418F973DADB7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitWorkflowJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitWorkflowJobResponseBody self = new SubmitWorkflowJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitWorkflowJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
