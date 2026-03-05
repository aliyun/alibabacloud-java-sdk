// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheCustomInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeTairKVCacheCustomInstancesResponseBodyInstances instances;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>B79C1A90-495B-4E99-A2AA-A4DB13B8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTairKVCacheCustomInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheCustomInstancesResponseBody self = new DescribeTairKVCacheCustomInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheCustomInstancesResponseBody setInstances(DescribeTairKVCacheCustomInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeTairKVCacheCustomInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeTairKVCacheCustomInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTairKVCacheCustomInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTairKVCacheCustomInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTairKVCacheCustomInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTagsTag self = new DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTagsTag> tag;

        public static DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTags self = new DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTags();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTags setTag(java.util.List<DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance extends TeaModel {
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DestroyTime")
        public String destroyTime;

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

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Storage")
        public Long storage;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Tags")
        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTags tags;

        @NameInMap("UseEni")
        public Boolean useEni;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance self = new DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setStorage(Long storage) {
            this.storage = storage;
            return this;
        }
        public Long getStorage() {
            return this.storage;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setTags(DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTags getTags() {
            return this.tags;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setUseEni(Boolean useEni) {
            this.useEni = useEni;
            return this;
        }
        public Boolean getUseEni() {
            return this.useEni;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeTairKVCacheCustomInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("KVStoreInstance")
        public java.util.List<DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance> KVStoreInstance;

        public static DescribeTairKVCacheCustomInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheCustomInstancesResponseBodyInstances self = new DescribeTairKVCacheCustomInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheCustomInstancesResponseBodyInstances setKVStoreInstance(java.util.List<DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance> KVStoreInstance) {
            this.KVStoreInstance = KVStoreInstance;
            return this;
        }
        public java.util.List<DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstance> getKVStoreInstance() {
            return this.KVStoreInstance;
        }

    }

}
