// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairKVCacheInferInstancesResponseBody extends TeaModel {
    /**
     * <p>The information about the returned Tair (Redis OSS-compatible) KVCache instance.</p>
     */
    @NameInMap("Instances")
    public DescribeTairKVCacheInferInstancesResponseBodyInstances instances;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CD225838-7069-5CE4-89E1-67B83AC149C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned records.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>thread</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
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
        /**
         * <p>The ACK cluster ID corresponding to the virtual cluster instance.</p>
         * 
         * <strong>example:</strong>
         * <p>c809******************************</p>
         */
        @NameInMap("AckId")
        public String ackId;

        /**
         * <p>The capacity of the KVCache. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The billing method of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of compute units.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComputeUnitNum")
        public Integer computeUnitNum;

        /**
         * <p>The creation time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-07T04:46Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the instance was deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-07T04:46Z</p>
         */
        @NameInMap("DestroyTime")
        public String destroyTime;

        @NameInMap("ElasticVNodeCount")
        public Integer elasticVNodeCount;

        /**
         * <p>The time when the subscription instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-04T02:09:26Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FixedVNodeCount")
        public Integer fixedVNodeCount;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>kvcache.cu.g4b.2</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>tk-9dp7e37bab*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>kvcache-7</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance state. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The instance is normal.</li>
         * <li><strong>Creating</strong>: The instance is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>TairInfer</strong>: the inference operator instance</li>
         * <li><strong>TairKVCacheVnode</strong>: the virtual cluster instance.</li>
         * <li><strong>TairKVCacheService</strong>: the cache service instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TairInfer</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The built-in model of the inference operator instance.</p>
         * 
         * <strong>example:</strong>
         * <p>DeepSeek-OCR</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The number of model services of the inference operator instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ModelServiceNum")
        public Integer modelServiceNum;

        /**
         * <p>The network type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The private IP address of the instance. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.49.***</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm4bdru5z****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Details of the tags.</p>
         */
        @NameInMap("Tags")
        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTOTags tags;

        /**
         * <p>The number of vNodes in the virtual cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("VNodeCount")
        public Integer VNodeCount;

        /**
         * <p>The list of vNode instance names under the virtual cluster instance. This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>tv-xxxxx</p>
         */
        @NameInMap("VNodeName")
        public String VNodeName;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-8vbf0ksk774ai6q1d****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zef5w848p4j5g***</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO self = new DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO();
            return TeaModel.build(map, self);
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setAckId(String ackId) {
            this.ackId = ackId;
            return this;
        }
        public String getAckId() {
            return this.ackId;
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

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setComputeUnitNum(Integer computeUnitNum) {
            this.computeUnitNum = computeUnitNum;
            return this;
        }
        public Integer getComputeUnitNum() {
            return this.computeUnitNum;
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

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setElasticVNodeCount(Integer elasticVNodeCount) {
            this.elasticVNodeCount = elasticVNodeCount;
            return this;
        }
        public Integer getElasticVNodeCount() {
            return this.elasticVNodeCount;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setFixedVNodeCount(Integer fixedVNodeCount) {
            this.fixedVNodeCount = fixedVNodeCount;
            return this;
        }
        public Integer getFixedVNodeCount() {
            return this.fixedVNodeCount;
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

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setModelServiceNum(Integer modelServiceNum) {
            this.modelServiceNum = modelServiceNum;
            return this;
        }
        public Integer getModelServiceNum() {
            return this.modelServiceNum;
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

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setVNodeCount(Integer VNodeCount) {
            this.VNodeCount = VNodeCount;
            return this;
        }
        public Integer getVNodeCount() {
            return this.VNodeCount;
        }

        public DescribeTairKVCacheInferInstancesResponseBodyInstancesTairInferInstanceDTO setVNodeName(String VNodeName) {
            this.VNodeName = VNodeName;
            return this;
        }
        public String getVNodeName() {
            return this.VNodeName;
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
