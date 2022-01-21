// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetCloudConnectNetworkUseLimitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalAmount")
    public Integer totalAmount;

    @NameInMap("UsedAmount")
    public Integer usedAmount;

    public static GetCloudConnectNetworkUseLimitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudConnectNetworkUseLimitResponseBody self = new GetCloudConnectNetworkUseLimitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudConnectNetworkUseLimitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCloudConnectNetworkUseLimitResponseBody setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Integer getTotalAmount() {
        return this.totalAmount;
    }

    public GetCloudConnectNetworkUseLimitResponseBody setUsedAmount(Integer usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }
    public Integer getUsedAmount() {
        return this.usedAmount;
    }

}
