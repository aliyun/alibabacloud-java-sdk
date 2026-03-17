// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetCloudConnectNetworkUseLimitResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BCD04867-56C3-43DC-8FEF-923EFB8B56DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The maximum number of CCN instances that the current account can create in the specified region.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalAmount")
    public Integer totalAmount;

    /**
     * <p>The number of CCN instances that you have created.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
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
