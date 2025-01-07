// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateTargetListByBatchResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FBBEB173-1F43-505F-A876-C03ECD******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTargetListByBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTargetListByBatchResponseBody self = new UpdateTargetListByBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTargetListByBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
