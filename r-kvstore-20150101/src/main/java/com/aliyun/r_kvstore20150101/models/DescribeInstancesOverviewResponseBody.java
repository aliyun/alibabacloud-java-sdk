// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstancesOverviewResponseBody extends TeaModel {
    /**
     * <p>An array of instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesOverviewResponseBodyInstances> instances;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1E83311F-0EE4-4922-A3BF-730B312B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancesOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesOverviewResponseBody self = new DescribeInstancesOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesOverviewResponseBody setInstances(java.util.List<DescribeInstancesOverviewResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesOverviewResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstancesOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesOverviewResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesOverviewResponseBodyInstances extends TeaModel {
        /**
         * <p>The architecture of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cluster</strong>: cluster architecture</li>
         * <li><strong>standard</strong>: standard architecture</li>
         * <li><strong>rwsplit</strong>: read/write splitting architecture</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("ArchitectureType")
        public String architectureType;

        /**
         * <p>The storage capacity of the instance. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The internal endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****.redis.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-11-07T08:49:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the subscription instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-13T16:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The database engine version of the instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The ID of the distributed instance.</p>
         * <blockquote>
         * <p>This parameter is returned only when the instance is a child instance of a distributed instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gr-bp14rkqrhac****</p>
         */
        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        /**
         * <p>The instance type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>redis.logic.sharding.2g.2db.0rodb.4proxy.default</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>apitest</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The instance is normal.</li>
         * <li><strong>Creating</strong>: The instance is being created.</li>
         * <li><strong>Changing</strong>: The configurations of the instance are being changed.</li>
         * <li><strong>Inactive</strong>: The instance is disabled.</li>
         * <li><strong>Flushing</strong>: The instance is being released.</li>
         * <li><strong>Released</strong>: The instance is released.</li>
         * <li><strong>Transforming</strong>: The billing method of the instance is being changed.</li>
         * <li><strong>Unavailable</strong>: The instance is unavailable.</li>
         * <li><strong>Error</strong>: The instance failed to be created.</li>
         * <li><strong>Migrating</strong>: The instance is being migrated.</li>
         * <li><strong>BackupRecovering</strong>: The instance is being restored from a backup.</li>
         * <li><strong>MinorVersionUpgrading</strong>: The minor version of the instance is being updated.</li>
         * <li><strong>NetworkModifying</strong>: The network type of the instance is being changed.</li>
         * <li><strong>SSLModifying</strong>: The SSL certificate of the instance is being changed.</li>
         * <li><strong>MajorVersionUpgrading</strong>: The major version of the instance is being upgraded. The instance remains accessible during the upgrade.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The category of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Tair</strong></li>
         * <li><strong>Redis</strong></li>
         * <li><strong>Memcache</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>CLASSIC</strong>: classic network</li>
         * <li><strong>VPC</strong>: VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLASSIC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The private IP address of the instance.</p>
         * <blockquote>
         * <p>This parameter is not returned when the instance is deployed in the classic network.</p>
         * </blockquote>
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
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyiu4ekp****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Instance\&quot;s secondary zone id.</p>
         * <blockquote>
         * <p>This parameter is only returned when the instance has a secondary zone ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        /**
         * <p>The ID of the vSwitch to which the instance is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e7clcw529l773d****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1nme44gek34slfc****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeInstancesOverviewResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesOverviewResponseBodyInstances self = new DescribeInstancesOverviewResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesOverviewResponseBodyInstances setArchitectureType(String architectureType) {
            this.architectureType = architectureType;
            return this;
        }
        public String getArchitectureType() {
            return this.architectureType;
        }

        public DescribeInstancesOverviewResponseBodyInstances setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeInstancesOverviewResponseBodyInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeInstancesOverviewResponseBodyInstances setConnectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }
        public String getConnectionDomain() {
            return this.connectionDomain;
        }

        public DescribeInstancesOverviewResponseBodyInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstancesOverviewResponseBodyInstances setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInstancesOverviewResponseBodyInstances setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeInstancesOverviewResponseBodyInstances setGlobalInstanceId(String globalInstanceId) {
            this.globalInstanceId = globalInstanceId;
            return this;
        }
        public String getGlobalInstanceId() {
            return this.globalInstanceId;
        }

        public DescribeInstancesOverviewResponseBodyInstances setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeInstancesOverviewResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesOverviewResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstancesOverviewResponseBodyInstances setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstancesOverviewResponseBodyInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstancesOverviewResponseBodyInstances setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeInstancesOverviewResponseBodyInstances setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeInstancesOverviewResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstancesOverviewResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeInstancesOverviewResponseBodyInstances setSecondaryZoneId(String secondaryZoneId) {
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }
        public String getSecondaryZoneId() {
            return this.secondaryZoneId;
        }

        public DescribeInstancesOverviewResponseBodyInstances setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeInstancesOverviewResponseBodyInstances setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstancesOverviewResponseBodyInstances setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
