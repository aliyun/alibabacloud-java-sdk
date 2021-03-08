// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageAuditJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobId")
    public String jobId;

    public static SubmitAIImageAuditJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIImageAuditJobResponseBody self = new SubmitAIImageAuditJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIImageAuditJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitAIImageAuditJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
