// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetSmartAccessGatewayUseLimitResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2265DB11-F5CC-496E-ADE7-D043AC37926A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of SAG instances that you can purchase.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("TotalAmount")
    public Integer totalAmount;

    /**
     * <p>The number of SAG instances that you have purchased.</p>
     * 
     * <strong>example:</strong>
     * <p>47</p>
     */
    @NameInMap("UsedAmount")
    public Integer usedAmount;

    public static GetSmartAccessGatewayUseLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmartAccessGatewayUseLimitResponseBody self = new GetSmartAccessGatewayUseLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmartAccessGatewayUseLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmartAccessGatewayUseLimitResponseBody setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Integer getTotalAmount() {
        return this.totalAmount;
    }

    public GetSmartAccessGatewayUseLimitResponseBody setUsedAmount(Integer usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }
    public Integer getUsedAmount() {
        return this.usedAmount;
    }

}
