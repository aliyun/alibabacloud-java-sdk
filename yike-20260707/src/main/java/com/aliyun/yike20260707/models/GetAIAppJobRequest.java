// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetAIAppJobRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68ca759e798b40b4903b255*******</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Specifies whether to return only the task results. If you set this parameter to true, the response does not include the results of each node.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnlyOutputs")
    public Boolean onlyOutputs;

    public static GetAIAppJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIAppJobRequest self = new GetAIAppJobRequest();
        return TeaModel.build(map, self);
    }

    public GetAIAppJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetAIAppJobRequest setOnlyOutputs(Boolean onlyOutputs) {
        this.onlyOutputs = onlyOutputs;
        return this;
    }
    public Boolean getOnlyOutputs() {
        return this.onlyOutputs;
    }

}
