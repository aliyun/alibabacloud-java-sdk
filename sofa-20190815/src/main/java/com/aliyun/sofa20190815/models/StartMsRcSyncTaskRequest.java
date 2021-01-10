// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartMsRcSyncTaskRequest extends TeaModel {
    @NameInMap("ClusterTaskUniqueKey")
    public String clusterTaskUniqueKey;

    @NameInMap("InstanceId")
    public String instanceId;

    public static StartMsRcSyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMsRcSyncTaskRequest self = new StartMsRcSyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartMsRcSyncTaskRequest setClusterTaskUniqueKey(String clusterTaskUniqueKey) {
        this.clusterTaskUniqueKey = clusterTaskUniqueKey;
        return this;
    }
    public String getClusterTaskUniqueKey() {
        return this.clusterTaskUniqueKey;
    }

    public StartMsRcSyncTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
