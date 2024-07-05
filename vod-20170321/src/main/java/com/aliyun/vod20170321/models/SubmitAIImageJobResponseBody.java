// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the image AI processing job.</p>
     * 
     * <strong>example:</strong>
     * <p>cf08a2c6e11e*****de1711b738b9067</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>218A6807-A21E-43*****54-C0512880B0B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIImageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIImageJobResponseBody self = new SubmitAIImageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIImageJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitAIImageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
