// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayCapacityLimitRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("SizeInGB")
    public Long sizeInGB;

    public static DescribeGatewayCapacityLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayCapacityLimitRequest self = new DescribeGatewayCapacityLimitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayCapacityLimitRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeGatewayCapacityLimitRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeGatewayCapacityLimitRequest setSizeInGB(Long sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }
    public Long getSizeInGB() {
        return this.sizeInGB;
    }

}
