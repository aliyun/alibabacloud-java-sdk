// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitWorkflowJobResponseBody extends TeaModel {
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
