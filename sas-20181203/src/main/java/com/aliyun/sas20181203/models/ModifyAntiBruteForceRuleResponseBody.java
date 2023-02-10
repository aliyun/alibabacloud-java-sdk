// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAntiBruteForceRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAntiBruteForceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAntiBruteForceRuleResponseBody self = new ModifyAntiBruteForceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAntiBruteForceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
