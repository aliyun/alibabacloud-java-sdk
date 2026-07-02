// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeVideoCloneJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>task_abc123def456</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>req_create_20260420_001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitYikeVideoCloneJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeVideoCloneJobResponseBody self = new SubmitYikeVideoCloneJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitYikeVideoCloneJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitYikeVideoCloneJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
