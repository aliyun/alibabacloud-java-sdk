// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSChunksExecutionRequest extends TeaModel {
    @NameInMap("ExecuteHandler")
    public String executeHandler;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    public static QueryTSChunksExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSChunksExecutionRequest self = new QueryTSChunksExecutionRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSChunksExecutionRequest setExecuteHandler(String executeHandler) {
        this.executeHandler = executeHandler;
        return this;
    }
    public String getExecuteHandler() {
        return this.executeHandler;
    }

    public QueryTSChunksExecutionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSChunksExecutionRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

}
