// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationAttributeResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The application type.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The CPU architecture. The value is:</p>
     * <ul>
     * <li><code>x86</code></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>x86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    /**
     * <p>Indicates whether SNAT can be disabled.</p>
     */
    @NameInMap("CanDisableSnat")
    public Boolean canDisableSnat;

    /**
     * <p>The child components.</p>
     */
    @NameInMap("Components")
    public java.util.List<DescribeApplicationAttributeResponseBodyComponents> components;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-25T09:37:10Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The ID of the PolarDB instance that the application depends on.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The application description.</p>
     * 
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The application endpoints.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<DescribeApplicationAttributeResponseBodyEndpoints> endpoints;

    /**
     * <p>The expiration time.</p>
     * <p>This parameter is not returned for Postpaid instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-25T09:37:10Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether the application has expired.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public Boolean expired;

    /**
     * <p>Indicates whether the application is the latest version.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    /**
     * <p>The latest version number.</p>
     * 
     * <strong>example:</strong>
     * <p>v2026.3.13-1#20260320</p>
     */
    @NameInMap("LatestVersion")
    public String latestVersion;

    /**
     * <p>The lock mode. Valid values:</p>
     * <ul>
     * <li><p>Unlock: The application is not locked.</p>
     * </li>
     * <li><p>Lock: The application is locked.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The maintenance end time.</p>
     * 
     * <strong>example:</strong>
     * <p>19:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <p>The maintenance start time.</p>
     * 
     * <strong>example:</strong>
     * <p>18:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    /**
     * <p>The attributes of the Mem0 application.</p>
     */
    @NameInMap("MemApplicationAttribute")
    public DescribeApplicationAttributeResponseBodyMemApplicationAttribute memApplicationAttribute;

    /**
     * <p>The minor version number.</p>
     * 
     * <strong>example:</strong>
     * <p>v2026.3.13-1#20260320</p>
     */
    @NameInMap("MinorVersion")
    public String minorVersion;

    /**
     * <p>The ID of the NAT Gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxx</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The attributes of the PolarClaw SaaS application.</p>
     */
    @NameInMap("PolarClawSaaSApplicationAttribute")
    public DescribeApplicationAttributeResponseBodyPolarClawSaaSApplicationAttribute polarClawSaaSApplicationAttribute;

    /**
     * <p>The ID of the PolarFS Cold Storage or PolarFS High-performance instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-**************</p>
     */
    @NameInMap("PolarFSInstanceId")
    public String polarFSInstanceId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The application-level security groups.</p>
     */
    @NameInMap("SecurityGroups")
    public java.util.List<DescribeApplicationAttributeResponseBodySecurityGroups> securityGroups;

    /**
     * <p>The application-level whitelists.</p>
     */
    @NameInMap("SecurityIPArrays")
    public java.util.List<DescribeApplicationAttributeResponseBodySecurityIPArrays> securityIPArrays;

    /**
     * <p>The Serverless type. Valid values:</p>
     * <ul>
     * <li><p>2: Agile</p>
     * </li>
     * <li><p>3: Stable</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <p>The SNAT status.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("SnatStatus")
    public String snatStatus;

    /**
     * <p>The application status. Valid values:</p>
     * <ul>
     * <li><p>Creating: The application is being created.</p>
     * </li>
     * <li><p>Activated: The application is running.</p>
     * </li>
     * <li><p>Maintaining: The application is being maintained.</p>
     * </li>
     * <li><p>ClassChanging: The application configuration is being changed.</p>
     * </li>
     * <li><p>Transing: The application is being migrated.</p>
     * </li>
     * <li><p>MinorVersionUpgrading: The minor version of the application is being upgraded.</p>
     * </li>
     * <li><p>NetCreating: The endpoint is being created.</p>
     * </li>
     * <li><p>NetDeleting: The endpoint is being deleted.</p>
     * </li>
     * <li><p>NetModifying: The endpoint is being modified.</p>
     * </li>
     * <li><p>Restarting: The application is restarting.</p>
     * </li>
     * <li><p>Locking: The application is being locked.</p>
     * </li>
     * <li><p>Locked: The application is locked.</p>
     * </li>
     * <li><p>Unlocking: The application is being unlocked.</p>
     * </li>
     * <li><p>Deleting: The application is being deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Activated</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The details of the storage resources.</p>
     */
    @NameInMap("Storages")
    public java.util.List<DescribeApplicationAttributeResponseBodyStorages> storages;

    /**
     * <p>Indicates whether an upgrade is available.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UpgradeAvailable")
    public String upgradeAvailable;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*******************</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The VSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*******************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The application version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("Version")
    public String version;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-l</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeApplicationAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAttributeResponseBody self = new DescribeApplicationAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAttributeResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationAttributeResponseBody setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public DescribeApplicationAttributeResponseBody setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    public String getArchitecture() {
        return this.architecture;
    }

    public DescribeApplicationAttributeResponseBody setCanDisableSnat(Boolean canDisableSnat) {
        this.canDisableSnat = canDisableSnat;
        return this;
    }
    public Boolean getCanDisableSnat() {
        return this.canDisableSnat;
    }

    public DescribeApplicationAttributeResponseBody setComponents(java.util.List<DescribeApplicationAttributeResponseBodyComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<DescribeApplicationAttributeResponseBodyComponents> getComponents() {
        return this.components;
    }

    public DescribeApplicationAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeApplicationAttributeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeApplicationAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApplicationAttributeResponseBody setEndpoints(java.util.List<DescribeApplicationAttributeResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<DescribeApplicationAttributeResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public DescribeApplicationAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeApplicationAttributeResponseBody setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public DescribeApplicationAttributeResponseBody setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeApplicationAttributeResponseBody setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public String getLatestVersion() {
        return this.latestVersion;
    }

    public DescribeApplicationAttributeResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeApplicationAttributeResponseBody setMaintainEndTime(String maintainEndTime) {
        this.maintainEndTime = maintainEndTime;
        return this;
    }
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    public DescribeApplicationAttributeResponseBody setMaintainStartTime(String maintainStartTime) {
        this.maintainStartTime = maintainStartTime;
        return this;
    }
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    public DescribeApplicationAttributeResponseBody setMemApplicationAttribute(DescribeApplicationAttributeResponseBodyMemApplicationAttribute memApplicationAttribute) {
        this.memApplicationAttribute = memApplicationAttribute;
        return this;
    }
    public DescribeApplicationAttributeResponseBodyMemApplicationAttribute getMemApplicationAttribute() {
        return this.memApplicationAttribute;
    }

    public DescribeApplicationAttributeResponseBody setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public String getMinorVersion() {
        return this.minorVersion;
    }

    public DescribeApplicationAttributeResponseBody setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeApplicationAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeApplicationAttributeResponseBody setPolarClawSaaSApplicationAttribute(DescribeApplicationAttributeResponseBodyPolarClawSaaSApplicationAttribute polarClawSaaSApplicationAttribute) {
        this.polarClawSaaSApplicationAttribute = polarClawSaaSApplicationAttribute;
        return this;
    }
    public DescribeApplicationAttributeResponseBodyPolarClawSaaSApplicationAttribute getPolarClawSaaSApplicationAttribute() {
        return this.polarClawSaaSApplicationAttribute;
    }

    public DescribeApplicationAttributeResponseBody setPolarFSInstanceId(String polarFSInstanceId) {
        this.polarFSInstanceId = polarFSInstanceId;
        return this;
    }
    public String getPolarFSInstanceId() {
        return this.polarFSInstanceId;
    }

    public DescribeApplicationAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApplicationAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationAttributeResponseBody setSecurityGroups(java.util.List<DescribeApplicationAttributeResponseBodySecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<DescribeApplicationAttributeResponseBodySecurityGroups> getSecurityGroups() {
        return this.securityGroups;
    }

    public DescribeApplicationAttributeResponseBody setSecurityIPArrays(java.util.List<DescribeApplicationAttributeResponseBodySecurityIPArrays> securityIPArrays) {
        this.securityIPArrays = securityIPArrays;
        return this;
    }
    public java.util.List<DescribeApplicationAttributeResponseBodySecurityIPArrays> getSecurityIPArrays() {
        return this.securityIPArrays;
    }

    public DescribeApplicationAttributeResponseBody setServerlessType(String serverlessType) {
        this.serverlessType = serverlessType;
        return this;
    }
    public String getServerlessType() {
        return this.serverlessType;
    }

    public DescribeApplicationAttributeResponseBody setSnatStatus(String snatStatus) {
        this.snatStatus = snatStatus;
        return this;
    }
    public String getSnatStatus() {
        return this.snatStatus;
    }

    public DescribeApplicationAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeApplicationAttributeResponseBody setStorages(java.util.List<DescribeApplicationAttributeResponseBodyStorages> storages) {
        this.storages = storages;
        return this;
    }
    public java.util.List<DescribeApplicationAttributeResponseBodyStorages> getStorages() {
        return this.storages;
    }

    public DescribeApplicationAttributeResponseBody setUpgradeAvailable(String upgradeAvailable) {
        this.upgradeAvailable = upgradeAvailable;
        return this;
    }
    public String getUpgradeAvailable() {
        return this.upgradeAvailable;
    }

    public DescribeApplicationAttributeResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeApplicationAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeApplicationAttributeResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeApplicationAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeApplicationAttributeResponseBodyComponentsSecurityGroups extends TeaModel {
        /**
         * <p>The network type. The value is:</p>
         * <ul>
         * <li>vpc</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-*******************</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The security group name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyGroupName</p>
         */
        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        public static DescribeApplicationAttributeResponseBodyComponentsSecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAttributeResponseBodyComponentsSecurityGroups self = new DescribeApplicationAttributeResponseBodyComponentsSecurityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAttributeResponseBodyComponentsSecurityGroups setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeApplicationAttributeResponseBodyComponentsSecurityGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApplicationAttributeResponseBodyComponentsSecurityGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeApplicationAttributeResponseBodyComponentsSecurityGroups setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

    }

    public static class DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays extends TeaModel {
        /**
         * <p>The name of the IP address group. The default value is <code>default</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SecurityIPArrayName")
        public String securityIPArrayName;

        /**
         * <p>The tag of the IP address group.</p>
         * 
         * <strong>example:</strong>
         * <p>mytag</p>
         */
        @NameInMap("SecurityIPArrayTag")
        public String securityIPArrayTag;

        /**
         * <p>The whitelisted IP addresses, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The network type of the whitelisted IP addresses. The default value is <code>mix</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>mix</p>
         */
        @NameInMap("SecurityIPNetType")
        public String securityIPNetType;

        /**
         * <p>The IP address type.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("SecurityIPType")
        public String securityIPType;

        public static DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays self = new DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays setSecurityIPArrayName(String securityIPArrayName) {
            this.securityIPArrayName = securityIPArrayName;
            return this;
        }
        public String getSecurityIPArrayName() {
            return this.securityIPArrayName;
        }

        public DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays setSecurityIPArrayTag(String securityIPArrayTag) {
            this.securityIPArrayTag = securityIPArrayTag;
            return this;
        }
        public String getSecurityIPArrayTag() {
            return this.securityIPArrayTag;
        }

        public DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays setSecurityIPNetType(String securityIPNetType) {
            this.securityIPNetType = securityIPNetType;
            return this;
        }
        public String getSecurityIPNetType() {
            return this.securityIPNetType;
        }

        public DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays setSecurityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }
        public String getSecurityIPType() {
            return this.securityIPType;
        }

    }

    public static class DescribeApplicationAttributeResponseBodyComponentsTopology extends TeaModel {
        /**
         * <p>The IDs or component types of the child nodes for this child component.</p>
         */
        @NameInMap("Children")
        public java.util.List<String> children;

        /**
         * <p>The topology layer of the child component.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public String layer;

        /**
         * <p>The IDs or component types of the parent nodes for this child component.</p>
         */
        @NameInMap("Parents")
        public java.util.List<String> parents;

        public static DescribeApplicationAttributeResponseBodyComponentsTopology build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAttributeResponseBodyComponentsTopology self = new DescribeApplicationAttributeResponseBodyComponentsTopology();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAttributeResponseBodyComponentsTopology setChildren(java.util.List<String> children) {
            this.children = children;
            return this;
        }
        public java.util.List<String> getChildren() {
            return this.children;
        }

        public DescribeApplicationAttributeResponseBodyComponentsTopology setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public DescribeApplicationAttributeResponseBodyComponentsTopology setParents(java.util.List<String> parents) {
            this.parents = parents;
            return this;
        }
        public java.util.List<String> getParents() {
            return this.parents;
        }

    }

    public static class DescribeApplicationAttributeResponseBodyComponents extends TeaModel {
        /**
         * <p>The class of the child component.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.app.g2.medium</p>
         */
        @NameInMap("ComponentClass")
        public String componentClass;

        /**
         * <p>The description of the child component\&quot;s class.</p>
         * 
         * <strong>example:</strong>
         * <p>2C4GB</p>
         */
        @NameInMap("ComponentClassDescription")
        public String componentClassDescription;

        /**
         * <p>The child component ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pac-*******************</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <p>The maximum number of replicas for the child component.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentMaxReplica")
        public Long componentMaxReplica;

        /**
         * <p>The number of replicas of the child component.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentReplica")
        public Long componentReplica;

        /**
         * <p>The group name of the child component replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ComponentReplicaGroupName")
        public String componentReplicaGroupName;

        /**
         * <p>The type of the child component.</p>
         * 
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The component-level security groups.</p>
         * <p>This parameter is not returned if the component-level security groups are the same as the application-level security groups.</p>
         */
        @NameInMap("SecurityGroups")
        public java.util.List<DescribeApplicationAttributeResponseBodyComponentsSecurityGroups> securityGroups;

        /**
         * <p>The component-level whitelists.</p>
         * <p>This parameter is not returned if the component-level whitelists are the same as the application-level whitelists.</p>
         */
        @NameInMap("SecurityIPArrays")
        public java.util.List<DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays> securityIPArrays;

        /**
         * <p>The component status. The valid values are the same as those for the application status.</p>
         * 
         * <strong>example:</strong>
         * <p>Activated</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The topology of the child component.</p>
         */
        @NameInMap("Topology")
        public DescribeApplicationAttributeResponseBodyComponentsTopology topology;

        public static DescribeApplicationAttributeResponseBodyComponents build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAttributeResponseBodyComponents self = new DescribeApplicationAttributeResponseBodyComponents();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAttributeResponseBodyComponents setComponentClass(String componentClass) {
            this.componentClass = componentClass;
            return this;
        }
        public String getComponentClass() {
            return this.componentClass;
        }

        public DescribeApplicationAttributeResponseBodyComponents setComponentClassDescription(String componentClassDescription) {
            this.componentClassDescription = componentClassDescription;
            return this;
        }
        public String getComponentClassDescription() {
            return this.componentClassDescription;
        }

        public DescribeApplicationAttributeResponseBodyComponents setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public DescribeApplicationAttributeResponseBodyComponents setComponentMaxReplica(Long componentMaxReplica) {
            this.componentMaxReplica = componentMaxReplica;
            return this;
        }
        public Long getComponentMaxReplica() {
            return this.componentMaxReplica;
        }

        public DescribeApplicationAttributeResponseBodyComponents setComponentReplica(Long componentReplica) {
            this.componentReplica = componentReplica;
            return this;
        }
        public Long getComponentReplica() {
            return this.componentReplica;
        }

        public DescribeApplicationAttributeResponseBodyComponents setComponentReplicaGroupName(String componentReplicaGroupName) {
            this.componentReplicaGroupName = componentReplicaGroupName;
            return this;
        }
        public String getComponentReplicaGroupName() {
            return this.componentReplicaGroupName;
        }

        public DescribeApplicationAttributeResponseBodyComponents setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeApplicationAttributeResponseBodyComponents setSecurityGroups(java.util.List<DescribeApplicationAttributeResponseBodyComponentsSecurityGroups> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public java.util.List<DescribeApplicationAttributeResponseBodyComponentsSecurityGroups> getSecurityGroups() {
            return this.securityGroups;
        }

        public DescribeApplicationAttributeResponseBodyComponents setSecurityIPArrays(java.util.List<DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays> securityIPArrays) {
            this.securityIPArrays = securityIPArrays;
            return this;
        }
        public java.util.List<DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays> getSecurityIPArrays() {
            return this.securityIPArrays;
        }

        public DescribeApplicationAttributeResponseBodyComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeApplicationAttributeResponseBodyComponents setTopology(DescribeApplicationAttributeResponseBodyComponentsTopology topology) {
            this.topology = topology;
            return this;
        }
        public DescribeApplicationAttributeResponseBodyComponentsTopology getTopology() {
            return this.topology;
        }

    }

    public static class DescribeApplicationAttributeResponseBodyEndpoints extends TeaModel {
        /**
         * <p>The endpoint description.</p>
         * 
         * <strong>example:</strong>
         * <p>myendpoint</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.31.95.252</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The endpoint type. Valid values:</p>
         * <ul>
         * <li><p>Private: a VPC endpoint</p>
         * </li>
         * <li><p>Public: a public endpoint</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The port description.</p>
         * 
         * <strong>example:</strong>
         * <p>kong_http</p>
         */
        @NameInMap("PortDescription")
        public String portDescription;

        public static DescribeApplicationAttributeResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAttributeResponseBodyEndpoints self = new DescribeApplicationAttributeResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAttributeResponseBodyEndpoints setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApplicationAttributeResponseBodyEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeApplicationAttributeResponseBodyEndpoints setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeApplicationAttributeResponseBodyEndpoints setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeApplicationAttributeResponseBodyEndpoints setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeApplicationAttributeResponseBodyEndpoints setPortDescription(String portDescription) {
            this.portDescription = portDescription;
            return this;
        }
        public String getPortDescription() {
            return this.portDescription;
        }

    }

    public static class DescribeApplicationAttributeResponseBodyMemApplicationAttribute extends TeaModel {
        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-database-name</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The name of the embedder model.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v4</p>
         */
        @NameInMap("EmbedderModelName")
        public String embedderModelName;

        /**
         * <p>The name of the graph LLM model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        @NameInMap("GraphLlmModelName")
        public String graphLlmModelName;

        /**
         * <p>The name of the LLM model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-max</p>
         */
        @NameInMap("LlmModelName")
        public String llmModelName;

        /**
         * <p>The project name. It corresponds to the database schema where project data is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project-name</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The name of the reranker model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3-rerank</p>
         */
        @NameInMap("RerankerModelName")
        public String rerankerModelName;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>test-user</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static DescribeApplicationAttributeResponseBodyMemApplicationAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAttributeResponseBodyMemApplicationAttribute self = new DescribeApplicationAttributeResponseBodyMemApplicationAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAttributeResponseBodyMemApplicationAttribute setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeApplicationAttributeResponseBodyMemApplicationAttribute setEmbedderModelName(String embedderModelName) {
            this.embedderModelName = embedderModelName;
            return this;
        }
        public String getEmbedderModelName() {
            return this.embedderModelName;
        }

        public DescribeApplicationAttributeResponseBodyMemApplicationAttribute setGraphLlmModelName(String graphLlmModelName) {
            this.graphLlmModelName = graphLlmModelName;
            return this;
        }
        public String getGraphLlmModelName() {
            return this.graphLlmModelName;
        }

        public DescribeApplicationAttributeResponseBodyMemApplicationAttribute setLlmModelName(String llmModelName) {
            this.llmModelName = llmModelName;
            return this;
        }
        public String getLlmModelName() {
            return this.llmModelName;
        }

        public DescribeApplicationAttributeResponseBodyMemApplicationAttribute setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeApplicationAttributeResponseBodyMemApplicationAttribute setRerankerModelName(String rerankerModelName) {
            this.rerankerModelName = rerankerModelName;
            return this;
        }
        public String getRerankerModelName() {
            return this.rerankerModelName;
        }

        public DescribeApplicationAttributeResponseBodyMemApplicationAttribute setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class DescribeApplicationAttributeResponseBodyPolarClawSaaSApplicationAttribute extends TeaModel {
        /**
         * <p>The authentication callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://8.xxx.xxx.xxx.xxx/xxx">http://8.xxx.xxx.xxx.xxx/xxx</a></p>
         */
        @NameInMap("AuthCallbackURL")
        public String authCallbackURL;

        /**
         * <p>The enabled authentication providers.</p>
         */
        @NameInMap("AuthProviders")
        public java.util.List<String> authProviders;

        /**
         * <p>The Supabase cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        @NameInMap("SupabaseClusterId")
        public String supabaseClusterId;

        public static DescribeApplicationAttributeResponseBodyPolarClawSaaSApplicationAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAttributeResponseBodyPolarClawSaaSApplicationAttribute self = new DescribeApplicationAttributeResponseBodyPolarClawSaaSApplicationAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAttributeResponseBodyPolarClawSaaSApplicationAttribute setAuthCallbackURL(String authCallbackURL) {
            this.authCallbackURL = authCallbackURL;
            return this;
        }
        public String getAuthCallbackURL() {
            return this.authCallbackURL;
        }

        public DescribeApplicationAttributeResponseBodyPolarClawSaaSApplicationAttribute setAuthProviders(java.util.List<String> authProviders) {
            this.authProviders = authProviders;
            return this;
        }
        public java.util.List<String> getAuthProviders() {
            return this.authProviders;
        }

        public DescribeApplicationAttributeResponseBodyPolarClawSaaSApplicationAttribute setSupabaseClusterId(String supabaseClusterId) {
            this.supabaseClusterId = supabaseClusterId;
            return this;
        }
        public String getSupabaseClusterId() {
            return this.supabaseClusterId;
        }

    }

    public static class DescribeApplicationAttributeResponseBodySecurityGroups extends TeaModel {
        /**
         * <p>The network type. The value is:</p>
         * <ul>
         * <li>vpc</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-**************</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The security group name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyGroupName</p>
         */
        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        public static DescribeApplicationAttributeResponseBodySecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAttributeResponseBodySecurityGroups self = new DescribeApplicationAttributeResponseBodySecurityGroups();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAttributeResponseBodySecurityGroups setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeApplicationAttributeResponseBodySecurityGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApplicationAttributeResponseBodySecurityGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeApplicationAttributeResponseBodySecurityGroups setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

    }

    public static class DescribeApplicationAttributeResponseBodySecurityIPArrays extends TeaModel {
        /**
         * <p>The name of the IP address group. The default value is <code>default</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SecurityIPArrayName")
        public String securityIPArrayName;

        /**
         * <p>The tag of the IP address group.</p>
         * 
         * <strong>example:</strong>
         * <p>mytag</p>
         */
        @NameInMap("SecurityIPArrayTag")
        public String securityIPArrayTag;

        /**
         * <p>The whitelisted IP addresses, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <p>The network type of the whitelisted IP addresses. The default value is <code>mix</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>mix</p>
         */
        @NameInMap("SecurityIPNetType")
        public String securityIPNetType;

        /**
         * <p>The IP address type.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("SecurityIPType")
        public String securityIPType;

        public static DescribeApplicationAttributeResponseBodySecurityIPArrays build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAttributeResponseBodySecurityIPArrays self = new DescribeApplicationAttributeResponseBodySecurityIPArrays();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAttributeResponseBodySecurityIPArrays setSecurityIPArrayName(String securityIPArrayName) {
            this.securityIPArrayName = securityIPArrayName;
            return this;
        }
        public String getSecurityIPArrayName() {
            return this.securityIPArrayName;
        }

        public DescribeApplicationAttributeResponseBodySecurityIPArrays setSecurityIPArrayTag(String securityIPArrayTag) {
            this.securityIPArrayTag = securityIPArrayTag;
            return this;
        }
        public String getSecurityIPArrayTag() {
            return this.securityIPArrayTag;
        }

        public DescribeApplicationAttributeResponseBodySecurityIPArrays setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        public DescribeApplicationAttributeResponseBodySecurityIPArrays setSecurityIPNetType(String securityIPNetType) {
            this.securityIPNetType = securityIPNetType;
            return this;
        }
        public String getSecurityIPNetType() {
            return this.securityIPNetType;
        }

        public DescribeApplicationAttributeResponseBodySecurityIPArrays setSecurityIPType(String securityIPType) {
            this.securityIPType = securityIPType;
            return this;
        }
        public String getSecurityIPType() {
            return this.securityIPType;
        }

    }

    public static class DescribeApplicationAttributeResponseBodyStorages extends TeaModel {
        /**
         * <p>The storage capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>20Gi</p>
         */
        @NameInMap("StorageCapacity")
        public String storageCapacity;

        /**
         * <p>The storage instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        @NameInMap("StorageInstanceId")
        public String storageInstanceId;

        /**
         * <p>The storage performance level.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("StoragePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>essd</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeApplicationAttributeResponseBodyStorages build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationAttributeResponseBodyStorages self = new DescribeApplicationAttributeResponseBodyStorages();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationAttributeResponseBodyStorages setStorageCapacity(String storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }
        public String getStorageCapacity() {
            return this.storageCapacity;
        }

        public DescribeApplicationAttributeResponseBodyStorages setStorageInstanceId(String storageInstanceId) {
            this.storageInstanceId = storageInstanceId;
            return this;
        }
        public String getStorageInstanceId() {
            return this.storageInstanceId;
        }

        public DescribeApplicationAttributeResponseBodyStorages setStoragePerformanceLevel(String storagePerformanceLevel) {
            this.storagePerformanceLevel = storagePerformanceLevel;
            return this;
        }
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        public DescribeApplicationAttributeResponseBodyStorages setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
