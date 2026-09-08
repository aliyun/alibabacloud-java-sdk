// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetAgentJobRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B0E1A586AAC29742247</strong></strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetAgentJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentJobRequest self = new GetAgentJobRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
