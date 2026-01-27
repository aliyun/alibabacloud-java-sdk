// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstancesResponseBody extends TeaModel {
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
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The details of the instance.</p>
     */
    @NameInMap("RCInstances")
    public java.util.List<DescribeRCInstancesResponseBodyRCInstances> RCInstances;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9DD55F4-1A5F-48CA-BA57-DFB3CA8C4C34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRCInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstancesResponseBody self = new DescribeRCInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRCInstancesResponseBody setRCInstances(java.util.List<DescribeRCInstancesResponseBodyRCInstances> RCInstances) {
        this.RCInstances = RCInstances;
        return this;
    }
    public java.util.List<DescribeRCInstancesResponseBodyRCInstances> getRCInstances() {
        return this.RCInstances;
    }

    public DescribeRCInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRCInstancesResponseBodyRCInstancesTagResources extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeRCInstancesResponseBodyRCInstancesTagResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstancesResponseBodyRCInstancesTagResources self = new DescribeRCInstancesResponseBodyRCInstancesTagResources();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstancesResponseBodyRCInstancesTagResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeRCInstancesResponseBodyRCInstancesTagResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeRCInstancesResponseBodyRCInstancesTagResources setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeRCInstancesResponseBodyRCInstancesTagResources setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeRCInstancesResponseBodyRCInstancesTags extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeRCInstancesResponseBodyRCInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstancesResponseBodyRCInstancesTags self = new DescribeRCInstancesResponseBodyRCInstancesTags();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstancesResponseBodyRCInstancesTags setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeRCInstancesResponseBodyRCInstancesTags setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeRCInstancesResponseBodyRCInstancesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeRCInstancesResponseBodyRCInstancesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeRCInstancesResponseBodyRCInstancesVpcAttributes extends TeaModel {
        @NameInMap("NatIpAddress")
        public String natIpAddress;

        @NameInMap("PrivateIpAddress")
        public java.util.List<String> privateIpAddress;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeRCInstancesResponseBodyRCInstancesVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstancesResponseBodyRCInstancesVpcAttributes self = new DescribeRCInstancesResponseBodyRCInstancesVpcAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstancesResponseBodyRCInstancesVpcAttributes setNatIpAddress(String natIpAddress) {
            this.natIpAddress = natIpAddress;
            return this;
        }
        public String getNatIpAddress() {
            return this.natIpAddress;
        }

        public DescribeRCInstancesResponseBodyRCInstancesVpcAttributes setPrivateIpAddress(java.util.List<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public java.util.List<String> getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public DescribeRCInstancesResponseBodyRCInstancesVpcAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeRCInstancesResponseBodyRCInstancesVpcAttributes setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeRCInstancesResponseBodyRCInstances extends TeaModel {
        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>testrdscustom</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CreateMode")
        public String createMode;

        /**
         * <p>The database type.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_custom</p>
         */
        @NameInMap("DbType")
        public String dbType;

        @NameInMap("DeploymentSetId")
        public String deploymentSetId;

        /**
         * <p>The instance description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The time when the task was created. The time is displayed in GMT.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-22 07:56:53.0</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The host IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.30.XXX.XXX</p>
         */
        @NameInMap("HostIp")
        public String hostIp;

        /**
         * <p>The host name.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zeaiz4g9u23f40m****</p>
         */
        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze704f*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>k8s-node</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Starting</strong></li>
         * <li><strong>Stopping</strong></li>
         * <li><strong>Stopped</strong></li>
         * </ul>
         * <blockquote>
         * <p> If the value returned for the DescribeRCInstances operation is different from the value that is returned for the <strong>DescribeRCInstanceAttribute</strong> operation, the value returned for the <strong>DescribeRCInstanceAttribute</strong> operation shall prevail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TagResources")
        public java.util.List<DescribeRCInstancesResponseBodyRCInstancesTagResources> tagResources;

        @NameInMap("Tags")
        public java.util.List<DescribeRCInstancesResponseBodyRCInstancesTags> tags;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("VpcAttributes")
        public DescribeRCInstancesResponseBodyRCInstancesVpcAttributes vpcAttributes;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6f7l4fg90****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRCInstancesResponseBodyRCInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstancesResponseBodyRCInstances self = new DescribeRCInstancesResponseBodyRCInstances();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstancesResponseBodyRCInstances setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeRCInstancesResponseBodyRCInstances setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeRCInstancesResponseBodyRCInstances setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public DescribeRCInstancesResponseBodyRCInstances setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeRCInstancesResponseBodyRCInstances setDeploymentSetId(String deploymentSetId) {
            this.deploymentSetId = deploymentSetId;
            return this;
        }
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        public DescribeRCInstancesResponseBodyRCInstances setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRCInstancesResponseBodyRCInstances setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeRCInstancesResponseBodyRCInstances setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeRCInstancesResponseBodyRCInstances setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public DescribeRCInstancesResponseBodyRCInstances setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeRCInstancesResponseBodyRCInstances setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeRCInstancesResponseBodyRCInstances setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeRCInstancesResponseBodyRCInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRCInstancesResponseBodyRCInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeRCInstancesResponseBodyRCInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeRCInstancesResponseBodyRCInstances setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeRCInstancesResponseBodyRCInstances setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeRCInstancesResponseBodyRCInstances setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeRCInstancesResponseBodyRCInstances setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribeRCInstancesResponseBodyRCInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRCInstancesResponseBodyRCInstances setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeRCInstancesResponseBodyRCInstances setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public DescribeRCInstancesResponseBodyRCInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCInstancesResponseBodyRCInstances setTagResources(java.util.List<DescribeRCInstancesResponseBodyRCInstancesTagResources> tagResources) {
            this.tagResources = tagResources;
            return this;
        }
        public java.util.List<DescribeRCInstancesResponseBodyRCInstancesTagResources> getTagResources() {
            return this.tagResources;
        }

        public DescribeRCInstancesResponseBodyRCInstances setTags(java.util.List<DescribeRCInstancesResponseBodyRCInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeRCInstancesResponseBodyRCInstancesTags> getTags() {
            return this.tags;
        }

        public DescribeRCInstancesResponseBodyRCInstances setVpcAttributes(DescribeRCInstancesResponseBodyRCInstancesVpcAttributes vpcAttributes) {
            this.vpcAttributes = vpcAttributes;
            return this;
        }
        public DescribeRCInstancesResponseBodyRCInstancesVpcAttributes getVpcAttributes() {
            return this.vpcAttributes;
        }

        public DescribeRCInstancesResponseBodyRCInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeRCInstancesResponseBodyRCInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
