// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitImageGenerationJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ag_68ca759b4903b255*******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitImageGenerationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageGenerationJobResponseBody self = new SubmitImageGenerationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitImageGenerationJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitImageGenerationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
