// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ManualTriggerMaskingProcessResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-4******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ManualTriggerMaskingProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManualTriggerMaskingProcessResponseBody self = new ManualTriggerMaskingProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public ManualTriggerMaskingProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
