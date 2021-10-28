// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayCategoriesRequest extends TeaModel {
    @NameInMap("GatewayLocation")
    public String gatewayLocation;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeGatewayCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayCategoriesRequest self = new DescribeGatewayCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayCategoriesRequest setGatewayLocation(String gatewayLocation) {
        this.gatewayLocation = gatewayLocation;
        return this;
    }
    public String getGatewayLocation() {
        return this.gatewayLocation;
    }

    public DescribeGatewayCategoriesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
