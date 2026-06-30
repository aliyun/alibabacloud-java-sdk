// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeAgentJobRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ab4802364a2e49208c99efab82df****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetYikeAgentJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAgentJobRequest self = new GetYikeAgentJobRequest();
        return TeaModel.build(map, self);
    }

    public GetYikeAgentJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
