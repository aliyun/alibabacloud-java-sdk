// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBatchTaskRequest extends TeaModel {
    /**
     * <p>The ID of the batch task.</p>
     * 
     * <strong>example:</strong>
     * <p>pcb-xxx</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    public static DescribeBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchTaskRequest self = new DescribeBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBatchTaskRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

}
