// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetImageGenerationJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>68ca759e798b40b4903b255*******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetImageGenerationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageGenerationJobRequest self = new GetImageGenerationJobRequest();
        return TeaModel.build(map, self);
    }

    public GetImageGenerationJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
