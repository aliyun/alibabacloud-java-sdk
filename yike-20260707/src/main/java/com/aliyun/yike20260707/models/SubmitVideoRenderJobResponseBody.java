// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoRenderJobResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is returned when the task is in the Failed state.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68ca759e798b40b4903b255*******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitVideoRenderJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoRenderJobResponseBody self = new SubmitVideoRenderJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoRenderJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SubmitVideoRenderJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitVideoRenderJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
