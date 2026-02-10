// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudCenterInstancesResponseBody extends TeaModel {
    /**
     * <p>The details about the assets.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeCloudCenterInstancesResponseBodyInstances> instances;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeCloudCenterInstancesResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>32A73759-4C0F-4801-BE98-901223ACEE9A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call is successful.</li>
     * <li><strong>false</strong>: The call fails.</li>
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
         * <p>Indicates whether alerts are generated on the asset. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        /**
         * <p>The ID of the application.</p>
         * <blockquote>
         * <p> This parameter is available only when the <strong>Vendor</strong> parameter is set to 9.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * <blockquote>
         * <p> This parameter is available only when the <strong>Vendor</strong> parameter is set to 9.</p>
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
         * <li><strong>0</strong>: an ECS instance</li>
         * <li><strong>1</strong>: a Server Load Balancer (SLB) instance</li>
         * <li><strong>2</strong>: a Network Address Translation (NAT) gateway</li>
         * <li><strong>3</strong>: an ApsaraDB RDS instance</li>
         * <li><strong>4</strong>: an ApsaraDB for MongoDB instance</li>
         * <li><strong>5</strong>: an ApsaraDB for Redis instance</li>
         * <li><strong>6</strong>: a container image</li>
         * <li><strong>7</strong>: a container</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The name of the asset type.</p>
         * 
         * <strong>example:</strong>
         * <p>Elastic Compute Service</p>
         */
        @NameInMap("AssetTypeName")
        public String assetTypeName;

        /**
         * <p>The timestamp when Security Center is authorized to scan the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1627974044000</p>
         */
        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        /**
         * <p>The edition of Security Center that is authorized to scan the asset. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic edition</li>
         * <li><strong>6</strong>: Anti-virus edition</li>
         * <li><strong>5</strong>: Advanced edition</li>
         * <li><strong>3</strong>: Enterprise edition</li>
         * <li><strong>7</strong>: Ultimate edition</li>
         * <li><strong>10</strong>: Value-added Plan edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthVersion")
        public Integer authVersion;

        /**
         * <p>The name of the Security Center edition that is authorized to protect the asset. Valid values:</p>
         * <ul>
         * <li>Basic edition</li>
         * <li>Anti-virus edition</li>
         * <li>Advanced edition</li>
         * <li>Enterprise edition</li>
         * <li>Ultimate edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ultimate Edition</p>
         */
        @NameInMap("AuthVersionName")
        public String authVersionName;

        /**
         * <p>Indicates whether Security Center is authorized to scan the asset. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Security Center is authorized to scan the asset.</li>
         * <li><strong>false</strong>: Security Center is not authorized to scan the asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <p>Whether to bind tamper-proof authorization. Values:</p>
         * <ul>
         * <li><strong>block</strong>: Yes</li>
         * <li><strong>none</strong>: No</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("BindFileProtectType")
        public String bindFileProtectType;

        /**
         * <p>The status of the Security Center agent installed on the asset. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: The Security Center agent is <strong>enabled</strong>.</li>
         * <li><strong>offline</strong>: The Security Center agent is <strong>disabled</strong>.</li>
         * <li><strong>pause</strong>: The Security Center agent is <strong>suspended</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The sub-status of the Security Center agent installed on the asset. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: The Security Center agent is <strong>enabled</strong>.</li>
         * <li><strong>offline</strong>: The Security Center agent is <strong>disabled</strong>.</li>
         * <li><strong>pause</strong>: The Security Center agent is <strong>suspended</strong>.</li>
         * <li><strong>uninstalled</strong>: The Security Center agent is <strong>uninstalled</strong>.</li>
         * <li><strong>stopped</strong>: The Security Center agent is <strong>stopped</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("ClientSubStatus")
        public String clientSubStatus;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c690a0789419f4284a4e0a29e12fe****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster1</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The number of the CPU cores used by the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The CPU information about the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Intel(R) Xeon(R) Platinum 8269CY CPU @ 2.50GHz</p>
         */
        @NameInMap("CpuInfo")
        public String cpuInfo;

        /**
         * <p>The timestamp when the cluster was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1607365213000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>Indicates whether the asset is exposed. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The asset is not exposed.</li>
         * <li><strong>1</strong>: The asset is exposed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExposedStatus")
        public Integer exposedStatus;

        /**
         * <p>Indicates whether the asset is an Alibaba Cloud asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The asset is an Alibaba Cloud asset.</li>
         * <li><strong>1</strong>: The asset is not an Alibaba Cloud asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>Asset vendor. Values: </p>
         * <ul>
         * <li><strong>ALIYUN</strong> </li>
         * <li><strong>OUT</strong></li>
         * <li><strong>IDC</strong> </li>
         * <li><strong>Tencent</strong> </li>
         * <li><strong>HUAWEICLOUD</strong> </li>
         * <li><strong>Azure</strong> </li>
         * <li><strong>AWS</strong> </li>
         * <li><strong>ASK</strong> </li>
         * <li><strong>TRIPARTITE</strong> </li>
         * <li><strong>SAE</strong> </li>
         * <li><strong>PAI</strong> </li>
         * <li><strong>google</strong> </li>
         * <li><strong>VOLCENGINE</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASK</p>
         */
        @NameInMap("FlagName")
        public String flagName;

        /**
         * <p>The ID of the asset group to which the asset belongs.</p>
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
         * <p>Indicates if containers are included. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong>: yes.</li>
         * <li><strong>NO</strong>: no.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("HasContainer")
        public String hasContainer;

        /**
         * <p>Indicates whether baseline risks are detected on the asset. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("HcStatus")
        public String hcStatus;

        /**
         * <p>The number of baseline risks that are detected on the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HealthCheckCount")
        public Integer healthCheckCount;

        /**
         * <p>The importance of the asset. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: an important asset</li>
         * <li><strong>1</strong>: a common asset</li>
         * <li><strong>0</strong>: a test asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Importance")
        public Integer importance;

        /**
         * <p>The ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-m5***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>yztest-l***</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The public IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The IP addresses of the system.</p>
         * 
         * <strong>example:</strong>
         * <p>172.31.XX.XX,172.171.XX.XX</p>
         */
        @NameInMap("IpListString")
        public String ipListString;

        /**
         * <p>The version of the kernel.</p>
         * 
         * <strong>example:</strong>
         * <p>3.10.0-1127.19.1.el7.x86_64</p>
         */
        @NameInMap("Kernel")
        public String kernel;

        /**
         * <p>The timestamp when the Security Center agent was last online. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1637592907000</p>
         */
        @NameInMap("LastLoginTimestamp")
        public Long lastLoginTimestamp;

        /**
         * <p>The MAC addresses of the system.</p>
         * 
         * <strong>example:</strong>
         * <p>00:13:3e:31:13:39,02:12:67:b8:<strong>:</strong></p>
         */
        @NameInMap("MacListString")
        public String macListString;

        /**
         * <p>The size of the memory. Unit: MB.</p>
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
         * <p>The operating system of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The kernel version of the asset.</p>
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
         * <p>The billing method of the protection version currently bound to the asset. Values: - <strong>0</strong>: Subscription - <strong>1</strong>: Pay-as-you-go</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PostPaidFlag")
        public Integer postPaidFlag;

        /**
         * <p>The region ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-cm***-***</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the region in which the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hanghzou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region in which the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The total number of baseline risks that are detected on the asset. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>account</strong>: the number of accounts that are used to log on from unapproved logon locations and whose passwords are cracked</li>
         * <li><strong>appNum</strong>: the number of scanners</li>
         * <li><strong>asapVulCount</strong>: the total number of high-severity vulnerabilities</li>
         * <li><strong>baselineHigh</strong>: the number of high-risk baseline risks</li>
         * <li><strong>baselineLow</strong>: the number of low-risk baseline risks</li>
         * <li><strong>baselineMedium</strong>: the number of medium-risk baseline risks</li>
         * <li><strong>baselineNum</strong>: the total number of baseline risks</li>
         * <li><strong>cmsNum</strong>: the number of Web-CMS vulnerabilities</li>
         * <li><strong>containerAsap</strong>: the number of high-severity vulnerabilities that are detected on containers</li>
         * <li><strong>containerLater</strong>: the number of medium-severity vulnerabilities that are detected on containers</li>
         * <li><strong>containerNntf</strong>: the number of low-severity vulnerabilities that are detected on containers</li>
         * <li><strong>containerRemind</strong>: the number of alerts whose Emergency level is Reminder on containers</li>
         * <li><strong>containerSerious</strong>: the number of alerts Emergency level is Urgent on containers</li>
         * <li><strong>containerSuspicious</strong>: the number of alerts whose Emergency level is Suspicious on containers</li>
         * <li><strong>cveNum</strong>: the number of Linux software vulnerabilities</li>
         * <li><strong>emgNum</strong>: the number of urgent vulnerabilities</li>
         * <li><strong>health</strong>: the number of baseline alerts that are unhandled</li>
         * <li><strong>imageBaselineHigh</strong>: the number of high-risk baseline risks that are detected on images</li>
         * <li><strong>imageBaselineLow</strong>: the number of low-risk baseline risks that are detected on images</li>
         * <li><strong>imageBaselineMedium</strong>: the number of medium-risk baseline risks that are detected on images</li>
         * <li><strong>imageBaselineNum</strong>: the total number of baseline risks that are detected on images</li>
         * <li><strong>imageMaliciousFileRemind</strong>: the number of malicious files that are detected on images and have the Emergency level of Reminder</li>
         * <li><strong>imageMaliciousFileSerious</strong>: the number of malicious files that are detected on images and have the Emergency level of Urgent</li>
         * <li><strong>imageMaliciousFileSuspicious</strong>: the number of malicious files that are detected on images and have the Emergency level of Suspicious</li>
         * <li><strong>imageVulAsap</strong>: the number of high-severity vulnerabilities that are detected on images</li>
         * <li><strong>imageVulLater</strong>: the number of medium-severity vulnerabilities that are detected on an image</li>
         * <li><strong>imageVulNntf</strong>: the number of low-severity vulnerabilities that are detected on an image</li>
         * <li><strong>laterVulCount</strong>: the number of medium-severity vulnerabilities</li>
         * <li><strong>newSuspicious</strong>: the number of alerts</li>
         * <li><strong>nntfVulCount</strong>: the number of low-severity vulnerabilities.</li>
         * <li><strong>remindNum</strong>: the number of alerts whose Emergency level is Reminder</li>
         * <li><strong>scaNum</strong>: the number of vulnerabilities that are detected based on software component analysis</li>
         * <li><strong>seriousNum</strong>: the number of alerts whose Emergency level is Urgent</li>
         * <li><strong>suspNum</strong>: the number of alerts whose Emergency level is Suspicious</li>
         * <li><strong>suspicious</strong>: the total number of alerts</li>
         * <li><strong>sysNum</strong>: the number of Windows system vulnerabilities</li>
         * <li><strong>trojan</strong>: the number of trojans</li>
         * <li><strong>uuid</strong>: the UUIDs of assets</li>
         * <li><strong>vul</strong>: the number of vulnerabilities</li>
         * <li><strong>weakPWNum</strong>: the number of weak passwords</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;account&quot;:0,&quot;appNum&quot;:0,&quot;asapVulCount&quot;:0,&quot;baselineHigh&quot;:0,&quot;baselineLow&quot;:0,&quot;baselineMedium&quot;:0,&quot;baselineNum&quot;:0,&quot;cmsNum&quot;:0,&quot;containerAsap&quot;:0,&quot;containerLater&quot;:0,&quot;containerNntf&quot;:0,&quot;containerRemind&quot;:0,&quot;containerSerious&quot;:0,&quot;containerSuspicious&quot;:0,&quot;cveNum&quot;:0,&quot;emgNum&quot;:0,&quot;health&quot;:0,&quot;imageBaselineHigh&quot;:0,&quot;imageBaselineLow&quot;:0,&quot;imageBaselineMedium&quot;:0,&quot;imageBaselineNum&quot;:0,&quot;imageMaliciousFileRemind&quot;:0,&quot;imageMaliciousFileSerious&quot;:0,&quot;imageMaliciousFileSuspicious&quot;:0,&quot;imageVulAsap&quot;:0,&quot;imageVulLater&quot;:0,&quot;imageVulNntf&quot;:0,&quot;laterVulCount&quot;:0,&quot;newSuspicious&quot;:0,&quot;nntfVulCount&quot;:0,&quot;remindNum&quot;:0,&quot;scaNum&quot;:0,&quot;seriousNum&quot;:0,&quot;suspNum&quot;:0,&quot;suspicious&quot;:0,&quot;sysNum&quot;:0,&quot;trojan&quot;:0,&quot;uuid&quot;:&quot;inet-37316411-37fe-4b72-b245-346a2721d4b6&quot;,&quot;vul&quot;:0,&quot;weakPWNum&quot;:0}</p>
         */
        @NameInMap("RiskCount")
        public String riskCount;

        /**
         * <p>Indicates whether risks are detected on the asset. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>The number of alerts that are generated on the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SafeEventCount")
        public Integer safeEventCount;

        /**
         * <p>Service ID. Only available for PAI instances.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-76jlywunsif09bp15p</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The status of the asset. Valid values:</p>
         * <ul>
         * <li><strong>Running</strong>: running</li>
         * <li><strong>notRunning</strong>: stopped</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the asset tag.</p>
         * 
         * <strong>example:</strong>
         * <p>InternetIp,test</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The ID of the asset tag.</p>
         * 
         * <strong>example:</strong>
         * <p>121313,41412</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>The custom tag added to the Lingjun node. This parameter is returned only for LINGJUN GPU-accelerated instances.</p>
         * 
         * <strong>example:</strong>
         * <p>app:test,type:lingjun</p>
         */
        @NameInMap("TagResources")
        public String tagResources;

        /**
         * <p>The UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>c9107c04-942f-40c1-981a-f1c1***</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>Asset vendor. Values:</p>
         * <ul>
         * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
         * <li><strong>1</strong>: an asset outside Alibaba Cloud</li>
         * <li><strong>2</strong>: an asset in a data center</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>, <strong>14</strong>, <strong>16</strong>: an asset from a third-party cloud service provider</li>
         * <li><strong>8</strong>: a lightweight asset</li>
         * <li><strong>9</strong>: a Serverless App Engine (SAE) instance</li>
         * <li><strong>10</strong>: an instance in Platform for AI (PAI)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        /**
         * <p>The name of the service provider for the asset.
         * Values:</p>
         * <ul>
         * <li><strong>ALIYUN</strong>: Alibaba Cloud </li>
         * <li><strong>OUT</strong>: a third-party service provider</li>
         * <li><strong>IDC</strong>: an asset in a data center</li>
         * <li><strong>TENCENT</strong>: Tencent Cloud</li>
         * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
         * <li><strong>Microsoft</strong>: Microsoft Azure</li>
         * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
         * <li><strong>TRIPARTITE</strong>: a lightweight server</li>
         * <li><strong>SAE</strong>: a Serverless App Engine (SAE) instance</li>
         * <li><strong>PAI</strong>: an instance in Platform for AI (PAI)</li>
         * <li><strong>VOLCENGINE</strong>: VOLCENGINE Cloud</li>
         * <li><strong>google</strong>: GOOGLE Cloud</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Tencent</p>
         */
        @NameInMap("VendorName")
        public String vendorName;

        /**
         * <p>Account ID of the multi-cloud instance.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("VendorUid")
        public String vendorUid;

        /**
         * <p>Account name of the multi-cloud instance.</p>
         * 
         * <strong>example:</strong>
         * <p>VendorUserName</p>
         */
        @NameInMap("VendorUserName")
        public String vendorUserName;

        /**
         * <p>The ID of the VPC to which the asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf60agqq65bs98zoo****</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        /**
         * <p>The number of vulnerabilities that are detected on the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("VulCount")
        public Integer vulCount;

        /**
         * <p>Indicates whether vulnerabilities are detected on the asset. Valid values:</p>
         * <ul>
         * <li><strong>YES</strong></li>
         * <li><strong>NO</strong></li>
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
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The value of NextToken that is returned when the NextToken method is used.</p>
         * 
         * <strong>example:</strong>
         * <p>B604532DEF982B875E8360A6EFA3B***</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
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
