// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeJobCreditRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ag_12412424****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetYikeJobCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        GetYikeJobCreditRequest self = new GetYikeJobCreditRequest();
        return TeaModel.build(map, self);
    }

    public GetYikeJobCreditRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
