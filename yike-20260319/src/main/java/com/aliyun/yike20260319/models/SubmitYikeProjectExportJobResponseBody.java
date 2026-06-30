// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeProjectExportJobResponseBody extends TeaModel {
    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>task_abc123def456</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req_create_20260420_001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitYikeProjectExportJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeProjectExportJobResponseBody self = new SubmitYikeProjectExportJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitYikeProjectExportJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitYikeProjectExportJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
