// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public java.util.List<DescribeNodeGroupsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>F285E0EC-E928-5E0B-B2C3-7F3FE42F2BE5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeNodeGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeGroupsResponseBody self = new DescribeNodeGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNodeGroupsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeNodeGroupsResponseBody setData(java.util.List<DescribeNodeGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeNodeGroupsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeNodeGroupsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeNodeGroupsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeNodeGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeNodeGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNodeGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeNodeGroupsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeNodeGroupsResponseBodyDataNodeInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-e1733d44-0</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static DescribeNodeGroupsResponseBodyDataNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeGroupsResponseBodyDataNodeInfo self = new DescribeNodeGroupsResponseBodyDataNodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeNodeGroupsResponseBodyDataNodeInfo setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class DescribeNodeGroupsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OVERDUE</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <strong>example:</strong>
         * <p>onEci</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <strong>example:</strong>
         * <p>c-96f3bc7f04b2****</p>
         */
        @NameInMap("BillingInstanceId")
        public String billingInstanceId;

        /**
         * <strong>example:</strong>
         * <p>emapreduce_starrockspost_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>FE</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultGroup")
        public Boolean defaultGroup;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DiskNumber")
        public Integer diskNumber;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ElasticNodeNumber")
        public Integer elasticNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnablePublicNetwork")
        public Boolean enablePublicNetwork;

        /**
         * <strong>example:</strong>
         * <p>be-c-79b0bb9f58ef****-internal.starrocks.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>8030</p>
         */
        @NameInMap("HttpPort")
        public Integer httpPort;

        /**
         * <strong>example:</strong>
         * <p>c-96f3bc7f04b2****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>local_ssd_4_4xlarge</p>
         */
        @NameInMap("LocalStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MemoryCpuRatio")
        public Integer memoryCpuRatio;

        /**
         * <strong>example:</strong>
         * <p>ng-5e2ba600fee3****</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <strong>example:</strong>
         * <p>ng_1</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        @NameInMap("NodeInfo")
        public java.util.List<DescribeNodeGroupsResponseBodyDataNodeInfo> nodeInfo;

        /**
         * <strong>example:</strong>
         * <p>prePaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>fe-c-79b0bb9f58ef****.starrocks.aliyuncs.com</p>
         */
        @NameInMap("PublicAddress")
        public String publicAddress;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ResidentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("RunningTime")
        public Long runningTime;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SpecType")
        public String specType;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("StoragePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("StorageSize")
        public Integer storageSize;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TargetElasticNodeNumber")
        public Integer targetElasticNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeNodeGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeGroupsResponseBodyData self = new DescribeNodeGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNodeGroupsResponseBodyData setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeNodeGroupsResponseBodyData setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeNodeGroupsResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public DescribeNodeGroupsResponseBodyData setBillingInstanceId(String billingInstanceId) {
            this.billingInstanceId = billingInstanceId;
            return this;
        }
        public String getBillingInstanceId() {
            return this.billingInstanceId;
        }

        public DescribeNodeGroupsResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeNodeGroupsResponseBodyData setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeNodeGroupsResponseBodyData setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public DescribeNodeGroupsResponseBodyData setDefaultGroup(Boolean defaultGroup) {
            this.defaultGroup = defaultGroup;
            return this;
        }
        public Boolean getDefaultGroup() {
            return this.defaultGroup;
        }

        public DescribeNodeGroupsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNodeGroupsResponseBodyData setDiskNumber(Integer diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }
        public Integer getDiskNumber() {
            return this.diskNumber;
        }

        public DescribeNodeGroupsResponseBodyData setElasticNodeNumber(Integer elasticNodeNumber) {
            this.elasticNodeNumber = elasticNodeNumber;
            return this;
        }
        public Integer getElasticNodeNumber() {
            return this.elasticNodeNumber;
        }

        public DescribeNodeGroupsResponseBodyData setEnablePublicNetwork(Boolean enablePublicNetwork) {
            this.enablePublicNetwork = enablePublicNetwork;
            return this;
        }
        public Boolean getEnablePublicNetwork() {
            return this.enablePublicNetwork;
        }

        public DescribeNodeGroupsResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeNodeGroupsResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeNodeGroupsResponseBodyData setHttpPort(Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public Integer getHttpPort() {
            return this.httpPort;
        }

        public DescribeNodeGroupsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNodeGroupsResponseBodyData setLocalStorageInstanceType(String localStorageInstanceType) {
            this.localStorageInstanceType = localStorageInstanceType;
            return this;
        }
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        public DescribeNodeGroupsResponseBodyData setMemoryCpuRatio(Integer memoryCpuRatio) {
            this.memoryCpuRatio = memoryCpuRatio;
            return this;
        }
        public Integer getMemoryCpuRatio() {
            return this.memoryCpuRatio;
        }

        public DescribeNodeGroupsResponseBodyData setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        public DescribeNodeGroupsResponseBodyData setNodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        public DescribeNodeGroupsResponseBodyData setNodeInfo(java.util.List<DescribeNodeGroupsResponseBodyDataNodeInfo> nodeInfo) {
            this.nodeInfo = nodeInfo;
            return this;
        }
        public java.util.List<DescribeNodeGroupsResponseBodyDataNodeInfo> getNodeInfo() {
            return this.nodeInfo;
        }

        public DescribeNodeGroupsResponseBodyData setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeNodeGroupsResponseBodyData setPublicAddress(String publicAddress) {
            this.publicAddress = publicAddress;
            return this;
        }
        public String getPublicAddress() {
            return this.publicAddress;
        }

        public DescribeNodeGroupsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNodeGroupsResponseBodyData setResidentNodeNumber(Integer residentNodeNumber) {
            this.residentNodeNumber = residentNodeNumber;
            return this;
        }
        public Integer getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        public DescribeNodeGroupsResponseBodyData setRunningTime(Long runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Long getRunningTime() {
            return this.runningTime;
        }

        public DescribeNodeGroupsResponseBodyData setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public DescribeNodeGroupsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNodeGroupsResponseBodyData setStoragePerformanceLevel(String storagePerformanceLevel) {
            this.storagePerformanceLevel = storagePerformanceLevel;
            return this;
        }
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        public DescribeNodeGroupsResponseBodyData setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

        public DescribeNodeGroupsResponseBodyData setTargetElasticNodeNumber(Integer targetElasticNodeNumber) {
            this.targetElasticNodeNumber = targetElasticNodeNumber;
            return this;
        }
        public Integer getTargetElasticNodeNumber() {
            return this.targetElasticNodeNumber;
        }

        public DescribeNodeGroupsResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
