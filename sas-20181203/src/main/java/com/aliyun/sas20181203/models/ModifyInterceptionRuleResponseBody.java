// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6961B151-B43C-533B-8B2E-1D3151D7F5B2</p>
     */
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
