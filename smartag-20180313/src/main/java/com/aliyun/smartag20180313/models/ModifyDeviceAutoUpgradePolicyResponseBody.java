// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyDeviceAutoUpgradePolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F03C6897-2284-4BC8-94B4-1467BD992A2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDeviceAutoUpgradePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceAutoUpgradePolicyResponseBody self = new ModifyDeviceAutoUpgradePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceAutoUpgradePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
