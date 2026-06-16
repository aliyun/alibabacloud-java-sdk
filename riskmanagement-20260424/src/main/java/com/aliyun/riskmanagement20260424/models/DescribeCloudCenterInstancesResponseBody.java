// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCloudCenterInstancesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudCenterInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudCenterInstancesResponseBody self = new DescribeCloudCenterInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudCenterInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCloudCenterInstancesResponseBody setData(DescribeCloudCenterInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCloudCenterInstancesResponseBodyData getData() {
        return this.data;
    }

    public DescribeCloudCenterInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCloudCenterInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudCenterInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCloudCenterInstancesResponseBodyDataBodyInstances extends TeaModel {
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AssetType")
        public String assetType;

        @NameInMap("AssetTypeName")
        public String assetTypeName;

        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        @NameInMap("AuthVersion")
        public Integer authVersion;

        @NameInMap("AuthVersionName")
        public String authVersionName;

        @NameInMap("Bind")
        public Boolean bind;

        @NameInMap("BindFileProtectType")
        public String bindFileProtectType;

        @NameInMap("ClientStatus")
        public String clientStatus;

        @NameInMap("ClientSubStatus")
        public String clientSubStatus;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("CpuInfo")
        public String cpuInfo;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("ExposedStatus")
        public Integer exposedStatus;

        @NameInMap("Flag")
        public Integer flag;

        @NameInMap("FlagName")
        public String flagName;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupTrace")
        public String groupTrace;

        @NameInMap("HasContainer")
        public String hasContainer;

        @NameInMap("HcStatus")
        public String hcStatus;

        @NameInMap("HealthCheckCount")
        public Integer healthCheckCount;

        @NameInMap("Importance")
        public Integer importance;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("IpListString")
        public String ipListString;

        @NameInMap("Kernel")
        public String kernel;

        @NameInMap("LastLoginTimestamp")
        public Long lastLoginTimestamp;

        @NameInMap("MacListString")
        public String macListString;

        @NameInMap("Mem")
        public String mem;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsName")
        public String osName;

        @NameInMap("PodCount")
        public Integer podCount;

        @NameInMap("PostPaidFlag")
        public Integer postPaidFlag;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("RiskCount")
        public String riskCount;

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("SafeEventCount")
        public String safeEventCount;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TagId")
        public String tagId;

        @NameInMap("TagResources")
        public String tagResources;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Vendor")
        public Integer vendor;

        @NameInMap("VendorName")
        public String vendorName;

        @NameInMap("VendorUid")
        public String vendorUid;

        @NameInMap("VendorUserName")
        public String vendorUserName;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        @NameInMap("VulCount")
        public Integer vulCount;

        @NameInMap("VulStatus")
        public String vulStatus;

        public static DescribeCloudCenterInstancesResponseBodyDataBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudCenterInstancesResponseBodyDataBodyInstances self = new DescribeCloudCenterInstancesResponseBodyDataBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setAssetTypeName(String assetTypeName) {
            this.assetTypeName = assetTypeName;
            return this;
        }
        public String getAssetTypeName() {
            return this.assetTypeName;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setAuthModifyTime(Long authModifyTime) {
            this.authModifyTime = authModifyTime;
            return this;
        }
        public Long getAuthModifyTime() {
            return this.authModifyTime;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setAuthVersion(Integer authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setAuthVersionName(String authVersionName) {
            this.authVersionName = authVersionName;
            return this;
        }
        public String getAuthVersionName() {
            return this.authVersionName;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setBind(Boolean bind) {
            this.bind = bind;
            return this;
        }
        public Boolean getBind() {
            return this.bind;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setBindFileProtectType(String bindFileProtectType) {
            this.bindFileProtectType = bindFileProtectType;
            return this;
        }
        public String getBindFileProtectType() {
            return this.bindFileProtectType;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setClientSubStatus(String clientSubStatus) {
            this.clientSubStatus = clientSubStatus;
            return this;
        }
        public String getClientSubStatus() {
            return this.clientSubStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setCpuInfo(String cpuInfo) {
            this.cpuInfo = cpuInfo;
            return this;
        }
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setExposedStatus(Integer exposedStatus) {
            this.exposedStatus = exposedStatus;
            return this;
        }
        public Integer getExposedStatus() {
            return this.exposedStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setFlagName(String flagName) {
            this.flagName = flagName;
            return this;
        }
        public String getFlagName() {
            return this.flagName;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setGroupTrace(String groupTrace) {
            this.groupTrace = groupTrace;
            return this;
        }
        public String getGroupTrace() {
            return this.groupTrace;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setHasContainer(String hasContainer) {
            this.hasContainer = hasContainer;
            return this;
        }
        public String getHasContainer() {
            return this.hasContainer;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setHcStatus(String hcStatus) {
            this.hcStatus = hcStatus;
            return this;
        }
        public String getHcStatus() {
            return this.hcStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setHealthCheckCount(Integer healthCheckCount) {
            this.healthCheckCount = healthCheckCount;
            return this;
        }
        public Integer getHealthCheckCount() {
            return this.healthCheckCount;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setImportance(Integer importance) {
            this.importance = importance;
            return this;
        }
        public Integer getImportance() {
            return this.importance;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setIpListString(String ipListString) {
            this.ipListString = ipListString;
            return this;
        }
        public String getIpListString() {
            return this.ipListString;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setKernel(String kernel) {
            this.kernel = kernel;
            return this;
        }
        public String getKernel() {
            return this.kernel;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setLastLoginTimestamp(Long lastLoginTimestamp) {
            this.lastLoginTimestamp = lastLoginTimestamp;
            return this;
        }
        public Long getLastLoginTimestamp() {
            return this.lastLoginTimestamp;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setMacListString(String macListString) {
            this.macListString = macListString;
            return this;
        }
        public String getMacListString() {
            return this.macListString;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setMem(String mem) {
            this.mem = mem;
            return this;
        }
        public String getMem() {
            return this.mem;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setPostPaidFlag(Integer postPaidFlag) {
            this.postPaidFlag = postPaidFlag;
            return this;
        }
        public Integer getPostPaidFlag() {
            return this.postPaidFlag;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setRiskCount(String riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public String getRiskCount() {
            return this.riskCount;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setSafeEventCount(String safeEventCount) {
            this.safeEventCount = safeEventCount;
            return this;
        }
        public String getSafeEventCount() {
            return this.safeEventCount;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setTagResources(String tagResources) {
            this.tagResources = tagResources;
            return this;
        }
        public String getTagResources() {
            return this.tagResources;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setVendorUid(String vendorUid) {
            this.vendorUid = vendorUid;
            return this;
        }
        public String getVendorUid() {
            return this.vendorUid;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setVendorUserName(String vendorUserName) {
            this.vendorUserName = vendorUserName;
            return this;
        }
        public String getVendorUserName() {
            return this.vendorUserName;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyInstances setVulStatus(String vulStatus) {
            this.vulStatus = vulStatus;
            return this;
        }
        public String getVulStatus() {
            return this.vulStatus;
        }

    }

    public static class DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo self = new DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeCloudCenterInstancesResponseBodyDataBody extends TeaModel {
        @NameInMap("Instances")
        public java.util.List<DescribeCloudCenterInstancesResponseBodyDataBodyInstances> instances;

        @NameInMap("PageInfo")
        public DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo pageInfo;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Success")
        public Boolean success;

        public static DescribeCloudCenterInstancesResponseBodyDataBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudCenterInstancesResponseBodyDataBody self = new DescribeCloudCenterInstancesResponseBodyDataBody();
            return TeaModel.build(map, self);
        }

        public DescribeCloudCenterInstancesResponseBodyDataBody setInstances(java.util.List<DescribeCloudCenterInstancesResponseBodyDataBodyInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<DescribeCloudCenterInstancesResponseBodyDataBodyInstances> getInstances() {
            return this.instances;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBody setPageInfo(DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeCloudCenterInstancesResponseBodyDataBodyPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeCloudCenterInstancesResponseBodyDataBody setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DescribeCloudCenterInstancesResponseBodyData extends TeaModel {
        @NameInMap("Body")
        public DescribeCloudCenterInstancesResponseBodyDataBody body;

        public static DescribeCloudCenterInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudCenterInstancesResponseBodyData self = new DescribeCloudCenterInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudCenterInstancesResponseBodyData setBody(DescribeCloudCenterInstancesResponseBodyDataBody body) {
            this.body = body;
            return this;
        }
        public DescribeCloudCenterInstancesResponseBodyDataBody getBody() {
            return this.body;
        }

    }

}
