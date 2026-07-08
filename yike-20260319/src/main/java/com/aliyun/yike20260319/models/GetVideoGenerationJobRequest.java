// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetVideoGenerationJobRequest extends TeaModel {
    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68ca759e798b40b4903b255*******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetVideoGenerationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoGenerationJobRequest self = new GetVideoGenerationJobRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoGenerationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetVideoGenerationJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
