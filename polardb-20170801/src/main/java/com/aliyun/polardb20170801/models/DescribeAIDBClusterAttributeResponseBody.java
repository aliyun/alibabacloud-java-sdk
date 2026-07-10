// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li>vnode: ACK-managed</li>
     * <li>container: loginable container</li>
     * <li>maas: model service</li>
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
     * <p>The cluster creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-14T05:58:42Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The cluster description. Fuzzy match is supported.</p>
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
     * <p>The cluster status. Valid values:</p>
     * <ul>
     * <li><strong>Creating</strong>: being created</li>
     * <li><strong>Running</strong>: running</li>
     * <li><strong>Deleting</strong>: being released</li>
     * <li><strong>DBNodeCreating</strong>: adding a node</li>
     * <li><strong>DBNodeDeleting</strong>: deleting a node</li>
     * <li><strong>ClassChanging</strong>: changing node specifications </li>
     * <li><strong>Deleted</strong>: released</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    /**
     * <p>The node details.</p>
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
     * <p>The list of network connection addresses of the instance.</p>
     */
    @NameInMap("EndpointList")
    public java.util.List<DescribeAIDBClusterAttributeResponseBodyEndpointList> endpointList;

    /**
     * <p>The cluster expiration time.</p>
     * <blockquote>
     * <p>This parameter returns a value only for clusters whose billing method is <strong>Prepaid</strong> (subscription). An empty value is returned for <strong>Postpaid</strong> (pay-as-you-go) clusters.</p>
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

    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The internal IP address.</p>
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
     * <p>The instance lock mode. The value <strong>lock</strong> indicates that the instance is automatically expired or has an overdue payment.</p>
     * 
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <p>The maximum number of requests per minute.</p>
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
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The architecture type. Valid values:</p>
     * <ul>
     * <li>container: AI container</li>
     * <li>ainode: AI node</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>container</p>
     */
    @NameInMap("RunType")
    public String runType;

    /**
     * <p>Valid values for Enterprise Edition storage type:</p>
     * <ul>
     * <li><strong>PSL5</strong></li>
     * <li><strong>PSL4</strong></li>
     * </ul>
     * <p>Valid values for Standard Edition storage type:</p>
     * <ul>
     * <li><strong>ESSDPL0</strong></li>
     * <li><strong>ESSDPL1</strong></li>
     * <li><strong>ESSDPL2</strong></li>
     * <li><strong>ESSDPL3</strong></li>
     * <li><strong>ESSDAUTOPL</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>essdpl1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("TimeSlicesInfo")
    public DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfo timeSlicesInfo;

    @NameInMap("TimeSlicesType")
    public String timeSlicesType;

    /**
     * <p>The VPC ID specified for the zone switchover.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*******************</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * <blockquote>
     * <p>If VPCId is specified, VSwitchId is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VnodeKubernetesConfig")
    public DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfig vnodeKubernetesConfig;

    /**
     * <p>The list of data cloud disks.</p>
     */
    @NameInMap("Volumes")
    public java.util.List<DescribeAIDBClusterAttributeResponseBodyVolumes> volumes;

    /**
     * <p>The zone ID of the PolarDB cluster node.</p>
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

    public DescribeAIDBClusterAttributeResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
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

    public DescribeAIDBClusterAttributeResponseBody setTimeSlicesInfo(DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfo timeSlicesInfo) {
        this.timeSlicesInfo = timeSlicesInfo;
        return this;
    }
    public DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfo getTimeSlicesInfo() {
        return this.timeSlicesInfo;
    }

    public DescribeAIDBClusterAttributeResponseBody setTimeSlicesType(String timeSlicesType) {
        this.timeSlicesType = timeSlicesType;
        return this;
    }
    public String getTimeSlicesType() {
        return this.timeSlicesType;
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

    public DescribeAIDBClusterAttributeResponseBody setVnodeKubernetesConfig(DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfig vnodeKubernetesConfig) {
        this.vnodeKubernetesConfig = vnodeKubernetesConfig;
        return this;
    }
    public DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfig getVnodeKubernetesConfig() {
        return this.vnodeKubernetesConfig;
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
         * <p>The actual mount path.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/CrowdStrike</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The cloud disk name.</p>
         * 
         * <strong>example:</strong>
         * <p>jueming</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The storage size.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("SizeGB")
        public String sizeGB;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarFs</p>
         */
        @NameInMap("StorageCategory")
        public String storageCategory;

        /**
         * <p>The storage class.</p>
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
         * <p>The list of data cloud disks.</p>
         */
        @NameInMap("ChildVolumes")
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes> childVolumes;

        /**
         * <p>The number of CPU cores of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuCores")
        public String cpuCores;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The cluster specifications.</p>
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
         * <p>The node status. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: being created </li>
         * <li><strong>Running</strong>: running </li>
         * <li><strong>Deleting</strong>: being deleted  </li>
         * <li><strong>Rebooting</strong>: being restarted  </li>
         * <li><strong>DBNodeCreating</strong>: adding a node  </li>
         * <li><strong>DBNodeDeleting</strong>: deleting a node </li>
         * <li><strong>ClassChanging</strong>: changing node specifications  </li>
         * <li><strong>MinorVersionUpgrading</strong>: upgrading the minor version</li>
         * <li><strong>Maintaining</strong>: under maintenance  </li>
         * <li><strong>Switching</strong>: being switched</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <p>The number of GPU cards.</p>
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
         * <p>The memory size of the node. Unit: MB.</p>
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
         * <p>The database connection address.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**********.rwlb.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The network type of the connection string. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong>: public endpoint</li>
         * <li><strong>Private</strong>: private endpoint</li>
         * <li><strong>Inner</strong>: private endpoint (classic network)</li>
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
         * <p>The list of network information of the instance.</p>
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

    public static class DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfoTimeSlices extends TeaModel {
        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("EndTime")
        public String endTime;

        public static DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfoTimeSlices build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfoTimeSlices self = new DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfoTimeSlices();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfoTimeSlices setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfoTimeSlices setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfo extends TeaModel {
        @NameInMap("TimeSlices")
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfoTimeSlices> timeSlices;

        public static DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfo self = new DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfo setTimeSlices(java.util.List<DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfoTimeSlices> timeSlices) {
            this.timeSlices = timeSlices;
            return this;
        }
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyTimeSlicesInfoTimeSlices> getTimeSlices() {
            return this.timeSlices;
        }

    }

    public static class DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigLabels self = new DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigLabels();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigTaints extends TeaModel {
        @NameInMap("Effect")
        public String effect;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigTaints build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigTaints self = new DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigTaints();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigTaints setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigTaints setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigTaints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfig extends TeaModel {
        @NameInMap("Labels")
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigLabels> labels;

        @NameInMap("Taints")
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigTaints> taints;

        public static DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfig self = new DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfig setLabels(java.util.List<DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigLabels> getLabels() {
            return this.labels;
        }

        public DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfig setTaints(java.util.List<DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigTaints> taints) {
            this.taints = taints;
            return this;
        }
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyVnodeKubernetesConfigTaints> getTaints() {
            return this.taints;
        }

    }

    public static class DescribeAIDBClusterAttributeResponseBodyVolumes extends TeaModel {
        /**
         * <p>The mount path inside the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/var/run/secrets/kubernetes.io/serviceaccount</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The cloud disk name.</p>
         * 
         * <strong>example:</strong>
         * <p>jueming</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The storage size.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("SizeGB")
        public String sizeGB;

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("StorageCategory")
        public String storageCategory;

        /**
         * <p>The storage class.</p>
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
