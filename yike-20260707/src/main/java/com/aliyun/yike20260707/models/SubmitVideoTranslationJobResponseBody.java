// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoTranslationJobResponseBody extends TeaModel {
    /**
     * <p>The video translation job ID, used to call GetVideoTranslationJob to query the job.</p>
     * 
     * <strong>example:</strong>
     * <p>vtj_0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID, used for Tracing Analysis and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>req-vt-20260820-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitVideoTranslationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoTranslationJobResponseBody self = new SubmitVideoTranslationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoTranslationJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitVideoTranslationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
