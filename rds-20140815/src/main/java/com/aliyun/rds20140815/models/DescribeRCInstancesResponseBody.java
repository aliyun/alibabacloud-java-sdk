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
        /**
         * <p>Resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-t8q22a87745hf8******</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Resource type.  </p>
         * <ul>
         * <li><code>ALIYUN::RDS::INSTANCE</code>: ApsaraDB RDS instance  </li>
         * <li><code>ALIYUN::RDS::CUSTOM</code>: RDS Custom instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::RDS::CUSTOM</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testRC</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>Tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
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
        /**
         * <p>Resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-t8q22a87745hf8******</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Resource type.</p>
         * <ul>
         * <li><code>ALIYUN::RDS::INSTANCE</code>: ApsaraDB RDS instance  </li>
         * <li><code>ALIYUN::RDS::CUSTOM</code>: RDS Custom instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::RDS::CUSTOM</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testRC</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>Tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
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
        /**
         * <p>Reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("NatIpAddress")
        public String natIpAddress;

        /**
         * <p>The private IP addresses.</p>
         */
        @NameInMap("PrivateIpAddress")
        public java.util.List<String> privateIpAddress;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1nb3pv03878tgnj****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6f7l4fg90****</p>
         */
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
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>testrdscustom</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>Number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>Indicates whether the instance can be added to an ACK cluster. When this parameter is set to <strong>1</strong>, the created instance can be added to an ACK cluster by using the <strong>AttachRCInstances</strong> API operation, enabling efficient management of container applications.  </p>
         * <ul>
         * <li><strong>1</strong>: Yes  </li>
         * <li><strong>0</strong> (default): No</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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

        /**
         * <p>The deployment set ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-bp14k1xvolvsy4z3****</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>testHostName</p>
         */
        @NameInMap("EcsHostName")
        public String ecsHostName;

        /**
         * <p>Instance Expiration Time. It is represented in ISO 8601 format using UTC+0 time, with the pattern <code>yyyy-MM-ddTHH:mm:ssZ</code>.  </p>
         * <blockquote>
         * <p>The expiration time displayed in the console is 8 hours later.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-05-02T16:00:00Z</p>
         */
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
         * <p>172.16.XX.XX</p>
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

        /**
         * <p>Image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun_3_x64_20G_alibase_20250117.vhd</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>Billing method. Valid values:  </p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription  </li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
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
         * <p>Instance name</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Instance Type.  </p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2844823.html">RDS Custom Instance Type List</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.x2.xlarge.6cm</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Instance family.  </p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2844823.html">RDS Custom instance type list</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>x.6cm</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>Memory size, in MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>16384</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>File Type. When <strong>rds_vnode</strong> is returned, it indicates that the node is a container node.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_vnode</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <strong>example:</strong>
         * <p>CentOS  7.4 64 位</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>Public IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>121.89.XX.XX</p>
         */
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

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-2vcbcivwfxiozhtp****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>Spot strategy for pay-as-you-go instances. The return value is as follows:  </p>
         * <ul>
         * <li><strong>NoSpot</strong>: Normal pay-as-you-go instance.  </li>
         * <li><strong>SpotAsPriceGo</strong>: System automatically bids based on the current market price.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <strong>example:</strong>
         * <p>2017-12-10T04:04Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

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

        @NameInMap("StoppedMode")
        public String stoppedMode;

        /**
         * <p>The queried instances and tag details.</p>
         */
        @NameInMap("TagResources")
        public java.util.List<DescribeRCInstancesResponseBodyRCInstancesTagResources> tagResources;

        /**
         * <p>Tag Details.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeRCInstancesResponseBodyRCInstancesTags> tags;

        /**
         * <p>The virtual private cloud (VPC) attributes.</p>
         * 
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

        /**
         * <p>Zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRCInstancesResponseBodyRCInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstancesResponseBodyRCInstances self = new DescribeRCInstancesResponseBodyRCInstances();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstancesResponseBodyRCInstances setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
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

        public DescribeRCInstancesResponseBodyRCInstances setEcsHostName(String ecsHostName) {
            this.ecsHostName = ecsHostName;
            return this;
        }
        public String getEcsHostName() {
            return this.ecsHostName;
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

        public DescribeRCInstancesResponseBodyRCInstances setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeRCInstancesResponseBodyRCInstances setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
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

        public DescribeRCInstancesResponseBodyRCInstances setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRCInstancesResponseBodyRCInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCInstancesResponseBodyRCInstances setStoppedMode(String stoppedMode) {
            this.stoppedMode = stoppedMode;
            return this;
        }
        public String getStoppedMode() {
            return this.stoppedMode;
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
