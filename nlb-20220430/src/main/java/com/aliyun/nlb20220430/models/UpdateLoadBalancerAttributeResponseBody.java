// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class UpdateLoadBalancerAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>aab74cfa-3bc4-48fc-80fc-0101da5a****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7294679F-08DE-16D4-8E5D-1625685DC10B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLoadBalancerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoadBalancerAttributeResponseBody self = new UpdateLoadBalancerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoadBalancerAttributeResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateLoadBalancerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
