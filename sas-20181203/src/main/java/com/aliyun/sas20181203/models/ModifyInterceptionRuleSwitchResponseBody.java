// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyInterceptionRuleSwitchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>DE725A60-95F2-50E8-8F5D-81055215E7DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInterceptionRuleSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInterceptionRuleSwitchResponseBody self = new ModifyInterceptionRuleSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInterceptionRuleSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
