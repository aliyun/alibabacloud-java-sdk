// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayTypesRequest extends TeaModel {
    @NameInMap("GatewayLocation")
    public String gatewayLocation;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeGatewayTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayTypesRequest self = new DescribeGatewayTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayTypesRequest setGatewayLocation(String gatewayLocation) {
        this.gatewayLocation = gatewayLocation;
        return this;
    }
    public String getGatewayLocation() {
        return this.gatewayLocation;
    }

    public DescribeGatewayTypesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
