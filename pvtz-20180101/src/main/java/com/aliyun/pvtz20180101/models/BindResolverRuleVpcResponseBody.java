// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class BindResolverRuleVpcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindResolverRuleVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindResolverRuleVpcResponseBody self = new BindResolverRuleVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public BindResolverRuleVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
