// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitVideoGenerationJobResponseBody extends TeaModel {
    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>3e761e9d11edba640c42a1b7</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitVideoGenerationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoGenerationJobResponseBody self = new SubmitVideoGenerationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoGenerationJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitVideoGenerationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
