// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryTSChunksRequest extends TeaModel {
    @NameInMap("ChunkIds")
    public String chunkIds;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    public static RetryTSChunksRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryTSChunksRequest self = new RetryTSChunksRequest();
        return TeaModel.build(map, self);
    }

    public RetryTSChunksRequest setChunkIds(String chunkIds) {
        this.chunkIds = chunkIds;
        return this;
    }
    public String getChunkIds() {
        return this.chunkIds;
    }

    public RetryTSChunksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RetryTSChunksRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

}
