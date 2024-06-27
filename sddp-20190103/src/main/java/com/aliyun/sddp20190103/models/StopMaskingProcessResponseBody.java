// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class StopMaskingProcessResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopMaskingProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopMaskingProcessResponseBody self = new StopMaskingProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public StopMaskingProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
