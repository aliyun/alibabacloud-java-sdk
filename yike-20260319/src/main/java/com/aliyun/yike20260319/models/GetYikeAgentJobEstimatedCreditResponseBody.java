// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeAgentJobEstimatedCreditResponseBody extends TeaModel {
    /**
     * <p>The estimated credits to be deducted.</p>
     * 
     * <strong>example:</strong>
     * <p>20.1</p>
     */
    @NameInMap("EstimatedCreditCost")
    public Double estimatedCreditCost;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetYikeAgentJobEstimatedCreditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetYikeAgentJobEstimatedCreditResponseBody self = new GetYikeAgentJobEstimatedCreditResponseBody();
        return TeaModel.build(map, self);
    }

    public GetYikeAgentJobEstimatedCreditResponseBody setEstimatedCreditCost(Double estimatedCreditCost) {
        this.estimatedCreditCost = estimatedCreditCost;
        return this;
    }
    public Double getEstimatedCreditCost() {
        return this.estimatedCreditCost;
    }

    public GetYikeAgentJobEstimatedCreditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
