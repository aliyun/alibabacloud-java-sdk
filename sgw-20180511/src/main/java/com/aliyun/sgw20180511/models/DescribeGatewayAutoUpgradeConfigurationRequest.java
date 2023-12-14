// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayAutoUpgradeConfigurationRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeGatewayAutoUpgradeConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayAutoUpgradeConfigurationRequest self = new DescribeGatewayAutoUpgradeConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayAutoUpgradeConfigurationRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeGatewayAutoUpgradeConfigurationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
