// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInstanceAntiBruteForceRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4BE468CE-47A0-54F0-98A1-E253546E6A2C</p>
     */
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
