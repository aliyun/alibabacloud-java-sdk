// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayLocationsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeGatewayLocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayLocationsRequest self = new DescribeGatewayLocationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayLocationsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
