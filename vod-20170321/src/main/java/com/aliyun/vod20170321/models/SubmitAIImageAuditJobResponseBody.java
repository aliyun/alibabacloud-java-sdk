// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageAuditJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the image review task.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIImageAuditJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIImageAuditJobResponseBody self = new SubmitAIImageAuditJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIImageAuditJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitAIImageAuditJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
