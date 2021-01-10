// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSExecuteInstanceStepsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    @NameInMap("Sharding")
    public Long sharding;

    public static QueryTSExecuteInstanceStepsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSExecuteInstanceStepsRequest self = new QueryTSExecuteInstanceStepsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSExecuteInstanceStepsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSExecuteInstanceStepsRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

    public QueryTSExecuteInstanceStepsRequest setSharding(Long sharding) {
        this.sharding = sharding;
        return this;
    }
    public Long getSharding() {
        return this.sharding;
    }

}
