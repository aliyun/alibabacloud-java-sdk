// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayStockRequest extends TeaModel {
    @NameInMap("GatewayRegionId")
    public String gatewayRegionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeGatewayStockRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayStockRequest self = new DescribeGatewayStockRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayStockRequest setGatewayRegionId(String gatewayRegionId) {
        this.gatewayRegionId = gatewayRegionId;
        return this;
    }
    public String getGatewayRegionId() {
        return this.gatewayRegionId;
    }

    public DescribeGatewayStockRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
