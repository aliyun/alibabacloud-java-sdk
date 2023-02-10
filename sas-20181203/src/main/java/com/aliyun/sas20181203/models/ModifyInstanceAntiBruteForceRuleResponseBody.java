// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInstanceAntiBruteForceRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAntiBruteForceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAntiBruteForceRuleResponseBody self = new ModifyInstanceAntiBruteForceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAntiBruteForceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
