// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class ResumeYikeStoryboardJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResumeYikeStoryboardJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeYikeStoryboardJobResponseBody self = new ResumeYikeStoryboardJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeYikeStoryboardJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ResumeYikeStoryboardJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
