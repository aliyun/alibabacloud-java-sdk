// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>vnode</p>
     */
    @NameInMap("AiNodeType")
    public String aiNodeType;

    /**
     * <strong>example:</strong>
     * <p>2020-08-14T05:58:42Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    @NameInMap("DBNodes")
    public java.util.List<DescribeAIDBClusterAttributeResponseBodyDBNodes> DBNodes;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <strong>example:</strong>
     * <p>sg-xxxxxx</p>
     */
    @NameInMap("EcsSecurityGroupId")
    public String ecsSecurityGroupId;

    @NameInMap("EndpointList")
    public java.util.List<DescribeAIDBClusterAttributeResponseBodyEndpointList> endpointList;

    /**
     * <strong>example:</strong>
     * <p>2020-11-14T16:00:00Z</p>
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
     * <p>10.<em>.</em>.72</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <strong>example:</strong>
     * <p>pkv-xxxxx</p>
     */
    @NameInMap("KVCacheInstanceId")
    public String KVCacheInstanceId;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("KubeClusterId")
    public String kubeClusterId;

    /**
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxQPM")
    public String maxQPM;

    /**
     * <strong>example:</strong>
     * <p>Qwen3-Embedding-8B</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("ModelType")
    public String modelType;

    /**
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    @NameInMap("PublicIp")
    public String publicIp;

    /**
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
     * <strong>example:</strong>
     * <p>container</p>
     */
    @NameInMap("RunType")
    public String runType;

    /**
     * <strong>example:</strong>
     * <p>essdpl1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <strong>example:</strong>
     * <p>vpc-*******************</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <strong>example:</strong>
     * <p>vsw-*********************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("Volumes")
    public java.util.List<DescribeAIDBClusterAttributeResponseBodyVolumes> volumes;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
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
         * <strong>example:</strong>
         * <p>/tmp/CrowdStrike</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <strong>example:</strong>
         * <p>jueming</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("SizeGB")
        public String sizeGB;

        /**
         * <strong>example:</strong>
         * <p>PolarFs</p>
         */
        @NameInMap("StorageCategory")
        public String storageCategory;

        /**
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
        @NameInMap("ChildVolumes")
        public java.util.List<DescribeAIDBClusterAttributeResponseBodyDBNodesChildVolumes> childVolumes;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CpuCores")
        public String cpuCores;

        /**
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>polar.pg.g8.8xlarge.gu30</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBNodeDescription")
        public String DBNodeDescription;

        /**
         * <strong>example:</strong>
         * <p>pi-****************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <strong>example:</strong>
         * <p>10.*.*12</p>
         */
        @NameInMap("LinkIP")
        public String linkIP;

        /**
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("MemorySize")
        public String memorySize;

        /**
         * <strong>example:</strong>
         * <p>101.101.101.101</p>
         */
        @NameInMap("PublicIp")
        public String publicIp;

        /**
         * <strong>example:</strong>
         * <p>vn-***************</p>
         */
        @NameInMap("VNodeId")
        public String VNodeId;

        /**
         * <strong>example:</strong>
         * <p>vpc-*******************</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <strong>example:</strong>
         * <p>vsw-*********************</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
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
         * <strong>example:</strong>
         * <p>pc-**********.rwlb.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>Public</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
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
         * <strong>example:</strong>
         * <p>/var/run/secrets/kubernetes.io/serviceaccount</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <strong>example:</strong>
         * <p>jueming</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("SizeGB")
        public String sizeGB;

        /**
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("StorageCategory")
        public String storageCategory;

        /**
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
