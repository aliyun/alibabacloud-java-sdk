// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CancelGenerationJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ag_77b5f78b***</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static CancelGenerationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelGenerationJobRequest self = new CancelGenerationJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelGenerationJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
