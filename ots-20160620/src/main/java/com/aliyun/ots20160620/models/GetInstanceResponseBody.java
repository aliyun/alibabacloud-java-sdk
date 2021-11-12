// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceInfo")
    public GetInstanceResponseBodyInstanceInfo instanceInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setInstanceInfo(GetInstanceResponseBodyInstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public GetInstanceResponseBodyInstanceInfo getInstanceInfo() {
        return this.instanceInfo;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceResponseBodyInstanceInfoQuota extends TeaModel {
        @NameInMap("EntityQuota")
        public Integer entityQuota;

        public static GetInstanceResponseBodyInstanceInfoQuota build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceInfoQuota self = new GetInstanceResponseBodyInstanceInfoQuota();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceInfoQuota setEntityQuota(Integer entityQuota) {
            this.entityQuota = entityQuota;
            return this;
        }
        public Integer getEntityQuota() {
            return this.entityQuota;
        }

    }

    public static class GetInstanceResponseBodyInstanceInfoTagInfosTagInfo extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static GetInstanceResponseBodyInstanceInfoTagInfosTagInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceInfoTagInfosTagInfo self = new GetInstanceResponseBodyInstanceInfoTagInfosTagInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceInfoTagInfosTagInfo setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetInstanceResponseBodyInstanceInfoTagInfosTagInfo setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetInstanceResponseBodyInstanceInfoTagInfos extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.List<GetInstanceResponseBodyInstanceInfoTagInfosTagInfo> tagInfo;

        public static GetInstanceResponseBodyInstanceInfoTagInfos build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceInfoTagInfos self = new GetInstanceResponseBodyInstanceInfoTagInfos();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceInfoTagInfos setTagInfo(java.util.List<GetInstanceResponseBodyInstanceInfoTagInfosTagInfo> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyInstanceInfoTagInfosTagInfo> getTagInfo() {
            return this.tagInfo;
        }

    }

    public static class GetInstanceResponseBodyInstanceInfo extends TeaModel {
        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Network")
        public String network;

        @NameInMap("Quota")
        public GetInstanceResponseBodyInstanceInfoQuota quota;

        @NameInMap("ReadCapacity")
        public Integer readCapacity;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TagInfos")
        public GetInstanceResponseBodyInstanceInfoTagInfos tagInfos;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WriteCapacity")
        public Integer writeCapacity;

        public static GetInstanceResponseBodyInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceInfo self = new GetInstanceResponseBodyInstanceInfo();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public GetInstanceResponseBodyInstanceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetInstanceResponseBodyInstanceInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetInstanceResponseBodyInstanceInfo setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetInstanceResponseBodyInstanceInfo setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public GetInstanceResponseBodyInstanceInfo setQuota(GetInstanceResponseBodyInstanceInfoQuota quota) {
            this.quota = quota;
            return this;
        }
        public GetInstanceResponseBodyInstanceInfoQuota getQuota() {
            return this.quota;
        }

        public GetInstanceResponseBodyInstanceInfo setReadCapacity(Integer readCapacity) {
            this.readCapacity = readCapacity;
            return this;
        }
        public Integer getReadCapacity() {
            return this.readCapacity;
        }

        public GetInstanceResponseBodyInstanceInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetInstanceResponseBodyInstanceInfo setTagInfos(GetInstanceResponseBodyInstanceInfoTagInfos tagInfos) {
            this.tagInfos = tagInfos;
            return this;
        }
        public GetInstanceResponseBodyInstanceInfoTagInfos getTagInfos() {
            return this.tagInfos;
        }

        public GetInstanceResponseBodyInstanceInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetInstanceResponseBodyInstanceInfo setWriteCapacity(Integer writeCapacity) {
            this.writeCapacity = writeCapacity;
            return this;
        }
        public Integer getWriteCapacity() {
            return this.writeCapacity;
        }

    }

}
