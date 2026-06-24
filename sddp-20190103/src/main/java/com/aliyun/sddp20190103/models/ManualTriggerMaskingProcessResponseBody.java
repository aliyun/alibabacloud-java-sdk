// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ManualTriggerMaskingProcessResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7C3AC882-E5A8-4855-BE77-B6837B695EF1</p>
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
