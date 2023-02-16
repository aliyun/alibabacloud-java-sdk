// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20230117.models;

import com.aliyun.tea.*;

public class CancelWaitingAsyncJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static CancelWaitingAsyncJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelWaitingAsyncJobRequest self = new CancelWaitingAsyncJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelWaitingAsyncJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
