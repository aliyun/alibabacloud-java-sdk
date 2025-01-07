// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddPublishBatchResponseBody extends TeaModel {
    /**
     * <p>The ID of the release batch.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BatchId")
    public Long batchId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddPublishBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPublishBatchResponseBody self = new AddPublishBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPublishBatchResponseBody setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

    public AddPublishBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
