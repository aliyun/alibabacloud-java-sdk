// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeUserBusinessStatusRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeUserBusinessStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBusinessStatusRequest self = new DescribeUserBusinessStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserBusinessStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
