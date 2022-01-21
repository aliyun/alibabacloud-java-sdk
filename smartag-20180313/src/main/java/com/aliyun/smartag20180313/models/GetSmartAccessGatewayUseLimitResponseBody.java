// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetSmartAccessGatewayUseLimitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalAmount")
    public Integer totalAmount;

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
