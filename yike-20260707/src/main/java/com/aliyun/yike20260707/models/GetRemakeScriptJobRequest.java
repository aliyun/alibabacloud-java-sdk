// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetRemakeScriptJobRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68ca759e798b40b4903b255*******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetRemakeScriptJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRemakeScriptJobRequest self = new GetRemakeScriptJobRequest();
        return TeaModel.build(map, self);
    }

    public GetRemakeScriptJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
