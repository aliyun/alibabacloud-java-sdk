// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesResponseBody extends TeaModel {
    /**
     * <p>Specifies whether to internationalize the name of the **default** group. Default value: **false**. Valid values:</p>
     * <br>
     * <p>*   **true**: The system returns the Chinese name of the default group for the **GroupTrace** response parameter.********</p>
     * <p>*   **false**: The system returns default for the **GroupTrace** response parameter.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeCloudCenterInstancesResponseBodyInstances> instances;

    /**
     * <p>The type of the assets that you want to query. Valid values:</p>
     * <br>
     * <p>*   **ecs**: servers</p>
     * <p>*   **cloud_product**: Alibaba Cloud services</p>
     */
    @NameInMap("PageInfo")
    public DescribeCloudCenterInstancesResponseBodyPageInfo pageInfo;

    /**
     * <p>The search conditions that are used to filter assets. The value of this parameter is in the JSON format and is case-sensitive.</p>
     * <br>
     * <p>> A search condition can be an instance ID, instance name, VPC ID, region, or public IP address. You can call the [DescribeCriteria](~~DescribeCriteria~~) operation to query the supported search conditions.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the region in which the asset resides.</p>
     */
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
        /**
         * <p>The number of pods.</p>
         */
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        /**
         * <p>Indicates whether alerts are generated on the asset. Valid values:</p>
         * <br>
         * <p>*   **YES**</p>
         * <p>*   **NO**</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>Indicates whether risks are detected on the asset. Valid values:</p>
         * <br>
         * <p>*   **YES**</p>
         * <p>*   **NO**</p>
         */
        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        /**
         * <p>Indicates whether Security Center is authorized to protect the asset. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>The ID of the asset.</p>
         */
        @NameInMap("AuthVersionName")
        public String authVersionName;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The timestamp when the Security Center agent was last online. Unit: milliseconds.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <br>
         * <p>*   **0**: an ECS instance</p>
         * <p>*   **1**: a Server Load Balancer (SLB) instance</p>
         * <p>*   **2**: a NAT gateway</p>
         * <p>*   **3**: an ApsaraDB RDS instance</p>
         * <p>*   **4**: an ApsaraDB for MongoDB instance</p>
         * <p>*   **5**: an ApsaraDB for Redis instance</p>
         * <p>*   **6**: a container image</p>
         * <p>*   **7**: a container</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The region ID of the asset.</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <br>
         * <p>*   **true**: The request was successful.</p>
         * <p>*   **false**: The request failed.</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        /**
         * <p>The ID of the asset tag.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The private IP address of the asset.</p>
         */
        @NameInMap("ExposedStatus")
        public Integer exposedStatus;

        /**
         * <p>The public IP address of the asset.</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The operating system of the asset.</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>Indicates whether the asset is an Alibaba Cloud asset. Valid values:</p>
         * <br>
         * <p>*   **0**: yes</p>
         * <p>*   **1**: no</p>
         */
        @NameInMap("GroupTrace")
        public String groupTrace;

        /**
         * <p>The ID of the VPC to which the asset belongs.</p>
         */
        @NameInMap("HcStatus")
        public String hcStatus;

        /**
         * <p>The timestamp when the cluster was created. Unit: milliseconds.</p>
         */
        @NameInMap("HealthCheckCount")
        public Integer healthCheckCount;

        /**
         * <p>Indicates whether baseline risk items are detected on the asset. Valid values:</p>
         * <br>
         * <p>*   **YES**</p>
         * <p>*   **NO**</p>
         */
        @NameInMap("Importance")
        public Integer importance;

        /**
         * <p>Indicates whether vulnerabilities are detected on the asset. Valid values:</p>
         * <br>
         * <p>*   **YES**</p>
         * <p>*   **NO**</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the asset tag.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The MAC address of the system.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The name of the group to which the asset belongs.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The UUID of the asset.</p>
         */
        @NameInMap("IpListString")
        public String ipListString;

        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("Kernel")
        public String kernel;

        /**
         * <p>The version of the kernel.</p>
         */
        @NameInMap("LastLoginTimestamp")
        public Long lastLoginTimestamp;

        /**
         * <p>The number of vulnerabilities that are detected on the asset.</p>
         */
        @NameInMap("MacListString")
        public String macListString;

        /**
         * <p>An array that consists of the details about the assets.</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The number of entries returned per page. Default value: **20**.</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The status of the Security Center agent installed on the asset. Valid values:</p>
         * <br>
         * <p>*   **online**: The Security Center agent is **enabled**.</p>
         * <p>*   **offline**: The Security Center agent is **disabled**.</p>
         * <p>*   **pause**: The Security Center agent is **suspended**.</p>
         */
        @NameInMap("PodCount")
        public Integer podCount;

        /**
         * <p>The version of the operating system that the asset runs.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The number of baseline risks that are detected on the asset.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The timestamp when Security Center is authorized to scan the asset. Unit: milliseconds.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The category of the service provider (SP) for the asset. Valid values:</p>
         * <br>
         * <p>*   **0**: The asset is provided by Alibaba Cloud.</p>
         * <p>*   **1**: The asset is not provided by Alibaba Cloud.</p>
         * <p>*   **2**: The asset resides in a data center.</p>
         * <p>*   **3**, **4**, **5**, and **7**: other cloud asset.</p>
         * <p>*   **8**: a light-weight asset.</p>
         */
        @NameInMap("RiskCount")
        public String riskCount;

        /**
         * <p>The edition of Security Center that is authorized to protect the asset. Valid values:</p>
         * <br>
         * <p>*   **1**: Basic edition</p>
         * <p>*   **6**: Anti-virus edition</p>
         * <p>*   **5**: Advanced edition</p>
         * <p>*   **3**: Enterprise edition</p>
         * <p>*   **7**: Ultimate edition</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>The number of the CPU cores for the asset.</p>
         */
        @NameInMap("SafeEventCount")
        public Integer safeEventCount;

        /**
         * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
         * <br>
         * <p>*   **zh**: Chinese</p>
         * <p>*   **en**: English</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The CPU information about the asset.</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>The public IP address of the asset.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The importance level of the asset. Valid values:</p>
         * <br>
         * <p>*   **2**: an important asset</p>
         * <p>*   **1**: a common asset</p>
         * <p>*   **0**: a test asset</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        /**
         * <p>The number of alerts that are generated on the asset.</p>
         */
        @NameInMap("VendorName")
        public String vendorName;

        /**
         * <p>The status of the asset. Valid values:</p>
         * <br>
         * <p>*   **Running**: running</p>
         * <p>*   **notRunning**: stopped</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        /**
         * <p>The memory size. Unit: MB.</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        /**
         * <p>The name of the asset.</p>
         */
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
        /**
         * <p>The importance level of the asset. Valid values:</p>
         * <br>
         * <p>*   **2**: an important asset</p>
         * <p>*   **1**: a common asset</p>
         * <p>*   **0**: a test asset</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The logical operator that you want to use to evaluate multiple search conditions. Default value: **OR**. Valid values:</p>
         * <br>
         * <p>*   **OR**: The search conditions are evaluated by using a logical **OR**.</p>
         * <p>*   **AND**: The search conditions are evaluated by using a logical **AND**.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries to return on each page. Default value: **20**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The number of the page to return. Default value: **1**.</p>
         */
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
