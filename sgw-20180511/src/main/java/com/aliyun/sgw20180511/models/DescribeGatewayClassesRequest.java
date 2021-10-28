// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayClassesRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeGatewayClassesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayClassesRequest self = new DescribeGatewayClassesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayClassesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
