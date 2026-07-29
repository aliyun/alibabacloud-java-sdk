// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoTranslationJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vtj_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>request-id</p>
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
