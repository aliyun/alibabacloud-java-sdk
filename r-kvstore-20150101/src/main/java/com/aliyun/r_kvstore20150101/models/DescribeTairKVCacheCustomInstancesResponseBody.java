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
        /**
         * <strong>example:</strong>
         * <p>tagkey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>tagvalue</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>2018-11-07T08:49:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2019-04-28T10:03:01Z</p>
         */
        @NameInMap("DestroyTime")
        public String destroyTime;

        /**
         * <strong>example:</strong>
         * <p>2024-05-21T00:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>tair.gpu.test.16g</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <strong>example:</strong>
         * <p>tc-bp1zxszhcgatnx****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <strong>example:</strong>
         * <p>TairCustom</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmyiu4ekp****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Storage")
        public Long storage;

        /**
         * <strong>example:</strong>
         * <p>essd_pl1</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Tags")
        public DescribeTairKVCacheCustomInstancesResponseBodyInstancesKVStoreInstanceTags tags;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1e7clcw529l773d****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1nme44gek34slfc****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
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
