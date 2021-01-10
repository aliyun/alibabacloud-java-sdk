// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsRcSyncBucketRequest extends TeaModel {
    @NameInMap("AutoStart")
    public Boolean autoStart;

    @NameInMap("ClusterTaskUniqueKey")
    public String clusterTaskUniqueKey;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SourceCluster")
    public String sourceCluster;

    @NameInMap("TargetCluster")
    public String targetCluster;

    @NameInMap("TwoWaySync")
    public Boolean twoWaySync;

    public static AddMsRcSyncBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMsRcSyncBucketRequest self = new AddMsRcSyncBucketRequest();
        return TeaModel.build(map, self);
    }

    public AddMsRcSyncBucketRequest setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public AddMsRcSyncBucketRequest setClusterTaskUniqueKey(String clusterTaskUniqueKey) {
        this.clusterTaskUniqueKey = clusterTaskUniqueKey;
        return this;
    }
    public String getClusterTaskUniqueKey() {
        return this.clusterTaskUniqueKey;
    }

    public AddMsRcSyncBucketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddMsRcSyncBucketRequest setSourceCluster(String sourceCluster) {
        this.sourceCluster = sourceCluster;
        return this;
    }
    public String getSourceCluster() {
        return this.sourceCluster;
    }

    public AddMsRcSyncBucketRequest setTargetCluster(String targetCluster) {
        this.targetCluster = targetCluster;
        return this;
    }
    public String getTargetCluster() {
        return this.targetCluster;
    }

    public AddMsRcSyncBucketRequest setTwoWaySync(Boolean twoWaySync) {
        this.twoWaySync = twoWaySync;
        return this;
    }
    public Boolean getTwoWaySync() {
        return this.twoWaySync;
    }

}
