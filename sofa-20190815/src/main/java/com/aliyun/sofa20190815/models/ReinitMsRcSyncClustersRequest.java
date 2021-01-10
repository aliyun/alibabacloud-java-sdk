// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReinitMsRcSyncClustersRequest extends TeaModel {
    @NameInMap("ClusterTaskUniqueKey")
    public String clusterTaskUniqueKey;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NewCluster")
    public String newCluster;

    @NameInMap("ReplaceClusterEnabled")
    public String replaceClusterEnabled;

    public static ReinitMsRcSyncClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitMsRcSyncClustersRequest self = new ReinitMsRcSyncClustersRequest();
        return TeaModel.build(map, self);
    }

    public ReinitMsRcSyncClustersRequest setClusterTaskUniqueKey(String clusterTaskUniqueKey) {
        this.clusterTaskUniqueKey = clusterTaskUniqueKey;
        return this;
    }
    public String getClusterTaskUniqueKey() {
        return this.clusterTaskUniqueKey;
    }

    public ReinitMsRcSyncClustersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReinitMsRcSyncClustersRequest setNewCluster(String newCluster) {
        this.newCluster = newCluster;
        return this;
    }
    public String getNewCluster() {
        return this.newCluster;
    }

    public ReinitMsRcSyncClustersRequest setReplaceClusterEnabled(String replaceClusterEnabled) {
        this.replaceClusterEnabled = replaceClusterEnabled;
        return this;
    }
    public String getReplaceClusterEnabled() {
        return this.replaceClusterEnabled;
    }

}
