// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeCloudCenterInstancesResponseBodyInstances> instances;

    @NameInMap("PageInfo")
    public DescribeCloudCenterInstancesResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeCloudCenterInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudCenterInstancesResponseBody self = new DescribeCloudCenterInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudCenterInstancesResponseBody setInstances(java.util.List<DescribeCloudCenterInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeCloudCenterInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeCloudCenterInstancesResponseBody setPageInfo(DescribeCloudCenterInstancesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeCloudCenterInstancesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
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

    public static class DescribeCloudCenterInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("AssetType")
        public String assetType;

        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        @NameInMap("AuthVersion")
        public Integer authVersion;

        @NameInMap("AuthVersionName")
        public String authVersionName;

        @NameInMap("Bind")
        public Boolean bind;

        @NameInMap("ClientStatus")
        public String clientStatus;

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

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupTrace")
        public String groupTrace;

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
        public Integer mem;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsName")
        public String osName;

        @NameInMap("PodCount")
        public Integer podCount;

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
        public Integer safeEventCount;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TagId")
        public String tagId;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Vendor")
        public Integer vendor;

        @NameInMap("VendorName")
        public String vendorName;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        @NameInMap("VulCount")
        public Integer vulCount;

        @NameInMap("VulStatus")
        public String vulStatus;

        public static DescribeCloudCenterInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudCenterInstancesResponseBodyInstances self = new DescribeCloudCenterInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setAuthModifyTime(Long authModifyTime) {
            this.authModifyTime = authModifyTime;
            return this;
        }
        public Long getAuthModifyTime() {
            return this.authModifyTime;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setAuthVersion(Integer authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setAuthVersionName(String authVersionName) {
            this.authVersionName = authVersionName;
            return this;
        }
        public String getAuthVersionName() {
            return this.authVersionName;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setBind(Boolean bind) {
            this.bind = bind;
            return this;
        }
        public Boolean getBind() {
            return this.bind;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setCpuInfo(String cpuInfo) {
            this.cpuInfo = cpuInfo;
            return this;
        }
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setExposedStatus(Integer exposedStatus) {
            this.exposedStatus = exposedStatus;
            return this;
        }
        public Integer getExposedStatus() {
            return this.exposedStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setGroupTrace(String groupTrace) {
            this.groupTrace = groupTrace;
            return this;
        }
        public String getGroupTrace() {
            return this.groupTrace;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setHcStatus(String hcStatus) {
            this.hcStatus = hcStatus;
            return this;
        }
        public String getHcStatus() {
            return this.hcStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setHealthCheckCount(Integer healthCheckCount) {
            this.healthCheckCount = healthCheckCount;
            return this;
        }
        public Integer getHealthCheckCount() {
            return this.healthCheckCount;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setImportance(Integer importance) {
            this.importance = importance;
            return this;
        }
        public Integer getImportance() {
            return this.importance;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setIpListString(String ipListString) {
            this.ipListString = ipListString;
            return this;
        }
        public String getIpListString() {
            return this.ipListString;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setKernel(String kernel) {
            this.kernel = kernel;
            return this;
        }
        public String getKernel() {
            return this.kernel;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setLastLoginTimestamp(Long lastLoginTimestamp) {
            this.lastLoginTimestamp = lastLoginTimestamp;
            return this;
        }
        public Long getLastLoginTimestamp() {
            return this.lastLoginTimestamp;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setMacListString(String macListString) {
            this.macListString = macListString;
            return this;
        }
        public String getMacListString() {
            return this.macListString;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setRiskCount(String riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public String getRiskCount() {
            return this.riskCount;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setSafeEventCount(Integer safeEventCount) {
            this.safeEventCount = safeEventCount;
            return this;
        }
        public Integer getSafeEventCount() {
            return this.safeEventCount;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setVulStatus(String vulStatus) {
            this.vulStatus = vulStatus;
            return this;
        }
        public String getVulStatus() {
            return this.vulStatus;
        }

    }

    public static class DescribeCloudCenterInstancesResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeCloudCenterInstancesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudCenterInstancesResponseBodyPageInfo self = new DescribeCloudCenterInstancesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCloudCenterInstancesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeCloudCenterInstancesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeCloudCenterInstancesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCloudCenterInstancesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
