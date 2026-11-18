// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoRemakeJobResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4321-ABCD-123456789012</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitVideoRemakeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoRemakeJobResponseBody self = new SubmitVideoRemakeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoRemakeJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SubmitVideoRemakeJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitVideoRemakeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
