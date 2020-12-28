// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRuleResponseBody self = new SetRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
