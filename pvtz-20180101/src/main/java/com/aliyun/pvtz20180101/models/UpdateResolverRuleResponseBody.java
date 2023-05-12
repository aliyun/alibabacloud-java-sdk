// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateResolverRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResolverRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResolverRuleResponseBody self = new UpdateResolverRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResolverRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
