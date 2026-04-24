// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeVoiceNarratorJobResponseBody extends TeaModel {
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

    public static SubmitYikeVoiceNarratorJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeVoiceNarratorJobResponseBody self = new SubmitYikeVoiceNarratorJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitYikeVoiceNarratorJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitYikeVoiceNarratorJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
