// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteACLRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteACLRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteACLRuleResponseBody self = new DeleteACLRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteACLRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
