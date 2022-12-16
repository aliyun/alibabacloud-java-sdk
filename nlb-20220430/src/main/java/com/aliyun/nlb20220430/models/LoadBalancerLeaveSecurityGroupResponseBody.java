// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class LoadBalancerLeaveSecurityGroupResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static LoadBalancerLeaveSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerLeaveSecurityGroupResponseBody self = new LoadBalancerLeaveSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public LoadBalancerLeaveSecurityGroupResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public LoadBalancerLeaveSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
