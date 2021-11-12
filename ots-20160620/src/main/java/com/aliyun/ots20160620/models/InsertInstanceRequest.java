// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class InsertInstanceRequest extends TeaModel {
    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Network")
    public String network;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TagInfo")
    public java.util.List<InsertInstanceRequestTagInfo> tagInfo;

    public static InsertInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertInstanceRequest self = new InsertInstanceRequest();
        return TeaModel.build(map, self);
    }

    public InsertInstanceRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public InsertInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InsertInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public InsertInstanceRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public InsertInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public InsertInstanceRequest setTagInfo(java.util.List<InsertInstanceRequestTagInfo> tagInfo) {
        this.tagInfo = tagInfo;
        return this;
    }
    public java.util.List<InsertInstanceRequestTagInfo> getTagInfo() {
        return this.tagInfo;
    }

    public static class InsertInstanceRequestTagInfo extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static InsertInstanceRequestTagInfo build(java.util.Map<String, ?> map) throws Exception {
            InsertInstanceRequestTagInfo self = new InsertInstanceRequestTagInfo();
            return TeaModel.build(map, self);
        }

        public InsertInstanceRequestTagInfo setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public InsertInstanceRequestTagInfo setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
