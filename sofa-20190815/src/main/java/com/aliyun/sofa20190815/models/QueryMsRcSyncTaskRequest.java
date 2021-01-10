// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsRcSyncTaskRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterTaskUniqueKey")
    public String clusterTaskUniqueKey;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Type")
    public String type;

    public static QueryMsRcSyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsRcSyncTaskRequest self = new QueryMsRcSyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsRcSyncTaskRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QueryMsRcSyncTaskRequest setClusterTaskUniqueKey(String clusterTaskUniqueKey) {
        this.clusterTaskUniqueKey = clusterTaskUniqueKey;
        return this;
    }
    public String getClusterTaskUniqueKey() {
        return this.clusterTaskUniqueKey;
    }

    public QueryMsRcSyncTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsRcSyncTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
