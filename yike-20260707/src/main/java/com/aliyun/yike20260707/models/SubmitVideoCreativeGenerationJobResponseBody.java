// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoCreativeGenerationJobResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is returned when the job is in the Failed state.</p>
     * 
     * <strong>example:</strong>
     * <p>WorkflowTaskFailed</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B0E1A586AAC29742247</strong></strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitVideoCreativeGenerationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoCreativeGenerationJobResponseBody self = new SubmitVideoCreativeGenerationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoCreativeGenerationJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SubmitVideoCreativeGenerationJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitVideoCreativeGenerationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
