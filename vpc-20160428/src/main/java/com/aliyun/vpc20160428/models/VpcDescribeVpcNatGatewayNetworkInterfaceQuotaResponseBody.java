// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody extends TeaModel {
    /**
     * <p>The number of endpoints that can be created.</p>
     */
    @NameInMap("Quota")
    public Long quota;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody self = new VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

    public VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
