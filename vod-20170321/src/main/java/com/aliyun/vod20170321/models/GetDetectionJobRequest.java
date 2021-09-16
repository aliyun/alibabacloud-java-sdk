// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDetectionJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static GetDetectionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionJobRequest self = new GetDetectionJobRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectionJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
