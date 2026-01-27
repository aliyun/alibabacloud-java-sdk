// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <strong>example:</strong>
     * <p>x86</p>
     */
    @NameInMap("Architecture")
    public String architecture;

    @NameInMap("Components")
    public java.util.List<DescribeApplicationAttributeResponseBodyComponents> components;

    /**
     * <strong>example:</strong>
     * <p>2025-03-25T09:37:10Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>myapp</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Endpoints")
    public java.util.List<DescribeApplicationAttributeResponseBodyEndpoints> endpoints;

    /**
     * <strong>example:</strong>
     * <p>2025-06-25T09:37:10Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public Boolean expired;

    /**
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <strong>example:</strong>
     * <p>19:00Z</p>
     */
    @NameInMap("MaintainEndTime")
    public String maintainEndTime;

    /**
     * <strong>example:</strong>
     * <p>18:00Z</p>
     */
    @NameInMap("MaintainStartTime")
    public String maintainStartTime;

    @NameInMap("MemApplicationAttribute")
    public DescribeApplicationAttributeResponseBodyMemApplicationAttribute memApplicationAttribute;

    /**
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>pfs-**************</p>
     */
    @NameInMap("PolarFSInstanceId")
    public String polarFSInstanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityGroups")
    public java.util.List<DescribeApplicationAttributeResponseBodySecurityGroups> securityGroups;

    @NameInMap("SecurityIPArrays")
    public java.util.List<DescribeApplicationAttributeResponseBodySecurityIPArrays> securityIPArrays;

    @NameInMap("ServerlessType")
    public String serverlessType;

    /**
     * <strong>example:</strong>
     * <p>Activated</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UpgradeAvailable")
    public String upgradeAvailable;

    /**
     * <p>VPC ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*******************</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>VSwitch ID</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*******************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("Version")
    public String version;

    /**
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

    public DescribeApplicationAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
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

    public DescribeApplicationAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
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
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>sg-*******************</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
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
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SecurityIPArrayName")
        public String securityIPArrayName;

        /**
         * <strong>example:</strong>
         * <p>mytag</p>
         */
        @NameInMap("SecurityIPArrayTag")
        public String securityIPArrayTag;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <strong>example:</strong>
         * <p>mix</p>
         */
        @NameInMap("SecurityIPNetType")
        public String securityIPNetType;

        /**
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
        @NameInMap("Children")
        public java.util.List<String> children;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Layer")
        public String layer;

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
         * <strong>example:</strong>
         * <p>polar.app.g2.medium</p>
         */
        @NameInMap("ComponentClass")
        public String componentClass;

        /**
         * <strong>example:</strong>
         * <p>2C4GB</p>
         */
        @NameInMap("ComponentClassDescription")
        public String componentClassDescription;

        /**
         * <strong>example:</strong>
         * <p>pac-*******************</p>
         */
        @NameInMap("ComponentId")
        public String componentId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentMaxReplica")
        public Long componentMaxReplica;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ComponentReplica")
        public Long componentReplica;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ComponentReplicaGroupName")
        public String componentReplicaGroupName;

        /**
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        @NameInMap("SecurityGroups")
        public java.util.List<DescribeApplicationAttributeResponseBodyComponentsSecurityGroups> securityGroups;

        @NameInMap("SecurityIPArrays")
        public java.util.List<DescribeApplicationAttributeResponseBodyComponentsSecurityIPArrays> securityIPArrays;

        /**
         * <strong>example:</strong>
         * <p>Activated</p>
         */
        @NameInMap("Status")
        public String status;

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
         * <strong>example:</strong>
         * <p>myendpoint</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <strong>example:</strong>
         * <p>172.31.95.252</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public String port;

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
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("EmbedderModelName")
        public String embedderModelName;

        @NameInMap("LlmModelName")
        public String llmModelName;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("RerankerModelName")
        public String rerankerModelName;

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

    public static class DescribeApplicationAttributeResponseBodySecurityGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>sg-**************</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
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
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("SecurityIPArrayName")
        public String securityIPArrayName;

        /**
         * <strong>example:</strong>
         * <p>mytag</p>
         */
        @NameInMap("SecurityIPArrayTag")
        public String securityIPArrayTag;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        /**
         * <strong>example:</strong>
         * <p>mix</p>
         */
        @NameInMap("SecurityIPNetType")
        public String securityIPNetType;

        /**
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

}
