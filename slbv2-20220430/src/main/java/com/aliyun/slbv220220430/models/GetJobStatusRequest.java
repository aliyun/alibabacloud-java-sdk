// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class GetJobStatusRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    // add 必选
    @NameInMap("JobId")
    public String jobId;

    public static GetJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobStatusRequest self = new GetJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetJobStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetJobStatusRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
