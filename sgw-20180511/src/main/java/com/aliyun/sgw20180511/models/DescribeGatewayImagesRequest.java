// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayImagesRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Type")
    public String type;

    public static DescribeGatewayImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayImagesRequest self = new DescribeGatewayImagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayImagesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeGatewayImagesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
