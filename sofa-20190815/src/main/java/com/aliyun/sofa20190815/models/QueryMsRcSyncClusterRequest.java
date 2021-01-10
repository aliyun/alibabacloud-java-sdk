// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsRcSyncClusterRequest extends TeaModel {
    @NameInMap("ClusterTaskUniqueKey")
    public String clusterTaskUniqueKey;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMsRcSyncClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsRcSyncClusterRequest self = new QueryMsRcSyncClusterRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsRcSyncClusterRequest setClusterTaskUniqueKey(String clusterTaskUniqueKey) {
        this.clusterTaskUniqueKey = clusterTaskUniqueKey;
        return this;
    }
    public String getClusterTaskUniqueKey() {
        return this.clusterTaskUniqueKey;
    }

    public QueryMsRcSyncClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
