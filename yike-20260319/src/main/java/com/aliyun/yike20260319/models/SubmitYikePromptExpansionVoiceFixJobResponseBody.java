// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikePromptExpansionVoiceFixJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>68ca759e798b40b4903b255********</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitYikePromptExpansionVoiceFixJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikePromptExpansionVoiceFixJobResponseBody self = new SubmitYikePromptExpansionVoiceFixJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitYikePromptExpansionVoiceFixJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitYikePromptExpansionVoiceFixJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
