// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class LoadBalancerJoinSecurityGroupResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static LoadBalancerJoinSecurityGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerJoinSecurityGroupResponseBody self = new LoadBalancerJoinSecurityGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public LoadBalancerJoinSecurityGroupResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public LoadBalancerJoinSecurityGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
