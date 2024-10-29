// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ModifyWorkgroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3E8B9ABB-289A-44E6-942D-8AA9E493****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyWorkgroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWorkgroupAttributeResponseBody self = new ModifyWorkgroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWorkgroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
