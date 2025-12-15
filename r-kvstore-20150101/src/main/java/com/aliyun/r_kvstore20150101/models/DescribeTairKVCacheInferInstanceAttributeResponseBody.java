// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheInferInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstances instances;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTairKVCacheInferInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheInferInstanceAttributeResponseBody self = new DescribeTairKVCacheInferInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheInferInstanceAttributeResponseBody setInstances(DescribeTairKVCacheInferInstanceAttributeResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeTairKVCacheInferInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag self = new DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag> tag;

        public static DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags self = new DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags setTag(java.util.List<DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute extends TeaModel {
        @NameInMap("ArchitectureType")
        public String architectureType;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ComputeUnitNum")
        public Integer computeUnitNum;

        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IsDelete")
        public Integer isDelete;

        @NameInMap("IsOrderCompleted")
        public String isOrderCompleted;

        @NameInMap("Model")
        public String model;

        @NameInMap("ModelServiceNum")
        public Integer modelServiceNum;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReplicaNum")
        public String replicaNum;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Storage")
        public Long storage;

        @NameInMap("Tags")
        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags tags;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneType")
        public String zoneType;

        public static DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute self = new DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setArchitectureType(String architectureType) {
            this.architectureType = architectureType;
            return this;
        }
        public String getArchitectureType() {
            return this.architectureType;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setComputeUnitNum(Integer computeUnitNum) {
            this.computeUnitNum = computeUnitNum;
            return this;
        }
        public Integer getComputeUnitNum() {
            return this.computeUnitNum;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Integer getIsDelete() {
            return this.isDelete;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setIsOrderCompleted(String isOrderCompleted) {
            this.isOrderCompleted = isOrderCompleted;
            return this;
        }
        public String getIsOrderCompleted() {
            return this.isOrderCompleted;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setModelServiceNum(Integer modelServiceNum) {
            this.modelServiceNum = modelServiceNum;
            return this;
        }
        public Integer getModelServiceNum() {
            return this.modelServiceNum;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setReplicaNum(String replicaNum) {
            this.replicaNum = replicaNum;
            return this;
        }
        public String getReplicaNum() {
            return this.replicaNum;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setTags(DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttributeTags getTags() {
            return this.tags;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute setZoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }
        public String getZoneType() {
            return this.zoneType;
        }

    }

    public static class DescribeTairKVCacheInferInstanceAttributeResponseBodyInstances extends TeaModel {
        @NameInMap("DBInstanceAttribute")
        public java.util.List<DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute> DBInstanceAttribute;

        public static DescribeTairKVCacheInferInstanceAttributeResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheInferInstanceAttributeResponseBodyInstances self = new DescribeTairKVCacheInferInstanceAttributeResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheInferInstanceAttributeResponseBodyInstances setDBInstanceAttribute(java.util.List<DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute> DBInstanceAttribute) {
            this.DBInstanceAttribute = DBInstanceAttribute;
            return this;
        }
        public java.util.List<DescribeTairKVCacheInferInstanceAttributeResponseBodyInstancesDBInstanceAttribute> getDBInstanceAttribute() {
            return this.DBInstanceAttribute;
        }

    }

}
