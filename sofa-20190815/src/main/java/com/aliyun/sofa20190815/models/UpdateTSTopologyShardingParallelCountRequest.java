// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateTSTopologyShardingParallelCountRequest extends TeaModel {
    @NameInMap("ActivityInstanceId")
    public Long activityInstanceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ParallelCount")
    public Long parallelCount;

    public static UpdateTSTopologyShardingParallelCountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTSTopologyShardingParallelCountRequest self = new UpdateTSTopologyShardingParallelCountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTSTopologyShardingParallelCountRequest setActivityInstanceId(Long activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
        return this;
    }
    public Long getActivityInstanceId() {
        return this.activityInstanceId;
    }

    public UpdateTSTopologyShardingParallelCountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTSTopologyShardingParallelCountRequest setParallelCount(Long parallelCount) {
        this.parallelCount = parallelCount;
        return this;
    }
    public Long getParallelCount() {
        return this.parallelCount;
    }

}
