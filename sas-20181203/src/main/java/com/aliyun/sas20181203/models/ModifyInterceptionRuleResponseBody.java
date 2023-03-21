// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInterceptionRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionRuleResponseBody self = new ModifyInterceptionRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
