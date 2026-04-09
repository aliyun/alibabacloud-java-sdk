// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeStoryboardJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetYikeStoryboardJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYikeStoryboardJobRequest self = new GetYikeStoryboardJobRequest();
        return TeaModel.build(map, self);
    }

    public GetYikeStoryboardJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
