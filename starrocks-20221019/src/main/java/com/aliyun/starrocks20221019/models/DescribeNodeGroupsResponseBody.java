// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeNodeGroupsResponseBody extends TeaModel {
    /**
     * <p>The details of the permission verification failure.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeNodeGroupsResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F285E0EC-E928-5E0B-B2C3-7F3FE42F2BE5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of query results.</p>
     * 
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
         * <p>The node ID.</p>
         * 
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

    public static class DescribeNodeGroupsResponseBodyDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeNodeGroupsResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeNodeGroupsResponseBodyDataTags self = new DescribeNodeGroupsResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeNodeGroupsResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeNodeGroupsResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeNodeGroupsResponseBodyData extends TeaModel {
        /**
         * <p>The account status. Valid values:</p>
         * <ul>
         * <li>NORMAL: The account is in a normal state.</li>
         * <li>OVERDUE: The account has an overdue payment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OVERDUE</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The compute group architecture. Valid values:</p>
         * <ul>
         * <li>onEci: Deployed on Elastic Container Instance (ECI).</li>
         * <li>onECS: Deployed on Elastic Compute Service (ECS).</li>
         * <li>onBareMetal: Deployed on a bare metal resource pool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>onEci</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The creation time of the compute group.</p>
         * 
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <p>The instance ID associated with the bill. For default compute groups (FE compute group and default BE compute group), this value is the instance ID. Otherwise, it is the compute group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-96f3bc7f04b2****</p>
         */
        @NameInMap("BillingInstanceId")
        public String billingInstanceId;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>emapreduce_starrockspost_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The compute group type. Valid values:</p>
         * <ul>
         * <li>FE</li>
         * <li>BE</li>
         * <li>CN</li>
         * <li>OBSERVER</li>
         * <li>AGENT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FE</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <p>The number of CUs. A CU (Compute Unit) is the basic metering unit of the service. 1 CU = 1 CPU core + 4 GiB memory. When SpecType is memory-enhanced instance family, 1 CU = 1 CPU core + 8 GiB memory.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <p>Indicates whether this is the default compute group.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DefaultGroup")
        public Boolean defaultGroup;

        /**
         * <p>The compute group description.</p>
         * 
         * <strong>example:</strong>
         * <p>ETL compute group</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of disks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DiskNumber")
        public Integer diskNumber;

        /**
         * <p>The number of elastic nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ElasticNodeNumber")
        public Integer elasticNodeNumber;

        /**
         * <p>Indicates whether public network access is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnablePublicNetwork")
        public Boolean enablePublicNetwork;

        /**
         * <p>The compute group endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>be-c-79b0bb9f58ef****-internal.starrocks.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The expiration time of the compute group.</p>
         * 
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The HTTP port of the compute group.</p>
         * 
         * <strong>example:</strong>
         * <p>8030</p>
         */
        @NameInMap("HttpPort")
        public Integer httpPort;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-96f3bc7f04b2****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The local SSD instance type of the node group. This value is meaningful only when the deployment is based on ECS instances and SpecType is local SSD or large-scale storage.</p>
         * 
         * <strong>example:</strong>
         * <p>local_ssd_4_4xlarge</p>
         */
        @NameInMap("LocalStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <p>The ratio of memory size to the number of CUs. The value is 8 when SpecType is memory-enhanced instance family, and 4 for other specification types.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("MemoryCpuRatio")
        public Integer memoryCpuRatio;

        /**
         * <p>The compute group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-5e2ba600fee3****</p>
         */
        @NameInMap("NodeGroupId")
        public String nodeGroupId;

        /**
         * <p>The compute group name.</p>
         * 
         * <strong>example:</strong>
         * <p>ng_1</p>
         */
        @NameInMap("NodeGroupName")
        public String nodeGroupName;

        /**
         * <p>The information about nodes in the compute group.</p>
         */
        @NameInMap("NodeInfo")
        public java.util.List<DescribeNodeGroupsResponseBodyDataNodeInfo> nodeInfo;

        /**
         * <p>The billing type:</p>
         * <ol>
         * <li>Subscription (prePaid).</li>
         * <li>Pay-as-you-go (postPaid).</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>prePaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The public network address. This field has a value only when EnablePublicNetwork is set to true.</p>
         * 
         * <strong>example:</strong>
         * <p>fe-c-79b0bb9f58ef****.starrocks.aliyuncs.com</p>
         */
        @NameInMap("PublicAddress")
        public String publicAddress;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ResidentNodeNumber")
        public Integer residentNodeNumber;

        /**
         * <p>The duration that the compute group has been running. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("RunningTime")
        public Long runningTime;

        /**
         * <p>The compute group specification type. Valid values:</p>
         * <ul>
         * <li>standard: Standard.</li>
         * <li>localSSD: Local SSD.</li>
         * <li>bigData: Large-scale storage.</li>
         * <li>ramEnhanced: Memory-enhanced instance family.</li>
         * <li>networkEnhanced: Network-enhanced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SpecType")
        public String specType;

        /**
         * <p>The compute group status. Valid values:</p>
         * <ul>
         * <li>UNPAID: Unpaid.</li>
         * <li>PAID: Paid.</li>
         * <li>CREATING_FAILED: Creation failed.</li>
         * <li>CREATING: Being created.</li>
         * <li>RUNNING: Running.</li>
         * <li>MODIFYING_CONFIG: Configuration being modified.</li>
         * <li>MODIFYING_TIMEZONE: Time zone being modified.</li>
         * <li>ELASTIC_SCALING_OUT: Elastic scale-out in progress.</li>
         * <li>ELASTIC_SCALING_IN: Elastic scale-in in progress.</li>
         * <li>SCALING_OUT: Scale-out in progress.</li>
         * <li>RESTARTING: Restarting.</li>
         * <li>SCALING_IN: Scale-in in progress.</li>
         * <li>SCALING_UP: Upgrading specifications.</li>
         * <li>SCALING_DOWN: Downgrading specifications.</li>
         * <li>UPGRADING: Upgrading.</li>
         * <li>ENABLE_PUBLIC_NETWORK: Enabling public network access.</li>
         * <li>DISABLE_PUBLIC_NETWORK: Disabling public network access.</li>
         * <li>SWITCH_AZ: Switching zone.</li>
         * <li>DISABLE: Disabled.</li>
         * <li>DELETING: Being deleted.</li>
         * <li>DELETED: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The performance level (PL) of the cloud disk. Valid values:</p>
         * <ul>
         * <li>pl0: Maximum random read/write IOPS of 10,000 per disk.</li>
         * <li>pl1: Maximum random read/write IOPS of 50,000 per disk.</li>
         * <li>pl2: Maximum random read/write IOPS of 100,000 per disk.</li>
         * <li>pl3: Maximum random read/write IOPS of 1,000,000 per disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("StoragePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <p>The storage size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("StorageSize")
        public Integer storageSize;

        @NameInMap("Tags")
        public java.util.List<DescribeNodeGroupsResponseBodyDataTags> tags;

        /**
         * <p>The target number of elastic nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TargetElasticNodeNumber")
        public Integer targetElasticNodeNumber;

        /**
         * <p>The zone ID.</p>
         * 
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

        public DescribeNodeGroupsResponseBodyData setTags(java.util.List<DescribeNodeGroupsResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeNodeGroupsResponseBodyDataTags> getTags() {
            return this.tags;
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
