// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheInferInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeTairKVCacheInferInstancesResponseBodyInstances instances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTairKVCacheInferInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairKVCacheInferInstancesResponseBody self = new DescribeTairKVCacheInferInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTairKVCacheInferInstancesResponseBody setInstances(DescribeTairKVCacheInferInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeTairKVCacheInferInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeTairKVCacheInferInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTairKVCacheInferInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTairKVCacheInferInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTairKVCacheInferInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTagsTag self = new DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTagsTag> tag;

        public static DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTags self = new DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTags();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTags setTag(java.util.List<DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO extends TeaModel {
        @NameInMap("Capacity")
        public Long capacity;

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

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReserveGpuNum")
        public Integer reserveGpuNum;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTags tags;

        @NameInMap("UsedGpuNum")
        public Integer usedGpuNum;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO self = new DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setReserveGpuNum(Integer reserveGpuNum) {
            this.reserveGpuNum = reserveGpuNum;
            return this;
        }
        public Integer getReserveGpuNum() {
            return this.reserveGpuNum;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setTags(DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTags getTags() {
            return this.tags;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setUsedGpuNum(Integer usedGpuNum) {
            this.usedGpuNum = usedGpuNum;
            return this;
        }
        public Integer getUsedGpuNum() {
            return this.usedGpuNum;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeTairKVCacheInferInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("TairInferInstanceDTO")
        public java.util.List<DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO> tairInferInstanceDTO;

        public static DescribeTairKVCacheInferInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheInferInstancesResponseBodyInstances self = new DescribeTairKVCacheInferInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstances setTairInferInstanceDTO(java.util.List<DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO> tairInferInstanceDTO) {
            this.tairInferInstanceDTO = tairInferInstanceDTO;
            return this;
        }
        public java.util.List<DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO> getTairInferInstanceDTO() {
            return this.tairInferInstanceDTO;
        }

    }

}
