// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><p><strong>vnode</strong>: The node is managed by ACK.</p>
     * </li>
     * <li><p><strong>container</strong>: A container that you can log on to.</p>
     * </li>
     * <li><p><strong>maas</strong>: Model-as-a-Service (MaaS).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vnode</p>
     */
    @NameInMap("AiNodeType")
    public String aiNodeType;

    /**
     * <p>The API key.</p>
     * 
     * <strong>example:</strong>
     * <p>x********</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The time when the cluster was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-14T05:58:42Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The description of the cluster. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The status of the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>Creating</strong>: The cluster is being created.</p>
     * </li>
     * <li><p><strong>Running</strong>: The cluster is running.</p>
     * </li>
     * <li><p><strong>Deleting</strong>: The cluster is being deleted.</p>
     * </li>
     * <li><p><strong>DBNodeCreating</strong>: Nodes are being added.</p>
     * </li>
     * <li><p><strong>DBNodeDeleting</strong>: Nodes are being deleted.</p>
     * </li>
     * <li><p><strong>ClassChanging</strong>: The node specifications are being changed.</p>
     * </li>
     * <li><p><strong>Deleted</strong>: The cluster is deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    /**
     * <p>The details of the nodes.</p>
     */
    @NameInMap("DBNodes")
    public java.util.List<DescribeAIDBClusterAttributeResponseBodyDBNodes> DBNodes;

    /**
     * <p>The cluster version. Valid values:</p>
     * <p><strong>1.0</strong></p>
     * <p><strong>2.0</strong></p>
     * <p><strong>3.0</strong></p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-xxxxxx</p>
     */
    @NameInMap("EcsSecurityGroupId")
    public String ecsSecurityGroupId;

    /**
     * <p>A list of endpoints for the instance.</p>
     */
    @NameInMap("EndpointList")
    public java.util.List<DescribeAIDBClusterAttributeResponseBodyEndpointList> endpointList;

    /**
     * <p>The expiration time of the cluster.</p>
     * <blockquote>
     * <p>This parameter is returned only for <strong>subscription</strong> clusters. For <strong>pay-as-you-go</strong> clusters, an empty string is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-11-14T16:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether the cluster has expired. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public Boolean expired;

    /**
     * <p>The private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.<em>.</em>.72</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>The KVCache instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pkv-xxxxx</p>
     */
    @NameInMap("KVCacheInstanceId")
    public String KVCacheInstanceId;

    /**
     * <p>The ACK cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("KubeClusterId")
    public String kubeClusterId;

    /**
     * <p>The lock mode of the instance. A value of <strong>lock</strong> indicates that the instance is locked due to expiration or an overdue payment.</p>
     * 
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The maximum number of queries per minute.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxQPM")
    public String maxQPM;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-Embedding-8B</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model type.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
     * </li>
     * <li><p><strong>Prepaid</strong>: subscription.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>8.xxx.xxx.xxx</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The architecture type. Valid values:</p>
     * <ul>
     * <li><p><strong>container</strong>: AI container.</p>
     * </li>
     * <li><p><strong>ainode</strong>: AI node.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>container</p>
     */
    @NameInMap("RunType")
    public String runType;

    /**
     * <p>The storage type for Enterprise Edition. Valid values:</p>
     * <ul>
     * <li><p><strong>PSL5</strong></p>
     * </li>
     * <li><p><strong>PSL4</strong></p>
     * </li>
     * </ul>
     * <p>The storage type for Standard Edition. Valid values:</p>
     * <ul>
     * <li><p><strong>ESSDPL0</strong></p>
     * </li>
     * <li><p><strong>ESSDPL1</strong></p>
     * </li>
     * <li><p><strong>ESSDPL2</strong></p>
     * </li>
     * <li><p><strong>ESSDPL3</strong></p>
     * </li>
     * <li><p><strong>ESSDAUTOPL</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>essdpl1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*******************</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * <blockquote>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>A list of data disks.</p>
     */
    @NameInMap("Volumes")
    public java.util.List<DescribeAIDBClusterAttributeResponseBodyVolumes> volumes;

    /**
     * <p>The ID of the zone in which the PolarDB cluster nodes are deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i,cn-hangzhou-g</p>
     */
    @NameInMap("ZoneIds")
    public String zoneIds;

    public static DescribeAIDBClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterAttributeResponseBody self = new DescribeAIDBClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterAttributeResponseBody setAiNodeType(String aiNodeType) {
        this.aiNodeType = aiNodeType;
        return this;
    }
    public String getAiNodeType() {
        return this.aiNodeType;
    }

    public DescribeAIDBClusterAttributeResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DescribeAIDBClusterAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeAIDBClusterAttributeResponseBody setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeAIDBClusterAttributeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAIDBClusterAttributeResponseBody setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeAIDBClusterAttributeResponseBody setDBNodes(java.util.List<DescribeAIDBClusterAttributeResponseBodyDBNodes> DBNodes) {
        this.DBNodes = DBNodes;
        return this;
    }
    public java.util.List<DescribeAIDBClusterAttributeResponseBodyDBNodes> getDBNodes() {
        return this.DBNodes;
    }

    public DescribeAIDBClusterAttributeResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeAIDBClusterAttributeResponseBody setEcsSecurityGroupId(String ecsSecurityGroupId) {
        this.ecsSecurityGroupId = ecsSecurityGroupId;
        return this;
    }
    public String getEcsSecurityGroupId() {
        return this.ecsSecurityGroupId;
    }

    public DescribeAIDBClusterAttributeResponseBody setEndpointList(java.util.List<DescribeAIDBClusterAttributeResponseBodyEndpointList> endpointList) {
        this.endpointList = endpointList;
        return this;
    }
    public java.util.List<DescribeAIDBClusterAttributeResponseBodyEndpointList> getEndpointList() {
        return this.endpointList;
    }

    public DescribeAIDBClusterAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeAIDBClusterAttributeResponseBody setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }
    public Boolean getExpired() {
        return this.expired;
    }

    public DescribeAIDBClusterAttributeResponseBody setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public DescribeAIDBClusterAttributeResponseBody setKVCacheInstanceId(String KVCacheInstanceId) {
        this.KVCacheInstanceId = KVCacheInstanceId;
        return this;
    }
    public String getKVCacheInstanceId() {
        return this.KVCacheInstanceId;
    }

    public DescribeAIDBClusterAttributeResponseBody setKubeClusterId(String kubeClusterId) {
        this.kubeClusterId = kubeClusterId;
        return this;
    }
    public String getKubeClusterId() {
        return this.kubeClusterId;
    }

    public DescribeAIDBClusterAttributeResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeAIDBClusterAttributeResponseBody setMaxQPM(String maxQPM) {
        this.maxQPM = maxQPM;
        return this;
    }
    public String getMaxQPM() {
        return this.maxQPM;
    }

    public DescribeAIDBClusterAttributeResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public DescribeAIDBClusterAttributeResponseBody setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public DescribeAIDBClusterAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeAIDBClusterAttributeResponseBody setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public DescribeAIDBClusterAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAIDBClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAIDBClusterAttributeResponseBody setRunType(String runType) {
        this.runType = runType;
        return this;
    }
    public String getRunType() {
        return this.runType;
    }

    public DescribeAIDBClusterAttributeResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribeAIDBClusterAttributeResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribeAIDBClusterAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeAIDBClusterAttributeResponseBody setVolumes(java.util.List<DescribeAIDBClusterAttributeResponseBodyVolumes> volumes) {
        this.volumes = volumes;
        return this;
    }
    public java.util.List<DescribeAIDBClusterAttributeResponseBodyVolumes> getVolumes() {
        return this.volumes;
    }

    public DescribeAIDBClusterAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DescribeAIDBClusterAttributeResponseBody setZoneIds(String zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static class DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes extends TeaModel {
        /**
         * <p>The mount path.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/CrowdStrike</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The disk name.</p>
         * 
         * <strong>example:</strong>
         * <p>jueming</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the data disk in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("SizeGB")
        public String sizeGB;

        /**
         * <p>The storage category.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarFs</p>
         */
        @NameInMap("StorageCategory")
        public String storageCategory;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes self = new DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes setSizeGB(String sizeGB) {
            this.sizeGB = sizeGB;
            return this;
        }
        public String getSizeGB() {
            return this.sizeGB;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes setStorageCategory(String storageCategory) {
            this.storageCategory = storageCategory;
            return this;
        }
        public String getStorageCategory() {
            return this.storageCategory;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class DescribeAIDBClusterAttributeResponseBodyDBNodes extends TeaModel {
        /**
         * <p>A list of data disks.</p>
         */
        @NameInMap("ChildVolumes")
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes> childVolumes;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuCores")
        public String cpuCores;

        /**
         * <p>The time when the node was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The node specification.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.pg.g8.8xlarge.gu30</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The node description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBNodeDescription")
        public String DBNodeDescription;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-****************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The status of the node. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: The node is being created.</p>
         * </li>
         * <li><p><strong>Running</strong>: The node is running.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The node is being deleted.</p>
         * </li>
         * <li><p><strong>Rebooting</strong>: The node is being rebooted.</p>
         * </li>
         * <li><p><strong>DBNodeCreating</strong>: A node is being added to the cluster.</p>
         * </li>
         * <li><p><strong>DBNodeDeleting</strong>: A node is being deleted from the cluster.</p>
         * </li>
         * <li><p><strong>ClassChanging</strong>: The node specifications are being changed.</p>
         * </li>
         * <li><p><strong>MinorVersionUpgrading</strong>: The minor version is being updated.</p>
         * </li>
         * <li><p><strong>Maintaining</strong>: The node is being maintained.</p>
         * </li>
         * <li><p><strong>Switching</strong>: A failover is in progress.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.*.*12</p>
         */
        @NameInMap("LinkIP")
        public String linkIP;

        /**
         * <p>The memory size in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>101.101.101.101</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <p>The Kubernetes virtual node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vn-***************</p>
         */
        @NameInMap("VNodeId")
        public String VNodeId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*******************</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********************</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-d</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAIDBClusterAttributeResponseBodyDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterAttributeResponseBodyDBNodes self = new DescribeAIDBClusterAttributeResponseBodyDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setChildVolumes(java.util.List<DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes> childVolumes) {
            this.childVolumes = childVolumes;
            return this;
        }
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes> getChildVolumes() {
            return this.childVolumes;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setCpuCores(String cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public String getCpuCores() {
            return this.cpuCores;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setDBNodeDescription(String DBNodeDescription) {
            this.DBNodeDescription = DBNodeDescription;
            return this;
        }
        public String getDBNodeDescription() {
            return this.DBNodeDescription;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setDBNodeStatus(String DBNodeStatus) {
            this.DBNodeStatus = DBNodeStatus;
            return this;
        }
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public String getGPU() {
            return this.GPU;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setLinkIP(String linkIP) {
            this.linkIP = linkIP;
            return this;
        }
        public String getLinkIP() {
            return this.linkIP;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setMemorySize(String memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public String getMemorySize() {
            return this.memorySize;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setVNodeId(String VNodeId) {
            this.VNodeId = VNodeId;
            return this;
        }
        public String getVNodeId() {
            return this.VNodeId;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeAIDBClusterAttributeResponseBodyDBNodes setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeAIDBClusterAttributeResponseBodyEndpointListNetInfoItems extends TeaModel {
        /**
         * <p>The database endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**********.rwlb.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Public</strong>: A public endpoint.</p>
         * </li>
         * <li><p><strong>Private</strong>: A private endpoint.</p>
         * </li>
         * <li><p><strong>Inner</strong>: A private endpoint in a classic network.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public String port;

        public static DescribeAIDBClusterAttributeResponseBodyEndpointListNetInfoItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterAttributeResponseBodyEndpointListNetInfoItems self = new DescribeAIDBClusterAttributeResponseBodyEndpointListNetInfoItems();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterAttributeResponseBodyEndpointListNetInfoItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeAIDBClusterAttributeResponseBodyEndpointListNetInfoItems setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeAIDBClusterAttributeResponseBodyEndpointListNetInfoItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeAIDBClusterAttributeResponseBodyEndpointList extends TeaModel {
        /**
         * <p>A list of network information for the instance.</p>
         */
        @NameInMap("NetInfoItems")
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyEndpointListNetInfoItems> netInfoItems;

        public static DescribeAIDBClusterAttributeResponseBodyEndpointList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterAttributeResponseBodyEndpointList self = new DescribeAIDBClusterAttributeResponseBodyEndpointList();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterAttributeResponseBodyEndpointList setNetInfoItems(java.util.List<DescribeAIDBClusterAttributeResponseBodyEndpointListNetInfoItems> netInfoItems) {
            this.netInfoItems = netInfoItems;
            return this;
        }
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyEndpointListNetInfoItems> getNetInfoItems() {
            return this.netInfoItems;
        }

    }

    public static class DescribeAIDBClusterAttributeResponseBodyVolumes extends TeaModel {
        /**
         * <p>The mount path in the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/var/run/secrets/kubernetes.io/serviceaccount</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The disk name.</p>
         * 
         * <strong>example:</strong>
         * <p>jueming</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The storage size in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("SizeGB")
        public String sizeGB;

        /**
         * <p>The storage category.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("StorageCategory")
        public String storageCategory;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarFs</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeAIDBClusterAttributeResponseBodyVolumes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterAttributeResponseBodyVolumes self = new DescribeAIDBClusterAttributeResponseBodyVolumes();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterAttributeResponseBodyVolumes setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeAIDBClusterAttributeResponseBodyVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAIDBClusterAttributeResponseBodyVolumes setSizeGB(String sizeGB) {
            this.sizeGB = sizeGB;
            return this;
        }
        public String getSizeGB() {
            return this.sizeGB;
        }

        public DescribeAIDBClusterAttributeResponseBodyVolumes setStorageCategory(String storageCategory) {
            this.storageCategory = storageCategory;
            return this;
        }
        public String getStorageCategory() {
            return this.storageCategory;
        }

        public DescribeAIDBClusterAttributeResponseBodyVolumes setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
