// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeVoiceNarratorJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task_abc123def456</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetYikeVoiceNarratorJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYikeVoiceNarratorJobRequest self = new GetYikeVoiceNarratorJobRequest();
        return TeaModel.build(map, self);
    }

    public GetYikeVoiceNarratorJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
