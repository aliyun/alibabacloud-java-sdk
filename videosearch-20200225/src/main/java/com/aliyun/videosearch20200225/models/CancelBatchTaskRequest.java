// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videosearch20200225.models;

import com.aliyun.tea.*;

public class CancelBatchTaskRequest extends TeaModel {
    @NameInMap("BatchTaskId")
    public Long batchTaskId;

    public static CancelBatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelBatchTaskRequest self = new CancelBatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelBatchTaskRequest setBatchTaskId(Long batchTaskId) {
        this.batchTaskId = batchTaskId;
        return this;
    }
    public Long getBatchTaskId() {
        return this.batchTaskId;
    }

}
