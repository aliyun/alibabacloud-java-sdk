// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageAuditJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the image review job.</p>
     * 
     * <strong>example:</strong>
     * <p>b1aa3024aee64*****6dc8ca20dbc328</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6F42D500-1956-4B*****30-C09E755F4F4B</p>
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
