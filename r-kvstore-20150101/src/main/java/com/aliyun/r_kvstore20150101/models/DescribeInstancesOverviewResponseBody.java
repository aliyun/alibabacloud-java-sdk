// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstancesOverviewResponseBody extends TeaModel {
    /**
     * <p>Overview information of the instances.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesOverviewResponseBodyInstances> instances;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances that were queried.</p>
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
         * <br>
         * <p>*   **cluster**: cluster architecture</p>
         * <p>*   **standard**: standard architecture</p>
         * <p>*   **rwsplit**: read/write splitting architecture</p>
         */
        @NameInMap("ArchitectureType")
        public String architectureType;

        /**
         * <p>The storage capacity of the instance. Unit: MB.</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <br>
         * <p>*   **PrePaid**: subscription</p>
         * <p>*   **PostPaid**: pay-as-you-go</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The internal endpoint of the instance.</p>
         */
        @NameInMap("ConnectionDomain")
        public String connectionDomain;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the instance expires if the instance is charged based on the subscription billing method.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The database engine version of the instance. Valid values: **2.8**, **4.0**, and **5.0**.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The ID of the distributed instance to which the instance belongs.</p>
         * <br>
         * <p>>  This parameter is returned only if the instance is a child instance of a distributed instance.</p>
         */
        @NameInMap("GlobalInstanceId")
        public String globalInstanceId;

        /**
         * <p>The instance type.</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The state of the instance. Valid values:</p>
         * <br>
         * <p>* **Normal**: The instance is normal.</p>
         * <p>* **Creating**: The instance is being created.</p>
         * <p>* **Changing**: The configurations of the instance are being changed.</p>
         * <p>* **Inactive**: The instance is disabled.</p>
         * <p>* **Flushing**: The instance is being released.</p>
         * <p>* **Released**: The instance is released.</p>
         * <p>* **Transforming**: The billing method of the instance is changing.</p>
         * <p>* **Unavailable**: The instance is suspended.</p>
         * <p>* **Error**: The instance failed to be created.</p>
         * <p>* **Migrating**: The instance is being migrated.</p>
         * <p>* **BackupRecovering**: The instance is being restored from a backup.</p>
         * <p>* **MinorVersionUpgrading**: The minor version of the instance is being updated.</p>
         * <p>* **NetworkModifying**: The network type of the instance is being changed.</p>
         * <p>* **SSLModifying**: The SSL certificate of the instance is being changed.</p>
         * <p>* **MajorVersionUpgrading**: The major version of the instance is being upgraded. The instance remains available during the upgrade.</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The database engine of the instance. Valid values:</p>
         * <br>
         * <p>*   **Tair**</p>
         * <p>*   **Redis**</p>
         * <p>*   **Memcache**</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <br>
         * <p>*   **CLASSIC**: classic network</p>
         * <p>*   **VPC**: VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The private IP address of the instance.</p>
         * <br>
         * <p>>  This parameter is not returned if the instance is deployed in the classic network.</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SecondaryZoneId")
        public String secondaryZoneId;

        /**
         * <p>The ID of the vSwitch to which the instance is connected.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID of the instance.</p>
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
