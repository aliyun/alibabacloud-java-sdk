// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeExpireCachesRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeExpireCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpireCachesRequest self = new DescribeExpireCachesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpireCachesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeExpireCachesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
