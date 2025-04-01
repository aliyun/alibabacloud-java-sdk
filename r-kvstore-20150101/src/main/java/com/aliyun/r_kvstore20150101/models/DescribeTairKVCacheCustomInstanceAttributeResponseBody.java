// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheCustomInstanceAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>tair_custom</p>
     */
    @NameInMap("ArchitectureType")
    public String architectureType;

    /**
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cpu")
    public Long cpu;

    /**
     * <strong>example:</strong>
     * <p>2024-02-21T08:23Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Disks")
    public DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisks disks;

    /**
     * <strong>example:</strong>
     * <p>2024-05-28T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>m-bp10k5694v6yfevajw**</p>
     */
    @NameInMap("ImageId")
    public String imageId;

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
     * <p>newinstancename</p>
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
     * <p>true</p>
     */
    @NameInMap("IsOrderCompleted")
    public Boolean isOrderCompleted;

    /**
     * <strong>example:</strong>
     * <p>262144</p>
     */
    @NameInMap("Memory")
    public Long memory;

    /**
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <strong>example:</strong>
     * <p>172.16.49.***</p>
     */
    @NameInMap("PrivateIp")
    public String privateIp;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>2BE6E619-A657-42E3-AD2D-18F8428A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>sg-bpcfmyiu4ekp****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <strong>example:</strong>
     * <p>60</p>
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
    public DescribeTairKVCacheCustomInstanceAttributeResponseBodyTags tags;

    @NameInMap("UseEni")
    public Boolean useEni;

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
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <strong>example:</strong>
     * <p>singlezone</p>
     */
    @NameInMap("ZoneType")
    public String zoneType;

    public static DescribeTairKVCacheCustomInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheCustomInstanceAttributeResponseBody self = new DescribeTairKVCacheCustomInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
        return this;
    }
    public String getArchitectureType() {
        return this.architectureType;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setDisks(DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisks disks) {
        this.disks = disks;
        return this;
    }
    public DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisks getDisks() {
        return this.disks;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setIsOrderCompleted(Boolean isOrderCompleted) {
        this.isOrderCompleted = isOrderCompleted;
        return this;
    }
    public Boolean getIsOrderCompleted() {
        return this.isOrderCompleted;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setStorage(Long storage) {
        this.storage = storage;
        return this;
    }
    public Long getStorage() {
        return this.storage;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setTags(DescribeTairKVCacheCustomInstanceAttributeResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeTairKVCacheCustomInstanceAttributeResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setUseEni(Boolean useEni) {
        this.useEni = useEni;
        return this;
    }
    public Boolean getUseEni() {
        return this.useEni;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeTairKVCacheCustomInstanceAttributeResponseBody setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

    public static class DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisksDisk extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d-5v1aggi3ffoxufb57**</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <strong>example:</strong>
         * <p>data</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisksDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisksDisk self = new DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisksDisk();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisksDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisksDisk setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisksDisk setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisks extends TeaModel {
        @NameInMap("Disk")
        public java.util.List<DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisksDisk> disk;

        public static DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisks self = new DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisks();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisks setDisk(java.util.List<DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisksDisk> disk) {
            this.disk = disk;
            return this;
        }
        public java.util.List<DescribeTairKVCacheCustomInstanceAttributeResponseBodyDisksDisk> getDisk() {
            return this.disk;
        }

    }

    public static class DescribeTairKVCacheCustomInstanceAttributeResponseBodyTagsTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeTairKVCacheCustomInstanceAttributeResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheCustomInstanceAttributeResponseBodyTagsTag self = new DescribeTairKVCacheCustomInstanceAttributeResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheCustomInstanceAttributeResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTairKVCacheCustomInstanceAttributeResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTairKVCacheCustomInstanceAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeTairKVCacheCustomInstanceAttributeResponseBodyTagsTag> tag;

        public static DescribeTairKVCacheCustomInstanceAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheCustomInstanceAttributeResponseBodyTags self = new DescribeTairKVCacheCustomInstanceAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheCustomInstanceAttributeResponseBodyTags setTag(java.util.List<DescribeTairKVCacheCustomInstanceAttributeResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeTairKVCacheCustomInstanceAttributeResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
