// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeProjectExportJobRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68ca759e798b40b4903b255*******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetYikeProjectExportJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYikeProjectExportJobRequest self = new GetYikeProjectExportJobRequest();
        return TeaModel.build(map, self);
    }

    public GetYikeProjectExportJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
