// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateBatchTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pcb-xxx</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <strong>example:</strong>
     * <p>C61892A4-0850-4516-9E26-44D96C1782DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBatchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTaskResponseBody self = new CreateBatchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBatchTaskResponseBody setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CreateBatchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
