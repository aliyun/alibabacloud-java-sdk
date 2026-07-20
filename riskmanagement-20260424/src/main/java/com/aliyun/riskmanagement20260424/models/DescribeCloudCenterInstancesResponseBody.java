// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCloudCenterInstancesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1B4C9A14-94E6-5EEB-BF39-7DACCE9AC0D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        /**
         * <strong>example:</strong>
         * <p>FC2U0JVHWS49S2OT</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>guokent</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("AssetTypeName")
        public String assetTypeName;

        /**
         * <strong>example:</strong>
         * <p>1627974044000</p>
         */
        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <strong>example:</strong>
         * <p>免费版</p>
         */
        @NameInMap("AuthVersionName")
        public String authVersionName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("BindFileProtectType")
        public String bindFileProtectType;

        /**
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("ClientSubStatus")
        public String clientSubStatus;

        /**
         * <strong>example:</strong>
         * <p>cb703cb0ba6bd40d4a6d8de5bff050fb9</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>auto-cn-heyuan</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <strong>example:</strong>
         * <p>Intel(R) Xeon(R) Platinum 8269CY CPU @ 2.50GHz</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        /**
         * <strong>example:</strong>
         * <p>1607365213000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExposedStatus")
        public Integer exposedStatus;

        /**
         * <strong>example:</strong>
         * <p>0,1,2</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("FlagName")
        public String flagName;

        /**
         * <strong>example:</strong>
         * <p>86d30f8b0e124aadb7ef3197f9dbd1f5</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GroupTrace")
        public String groupTrace;

        /**
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("HasContainer")
        public String hasContainer;

        /**
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("HcStatus")
        public String hcStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HealthCheckCount")
        public Integer healthCheckCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Importance")
        public Integer importance;

        /**
         * <strong>example:</strong>
         * <p>ls-cn-tl32rf**008</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>ra-supabase-22u1iv3hr**5v9</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>47.1**.52.125</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <strong>example:</strong>
         * <p>172.16.1**.245</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <strong>example:</strong>
         * <p>114.55.*4.*6</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>172.31.XX.XX,172.171.XX.XX</p>
         */
        @NameInMap("IpListString")
        public String ipListString;

        /**
         * <strong>example:</strong>
         * <p>3.10.0-1127.19.1.el7.x86_64</p>
         */
        @NameInMap("Kernel")
        public String kernel;

        /**
         * <strong>example:</strong>
         * <p>1637592907000</p>
         */
        @NameInMap("LastLoginTimestamp")
        public Long lastLoginTimestamp;

        /**
         * <strong>example:</strong>
         * <p>00:13:3e:31:13:39,02:12:67:b8:<strong>:</strong></p>
         */
        @NameInMap("MacListString")
        public String macListString;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Mem")
        public String mem;

        /**
         * <strong>example:</strong>
         * <p>slsshpcorlsmetrics</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <strong>example:</strong>
         * <p>AliOS7U2-x86-64</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("PodCount")
        public Integer podCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PostPaidFlag")
        public Integer postPaidFlag;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhouxxxx</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <strong>example:</strong>
         * <p>{
         *       &quot;account&quot;: 0,
         *       &quot;appNum&quot;: 0,
         *       &quot;asapVulCount&quot;: 0,
         *       &quot;baselineHigh&quot;: 0,
         *       &quot;baselineLow&quot;: 0,
         *       &quot;baselineMedium&quot;: 0,
         *       &quot;baselineNum&quot;: 0,
         *       &quot;cmsNum&quot;: 0,
         *       &quot;containerAsap&quot;: 0,
         *       &quot;containerLater&quot;: 0,
         *       &quot;containerNntf&quot;: 0,
         *       &quot;containerRemind&quot;: 0,
         *       &quot;containerSerious&quot;: 0,
         *       &quot;containerSuspicious&quot;: 0,
         *       &quot;cveNum&quot;: 0,
         *       &quot;emgNum&quot;: 0,
         *       &quot;health&quot;: 0,
         *       &quot;imageBaselineHigh&quot;: 0,
         *       &quot;imageBaselineLow&quot;: 0,
         *       &quot;imageBaselineMedium&quot;: 0,
         *       &quot;imageBaselineNum&quot;: 0,
         *       &quot;imageMaliciousFileRemind&quot;: 0,
         *       &quot;imageMaliciousFileSerious&quot;: 0,
         *       &quot;imageMaliciousFileSuspicious&quot;: 0,
         *       &quot;imageVulAsap&quot;: 0,
         *       &quot;imageVulLater&quot;: 0,
         *       &quot;imageVulNntf&quot;: 0,
         *       &quot;laterVulCount&quot;: 0,
         *       &quot;newSuspicious&quot;: 0,
         *       &quot;nntfVulCount&quot;: 0,
         *       &quot;remindNum&quot;: 0,
         *       &quot;scaNum&quot;: 0,
         *       &quot;seriousNum&quot;: 0,
         *       &quot;suspNum&quot;: 0,
         *       &quot;suspicious&quot;: 0,
         *       &quot;sysNum&quot;: 0,
         *       &quot;trojan&quot;: 0,
         *       &quot;uuid&quot;: &quot;inet-37316411-37fe-4b72-b245-346a2721****&quot;,
         *       &quot;vul&quot;: 0,
         *       &quot;weakPWNum&quot;: 0
         * }</p>
         */
        @NameInMap("RiskCount")
        public String riskCount;

        /**
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SafeEventCount")
        public String safeEventCount;

        /**
         * <strong>example:</strong>
         * <p>dsw-76jlywunsif09bp15p</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>pre_20250714_idpt_adjust</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <strong>example:</strong>
         * <p>d8586ab8be4549e3815995858d277763</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <strong>example:</strong>
         * <p>app:test,type:lingjun</p>
         */
        @NameInMap("TagResources")
        public String tagResources;

        /**
         * <strong>example:</strong>
         * <p>1f0459ee-ed49-6484-8958-4f10f61e6362</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        /**
         * <strong>example:</strong>
         * <p>IDC</p>
         */
        @NameInMap("VendorName")
        public String vendorName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("VendorUid")
        public String vendorUid;

        /**
         * <strong>example:</strong>
         * <p>VendorUserName</p>
         */
        @NameInMap("VendorUserName")
        public String vendorUserName;

        /**
         * <strong>example:</strong>
         * <p>vpc-2zek7v0z4r6lbp02xckei</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        /**
         * <strong>example:</strong>
         * <p>YES</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>m1NGAAAAAABzLzIwMjQwMg==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>20EBDE7B-AA36-5D60-9DCA-151C48EDB9F8</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
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
