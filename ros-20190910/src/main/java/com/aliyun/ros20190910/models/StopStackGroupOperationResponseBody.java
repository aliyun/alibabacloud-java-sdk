// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class StopStackGroupOperationResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopStackGroupOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopStackGroupOperationResponseBody self = new StopStackGroupOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public StopStackGroupOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
