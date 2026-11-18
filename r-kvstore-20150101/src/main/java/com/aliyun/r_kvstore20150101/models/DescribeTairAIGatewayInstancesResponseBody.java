// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairAIGatewayInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeTairAIGatewayInstancesResponseBodyInstances instances;

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
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instance records for batch instance creation. This parameter is not returned when a single instance is created.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTairAIGatewayInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairAIGatewayInstancesResponseBody self = new DescribeTairAIGatewayInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTairAIGatewayInstancesResponseBody setInstances(DescribeTairAIGatewayInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeTairAIGatewayInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeTairAIGatewayInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTairAIGatewayInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTairAIGatewayInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTairAIGatewayInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTagsTag self = new DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTagsTag> tag;

        public static DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTags self = new DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTags setTag(java.util.List<DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances extends TeaModel {
        @NameInMap("ChargeType")
        public String chargeType;

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

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTags tags;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances self = new DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances();
            return TeaModel.build(map, self);
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setTags(DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstancesTags getTags() {
            return this.tags;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeTairAIGatewayInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("TairSemanticCacheInstances")
        public java.util.List<DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances> tairSemanticCacheInstances;

        public static DescribeTairAIGatewayInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeTairAIGatewayInstancesResponseBodyInstances self = new DescribeTairAIGatewayInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeTairAIGatewayInstancesResponseBodyInstances setTairSemanticCacheInstances(java.util.List<DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances> tairSemanticCacheInstances) {
            this.tairSemanticCacheInstances = tairSemanticCacheInstances;
            return this;
        }
        public java.util.List<DescribeTairAIGatewayInstancesResponseBodyInstancesTairSemanticCacheInstances> getTairSemanticCacheInstances() {
            return this.tairSemanticCacheInstances;
        }

    }

}
