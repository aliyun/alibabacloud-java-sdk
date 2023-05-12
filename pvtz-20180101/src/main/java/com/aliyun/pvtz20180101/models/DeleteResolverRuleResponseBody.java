// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteResolverRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResolverRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResolverRuleResponseBody self = new DeleteResolverRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResolverRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
