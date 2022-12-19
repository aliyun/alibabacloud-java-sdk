// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesResponseBody extends TeaModel {
    // An array that consists of the details about the assets.
    @NameInMap("Instances")
    public java.util.List<DescribeCloudCenterInstancesResponseBodyInstances> instances;

    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeCloudCenterInstancesResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
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
        // Indicates whether alerts are generated on the asset. Valid values:
        // 
        // *   **YES**
        // *   **NO**
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        // The type of the asset. Valid values:
        // 
        // *   **0**: an ECS instance
        // *   **1**: a Server Load Balancer (SLB) instance
        // *   **2**: a NAT gateway
        // *   **3**: an ApsaraDB RDS instance
        // *   **4**: an ApsaraDB for MongoDB instance
        // *   **5**: an ApsaraDB for Redis instance
        // *   **6**: a container image
        // *   **7**: a container
        @NameInMap("AssetType")
        public String assetType;

        // The timestamp when Security Center is authorized to scan the asset.
        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        // The edition of Security Center that is authorized to protect the asset. Valid values:
        // 
        // *   **1**: Basic edition
        // *   **6**: Anti-virus edition
        // *   **5**: Advanced edition
        // *   **3**: Enterprise edition
        // *   **7**: Ultimate edition
        @NameInMap("AuthVersion")
        public Integer authVersion;

        // The name of the Security Center edition that is authorized to scan the asset. Valid values:
        // 
        // *   Basic edition
        // *   Anti-virus edition
        // *   Advanced edition
        // *   Enterprise edition
        // *   Ultimate edition
        // *   Value-added Plan edition
        @NameInMap("AuthVersionName")
        public String authVersionName;

        // Indicates whether Security Center is authorized to scan the asset. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("Bind")
        public Boolean bind;

        // The status of the Security Center agent installed on the asset. Valid values:
        // 
        // *   **online**: The Security Center agent is **enabled**.
        // *   **offline**: The Security Center agent is **disabled**.
        // *   **pause**: The Security Center agent is **suspended**.
        @NameInMap("ClientStatus")
        public String clientStatus;

        // The ID of the cluster.
        @NameInMap("ClusterId")
        public String clusterId;

        // The name of the cluster.
        @NameInMap("ClusterName")
        public String clusterName;

        // The number of the CPU cores used by the asset.
        @NameInMap("Cores")
        public Integer cores;

        // The CPU information about the asset.
        @NameInMap("CpuInfo")
        public String cpuInfo;

        // The timestamp when the cluster was created. Unit: milliseconds.
        @NameInMap("CreatedTime")
        public Long createdTime;

        // Indicates whether the asset is exposed. Valid values:
        // 
        // *   **0**: no
        // *   **1**: yes
        @NameInMap("ExposedStatus")
        public Integer exposedStatus;

        // Indicates whether the asset is an Alibaba Cloud asset. Valid values:
        // 
        // *   **0**: yes
        // *   **1**: no
        @NameInMap("Flag")
        public Integer flag;

        // The ID of the asset group to which the asset belongs.
        @NameInMap("GroupId")
        public Long groupId;

        // The name of the group to which the asset belongs.
        @NameInMap("GroupTrace")
        public String groupTrace;

        // Indicates whether baseline risks are detected on the asset. Valid values:
        // 
        // *   **YES**
        // *   **NO**
        @NameInMap("HcStatus")
        public String hcStatus;

        // The number of baseline risks that are detected on the asset.
        @NameInMap("HealthCheckCount")
        public Integer healthCheckCount;

        // The importance of the asset. Valid values:
        // 
        // *   **2**: an important asset
        // *   **1**: a common asset
        // *   **0**: a test asset
        @NameInMap("Importance")
        public Integer importance;

        // The ID of the asset.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the asset.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the asset.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the asset.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The public IP address of the asset.
        @NameInMap("Ip")
        public String ip;

        // The IP addresses of the system.
        @NameInMap("IpListString")
        public String ipListString;

        // The version of the kernel.
        @NameInMap("Kernel")
        public String kernel;

        // The timestamp when the Security Center agent was last online. Unit: milliseconds.
        @NameInMap("LastLoginTimestamp")
        public Long lastLoginTimestamp;

        // The MAC address of the system.
        @NameInMap("MacListString")
        public String macListString;

        // The size of the memory. Unit: MB.
        @NameInMap("Mem")
        public Integer mem;

        // The operating system of the asset.
        @NameInMap("Os")
        public String os;

        // The kernel version of the asset.
        @NameInMap("OsName")
        public String osName;

        // The number of pods.
        @NameInMap("PodCount")
        public Integer podCount;

        // The region ID of the asset.
        @NameInMap("Region")
        public String region;

        // The ID of the region in which the asset resides.
        @NameInMap("RegionId")
        public String regionId;

        // The name of the region in which the asset resides.
        @NameInMap("RegionName")
        public String regionName;

        // The total number of baseline risks that are detected on the asset. The value of this parameter is in the JSON format and contains the following fields:
        // 
        // *   **account**: the number of accounts that are used to log on from unapproved logon locations and whose passwords are cracked
        // *   **appNum**: the number of scanners
        // *   **asapVulCount**: the total number of high-risk vulnerabilities
        // *   **baselineHigh**: the number of high-risk baseline risks
        // *   **baselineLow**: the number of low-risk baseline risks
        // *   **baselineMedium**: the number of medium-risk baseline risks
        // *   **baselineNum**: the total number of baseline risks
        // *   **cmsNum**: the number of Web-CMS vulnerabilities
        // *   **containerAsap**: the number of high-risk vulnerabilities that are detected on containers
        // *   **containerLater**: the number of medium-risk vulnerabilities that are detected on containers
        // *   **containerNntf**: the number of low-risk vulnerabilities that are detected on containers
        // *   **containerRemind**: the number of alerts whose Emergency level is Reminder on containers
        // *   **containerSerious**: the number of alerts whose Emergency level is Urgent on containers
        // *   **containerSuspicious**: the number of alerts whose Emergency level is Suspicious on containers
        // *   **cveNum**: the number of Linux software vulnerabilities
        // *   **emgNum**: the number of urgent vulnerabilities
        // *   **health**: the number of baseline alerts that are unhandled
        // *   **imageBaselineHigh**: the number of high-risk baseline risks that are detected on images
        // *   **imageBaselineLow**: the number of low-risk baseline risks that are detected on images
        // *   **imageBaselineMedium**: the number of medium-risk baseline risks that are detected on images
        // *   **imageBaselineNum**: the total number of baseline risks that are detected on images
        // *   **imageMaliciousFileRemind**: the number of malicious files that are detected on images and have the Emergency level of Reminder
        // *   **imageMaliciousFileSerious**: the number of malicious files that are detected on images and have the Emergency level of Urgent
        // *   **imageMaliciousFileSuspicious**: the number of malicious files that are detected on images and have the Emergency level of Suspicious
        // *   **imageVulAsap**: the number of high-risk vulnerabilities that are detected on images
        // *   **imageVulLater**: the number of medium-risk vulnerabilities that are detected on an image
        // *   **imageVulNntf**: the number of low-risk vulnerabilities that are detected on an image
        // *   **laterVulCount**: the number of medium-risk vulnerabilities
        // *   **newSuspicious**: the number of alerts
        // *   **nntfVulCount**: the number of low-risk vulnerabilities.
        // *   **remindNum**: the number of alerts whose Emergency level is Reminder
        // *   **scaNum**: the number of vulnerabilities that are detected based on software component analysis
        // *   **seriousNum**: the number of alerts whose Emergency level is Urgent
        // *   **suspNum**: the number of alerts whose Emergency level is Suspicious
        // *   **suspicious**: the total number of alerts
        // *   **sysNum**: the number of Windows system vulnerabilities
        // *   **trojan**: the number of trojans
        // *   **uuid**: the UUIDs of assets
        // *   **vul**: the number of vulnerabilities
        // *   **weakPWNum**: the number of weak passwords
        @NameInMap("RiskCount")
        public String riskCount;

        // Indicates whether risks are detected on the asset. Valid values:
        // 
        // *   **YES**
        // *   **NO**
        @NameInMap("RiskStatus")
        public String riskStatus;

        // The number of alerts that are generated on the asset.
        @NameInMap("SafeEventCount")
        public Integer safeEventCount;

        // The status of the asset. Valid values:
        // 
        // *   **Running**: running
        // *   **notRunning**: stopped
        @NameInMap("Status")
        public String status;

        // The name of the asset tag.
        @NameInMap("Tag")
        public String tag;

        // The ID of the asset tag.
        @NameInMap("TagId")
        public String tagId;

        // The UUID of the asset.
        @NameInMap("Uuid")
        public String uuid;

        // The type of the asset by source. Valid values:
        // 
        // *   **0**: an asset provided by Alibaba Cloud.
        // *   **1**: a third-party cloud server
        // *   **2**: a server in a data center
        // *   **3**, **4**, **5**, and **7**: other cloud asset
        // *   **8**: a lightweight asset
        @NameInMap("Vendor")
        public Integer vendor;

        // The name of the service provider (SP) for the asset.
        // 
        // Valid values:
        // 
        // *   **ALIYUN**: Alibaba Cloud
        // *   **OUT**: a third-party service provider
        // *   **IDC**: a data center
        // *   **TENCENT**: Tencent Cloud
        // *   **HUAWEICLOUD**: Huawei Cloud
        // *   **Microsoft**: Microsoft
        // *   **AWS**: Amazon Web Services (AWS)
        // *   **TRIPARTITE**: a lightweight server
        @NameInMap("VendorName")
        public String vendorName;

        // The ID of the VPC to which the asset belongs.
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        // The number of vulnerabilities that are detected on the asset.
        @NameInMap("VulCount")
        public Integer vulCount;

        // Indicates whether vulnerabilities are detected on the asset. Valid values:
        // 
        // *   **YES**
        // *   **NO**
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
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: **20**.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
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
