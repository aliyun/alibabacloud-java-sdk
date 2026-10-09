// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of asset details.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeCloudCenterInstancesResponseBodyInstances> instances;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeCloudCenterInstancesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request. Alibaba Cloud generates this unique identifier for each request. You can use this ID to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>32A73759-4C0F-4801-BE98-901223ACEE9A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the API call. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call succeeded.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>Indicates whether the asset has security alerts. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong>: The asset has security alerts.</li>
         * <li><strong>NO</strong>: The asset has no security alerts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        /**
         * <p>The application ID.</p>
         * <blockquote>
         * <p>This field is available only when <strong>Vendor</strong> is set to 9.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * <blockquote>
         * <p>This field is available only when <strong>Vendor</strong> is set to 9.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testAppName</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The type of the asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Cloud server.</li>
         * <li><strong>1</strong>: Load balancing.</li>
         * <li><strong>2</strong>: NAT gateway.</li>
         * <li><strong>3</strong>: ApsaraDB RDS database.</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB database.</li>
         * <li><strong>5</strong>: ApsaraDB for Redis database.</li>
         * <li><strong>6</strong>: Container image.</li>
         * <li><strong>7</strong>: Container.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The type name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Elastic Compute Service</p>
         */
        @NameInMap("AssetTypeName")
        public String assetTypeName;

        /**
         * <p>The timestamp when the license was bound to the asset, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1627974044000</p>
         */
        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        /**
         * <p>The license version of the asset. Valid values:
         * &lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition</li>
         * <li><strong>6</strong>: Anti-virus Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>7</strong>: Ultimate Edition</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition</li>
         * <li><strong>6</strong>: Anti-virus Edition</li>
         * <li><strong>5</strong>: Advanced</li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>7</strong>: Ultimate Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>The license version name of the asset. Valid values:</p>
         * <ul>
         * <li>Free Edition</li>
         * <li>Anti-virus Edition</li>
         * <li>Advanced Edition</li>
         * <li>Enterprise Edition</li>
         * <li>Ultimate Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ultimate Edition</p>
         */
        @NameInMap("AuthVersionName")
        public String authVersionName;

        /**
         * <p>Indicates whether the asset is bound to a license. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The asset is bound to a license.</li>
         * <li><strong>false</strong>: The asset is not bound to a license.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <p>Indicates whether the asset is bound to a tamper-proofing license. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Yes.</li>
         * <li><strong>none</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("BindFileProtectType")
        public String bindFileProtectType;

        /**
         * <p>The online status of the client on the instance. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: Online. The Agent client of the asset is <strong>enabled</strong>.</li>
         * <li><strong>offline</strong>: Offline. The Agent client of the asset is <strong>disabled</strong>.</li>
         * <li><strong>pause</strong>: Paused. The Agent client of the asset has <strong>protection paused</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The sub-status of the client on the instance. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: Online. The Agent client of the asset is <strong>enabled</strong>.</li>
         * <li><strong>offline</strong>: Offline. The Agent client of the asset is <strong>disabled</strong>.</li>
         * <li><strong>pause</strong>: Paused. The Agent client of the asset has <strong>protection paused</strong>.</li>
         * <li><strong>uninstalled</strong>: Not installed. The Agent client of the asset is <strong>not installed</strong>.</li>
         * <li><strong>stopped</strong>: Server stopped. The Agent client status indicates the <strong>server is stopped</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("ClientSubStatus")
        public String clientSubStatus;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c690a0789419f4284a4e0a29e12fe****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster1</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The number of CPU cores of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The CPU information of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Intel(R) Xeon(R) Platinum 8269CY CPU @ 2.50GHz</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        /**
         * <p>The timestamp when the cluster was created, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1607365213000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The EDR license version.</p>
         */
        @NameInMap("EdrAuthVersion")
        public String edrAuthVersion;

        /**
         * <p>The exposure status of the asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not exposed.</li>
         * <li><strong>1</strong>: Exposed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExposedStatus")
        public Integer exposedStatus;

        /**
         * <p>Indicates whether the instance is an Alibaba Cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud asset.</li>
         * <li><strong>1</strong>: Non-Alibaba Cloud asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The asset vendor. Valid values:</p>
         * <ul>
         * <li><strong>ALIYUN</strong></li>
         * <li><strong>OUT</strong></li>
         * <li><strong>IDC</strong></li>
         * <li><strong>Tencent</strong></li>
         * <li><strong>HUAWEICLOUD</strong></li>
         * <li><strong>Azure</strong></li>
         * <li><strong>AWS</strong></li>
         * <li><strong>ASK</strong></li>
         * <li><strong>TRIPARTITE</strong></li>
         * <li><strong>SAE</strong></li>
         * <li><strong>PAI</strong></li>
         * <li><strong>google</strong></li>
         * <li><strong>VOLCENGINE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASK</p>
         */
        @NameInMap("FlagName")
        public String flagName;

        /**
         * <p>The free quota type.</p>
         */
        @NameInMap("FreeType")
        public String freeType;

        /**
         * <p>The ID of the group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>4120080</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The name of the group to which the asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GroupTrace")
        public String groupTrace;

        /**
         * <p>Indicates whether the instance contains containers. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong>: The instance contains containers.</li>
         * <li><strong>NO</strong>: The instance does not contain containers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("HasContainer")
        public String hasContainer;

        /**
         * <p>Indicates whether baseline risks are detected on the instance. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong>: Baseline risks are detected.</li>
         * <li><strong>NO</strong>: No baseline risks are detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("HcStatus")
        public String hcStatus;

        /**
         * <p>The number of baseline risks on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HealthCheckCount")
        public Integer healthCheckCount;

        /**
         * <p>The importance level of the asset. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Important asset.</li>
         * <li><strong>1</strong>: General asset.</li>
         * <li><strong>0</strong>: Test asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Importance")
        public Integer importance;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-m5***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>yztest-l***</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The public IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The list of IP addresses of the system.</p>
         * 
         * <strong>example:</strong>
         * <p>172.31.XX.XX,172.171.XX.XX</p>
         */
        @NameInMap("IpListString")
        public String ipListString;

        /**
         * <p>The kernel version information.</p>
         * 
         * <strong>example:</strong>
         * <p>3.10.0-1127.19.1.el7.x86_64</p>
         */
        @NameInMap("Kernel")
        public String kernel;

        /**
         * <p>The timestamp of the last time the client came online, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637592907000</p>
         */
        @NameInMap("LastLoginTimestamp")
        public Long lastLoginTimestamp;

        /**
         * <p>The MAC address of the system.</p>
         * 
         * <strong>example:</strong>
         * <p>00:13:3e:31:13:39,02:12:67:b8:<strong>:</strong></p>
         */
        @NameInMap("MacListString")
        public String macListString;

        /**
         * <p>The memory size, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Mem")
        public Integer mem;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>crm-test</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The operating system of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The kernel version of the instance.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The number of pods.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PodCount")
        public Integer podCount;

        /**
         * <p>The billing method of the protection edition attached to the current asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Subscription.</li>
         * <li><strong>1</strong>: Pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PostPaidFlag")
        public Integer postPaidFlag;

        /**
         * <p>The ID of the region to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-cm***-***</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the region where the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hanghzou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The statistics of risk items on the asset. The value is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>account</strong>: The number of accounts with unusual logons or successful brute-force attacks.</li>
         * <li><strong>appNum</strong>: The number of scanner vulnerabilities.</li>
         * <li><strong>asapVulCount</strong>: The total number of high-priority vulnerabilities.</li>
         * <li><strong>baselineHigh</strong>: The number of high-risk baseline risks.</li>
         * <li><strong>baselineLow</strong>: The number of low-risk baseline risks.</li>
         * <li><strong>baselineMedium</strong>: The number of medium-risk baseline risks.</li>
         * <li><strong>baselineNum</strong>: The total number of cloud product configuration risks.</li>
         * <li><strong>cmsNum</strong>: The number of Web-CMS vulnerabilities.</li>
         * <li><strong>containerAsap</strong>: The number of high-priority container vulnerabilities.</li>
         * <li><strong>containerLater</strong>: The number of medium-priority container vulnerabilities.</li>
         * <li><strong>containerNntf</strong>: The number of low-priority container vulnerabilities.</li>
         * <li><strong>containerRemind</strong>: The number of container reminder alerts.</li>
         * <li><strong>containerSerious</strong>: The number of critical container alerts.</li>
         * <li><strong>containerSuspicious</strong>: The number of suspicious container alerts.</li>
         * <li><strong>cveNum</strong>: The number of Linux software vulnerabilities.</li>
         * <li><strong>emgNum</strong>: The number of emergency vulnerabilities.</li>
         * <li><strong>health</strong>: The number of unhandled baseline alerts.</li>
         * <li><strong>imageBaselineHigh</strong>: The number of high-risk baseline risks in images.</li>
         * <li><strong>imageBaselineLow</strong>: The number of low-risk baseline risks in images.</li>
         * <li><strong>imageBaselineMedium</strong>: The number of medium-risk baseline risks in images.</li>
         * <li><strong>imageBaselineNum</strong>: The total number of baseline risks in images.</li>
         * <li><strong>imageMaliciousFileRemind</strong>: The number of reminder malicious files in images.</li>
         * <li><strong>imageMaliciousFileSerious</strong>: The number of critical malicious files in images.</li>
         * <li><strong>imageMaliciousFileSuspicious</strong>: The number of suspicious malicious files in images.</li>
         * <li><strong>imageVulAsap</strong>: The number of high-priority vulnerabilities in images.</li>
         * <li><strong>imageVulLater</strong>: The number of medium-priority vulnerabilities in images.</li>
         * <li><strong>imageVulNntf</strong>: The number of low-priority vulnerabilities in images.</li>
         * <li><strong>laterVulCount</strong>: The number of medium-priority vulnerabilities.</li>
         * <li><strong>newSuspicious</strong>: The number of alerting events.</li>
         * <li><strong>nntfVulCount</strong>: The number of low-priority vulnerabilities.</li>
         * <li><strong>remindNum</strong>: The number of reminder alerts.</li>
         * <li><strong>scaNum</strong>: The number of software constituency parsing vulnerabilities.</li>
         * <li><strong>seriousNum</strong>: The number of critical alerts.</li>
         * <li><strong>suspNum</strong>: The number of suspicious alerts.</li>
         * <li><strong>suspicious</strong>: The total number of alerting events.</li>
         * <li><strong>sysNum</strong>: The number of Windows system vulnerabilities.</li>
         * <li><strong>trojan</strong>: The number of trojans.</li>
         * <li><strong>uuid</strong>: The UUID of the asset.</li>
         * <li><strong>vul</strong>: The number of vulnerabilities.</li>
         * <li><strong>weakPWNum</strong>: The number of weak passwords.</li>
         * </ul>
         * 
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
         * <p>Indicates whether the asset has security risks. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong>: The asset has security risks.</li>
         * <li><strong>NO</strong>: The asset has no security risks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>The number of security alerts on the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SafeEventCount")
        public Integer safeEventCount;

        /**
         * <p>The service ID. This field has a value only when the instance is a serverless instance that belongs to the PAI platform.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-76jlywunsif09bp15p</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The running status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Running</strong>: The instance is running.</li>
         * <li><strong>notRunning</strong>: The instance is stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag name of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>InternetIp,test</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The tag ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>121313,41412</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>The custom tags of Lingjun nodes. This field returns a value only when the instance is a Lingjun instance.</p>
         * 
         * <strong>example:</strong>
         * <p>app:test,type:lingjun</p>
         */
        @NameInMap("TagResources")
        public String tagResources;

        /**
         * <p>The UUID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>c9107c04-942f-40c1-981a-f1c1***</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The asset vendor. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud asset.</li>
         * <li><strong>1</strong>: Off-cloud asset.</li>
         * <li><strong>2</strong>: IDC asset.</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>, <strong>14</strong>, <strong>16</strong>: Other cloud assets.</li>
         * <li><strong>8</strong>: Lightweight asset.</li>
         * <li><strong>9</strong>: SAE.</li>
         * <li><strong>10</strong>: PAI.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        /**
         * <p>The service provider name of the asset. Valid values:</p>
         * <ul>
         * <li><strong>ALIYUN</strong>: Alibaba Cloud.</li>
         * <li><strong>OUT</strong>: Off-cloud asset.</li>
         * <li><strong>IDC</strong>: IDC.</li>
         * <li><strong>TENCENT</strong>: Other cloud.</li>
         * <li><strong>HUAWEICLOUD</strong>: Other cloud.</li>
         * <li><strong>Microsoft</strong>: Other cloud.</li>
         * <li><strong>AWS</strong>: Other cloud.</li>
         * <li><strong>TRIPARTITE</strong>: Lightweight server.</li>
         * <li><strong>SAE</strong>: SAE.</li>
         * <li><strong>PAI</strong>: PAI.</li>
         * <li><strong>VOLCENGINE</strong>: Other cloud.</li>
         * <li><strong>google</strong>: Other cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IDC</p>
         */
        @NameInMap("VendorName")
        public String vendorName;

        /**
         * <p>The account ID of the multi-cloud instance.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("VendorUid")
        public String vendorUid;

        /**
         * <p>The account name of the multi-cloud instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VendorUserName</p>
         */
        @NameInMap("VendorUserName")
        public String vendorUserName;

        /**
         * <p>The ID of the VPC to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf60agqq65bs98zoo****</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        /**
         * <p>The number of vulnerabilities on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        /**
         * <p>Indicates whether the instance has vulnerabilities. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong>: The instance has vulnerabilities.</li>
         * <li><strong>NO</strong>: The instance has no vulnerabilities.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
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

        public DescribeCloudCenterInstancesResponseBodyInstances setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setAssetTypeName(String assetTypeName) {
            this.assetTypeName = assetTypeName;
            return this;
        }
        public String getAssetTypeName() {
            return this.assetTypeName;
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

        public DescribeCloudCenterInstancesResponseBodyInstances setBindFileProtectType(String bindFileProtectType) {
            this.bindFileProtectType = bindFileProtectType;
            return this;
        }
        public String getBindFileProtectType() {
            return this.bindFileProtectType;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setClientSubStatus(String clientSubStatus) {
            this.clientSubStatus = clientSubStatus;
            return this;
        }
        public String getClientSubStatus() {
            return this.clientSubStatus;
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

        public DescribeCloudCenterInstancesResponseBodyInstances setEdrAuthVersion(String edrAuthVersion) {
            this.edrAuthVersion = edrAuthVersion;
            return this;
        }
        public String getEdrAuthVersion() {
            return this.edrAuthVersion;
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

        public DescribeCloudCenterInstancesResponseBodyInstances setFlagName(String flagName) {
            this.flagName = flagName;
            return this;
        }
        public String getFlagName() {
            return this.flagName;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setFreeType(String freeType) {
            this.freeType = freeType;
            return this;
        }
        public String getFreeType() {
            return this.freeType;
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

        public DescribeCloudCenterInstancesResponseBodyInstances setHasContainer(String hasContainer) {
            this.hasContainer = hasContainer;
            return this;
        }
        public String getHasContainer() {
            return this.hasContainer;
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

        public DescribeCloudCenterInstancesResponseBodyInstances setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
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

        public DescribeCloudCenterInstancesResponseBodyInstances setPostPaidFlag(Integer postPaidFlag) {
            this.postPaidFlag = postPaidFlag;
            return this;
        }
        public Integer getPostPaidFlag() {
            return this.postPaidFlag;
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

        public DescribeCloudCenterInstancesResponseBodyInstances setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
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

        public DescribeCloudCenterInstancesResponseBodyInstances setTagResources(String tagResources) {
            this.tagResources = tagResources;
            return this;
        }
        public String getTagResources() {
            return this.tagResources;
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

        public DescribeCloudCenterInstancesResponseBodyInstances setVendorUid(String vendorUid) {
            this.vendorUid = vendorUid;
            return this;
        }
        public String getVendorUid() {
            return this.vendorUid;
        }

        public DescribeCloudCenterInstancesResponseBodyInstances setVendorUserName(String vendorUserName) {
            this.vendorUserName = vendorUserName;
            return this;
        }
        public String getVendorUserName() {
            return this.vendorUserName;
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
         * <p>The number of assets displayed on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The current page number in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The NextToken value returned when NextToken-based pagination is used.</p>
         * 
         * <strong>example:</strong>
         * <p>B604532DEF982B875E8360A6EFA3B***</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The number of assets displayed per page in a paged query. Default value: <strong>20</strong>. This means 20 assets are displayed per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of assets returned by the query.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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

        public DescribeCloudCenterInstancesResponseBodyPageInfo setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
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
