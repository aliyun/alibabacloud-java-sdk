// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopMsRcSyncTaskRequest extends TeaModel {
    @NameInMap("ClusterTaskUniqueKey")
    public String clusterTaskUniqueKey;

    @NameInMap("InstanceId")
    public String instanceId;

    public static StopMsRcSyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMsRcSyncTaskRequest self = new StopMsRcSyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopMsRcSyncTaskRequest setClusterTaskUniqueKey(String clusterTaskUniqueKey) {
        this.clusterTaskUniqueKey = clusterTaskUniqueKey;
        return this;
    }
    public String getClusterTaskUniqueKey() {
        return this.clusterTaskUniqueKey;
    }

    public StopMsRcSyncTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
