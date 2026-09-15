// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupPoliciesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeBackupPoliciesResponseBodyPageInfo pageInfo;

    /**
     * <p>The details of the mitigation policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribeBackupPoliciesResponseBodyPolicies> policies;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request and can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>BE120DAB-F4E7-4C53-ADC3-A97578ABF384</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPoliciesResponseBody self = new DescribeBackupPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPoliciesResponseBody setPageInfo(DescribeBackupPoliciesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeBackupPoliciesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeBackupPoliciesResponseBody setPolicies(java.util.List<DescribeBackupPoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<DescribeBackupPoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public DescribeBackupPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupPoliciesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries on the current page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the current page in the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of backup policies per page in a paged query. Default value: 10, which indicates that each page contains 10 backup policies.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of backup policies in the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeBackupPoliciesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPoliciesResponseBodyPageInfo self = new DescribeBackupPoliciesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPoliciesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeBackupPoliciesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeBackupPoliciesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeBackupPoliciesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeBackupPoliciesResponseBodyPolicies extends TeaModel {
        /**
         * <p>The number of errors reported by the anti-ransomware client.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ClientErrorCount")
        public Integer clientErrorCount;

        /**
         * <p>The list of UUIDs of clients in the <strong>abnormal</strong> state.</p>
         */
        @NameInMap("ClientErrorUuidList")
        public java.util.List<String> clientErrorUuidList;

        /**
         * <p>The status of the anti-ransomware client. Valid values:</p>
         * <ul>
         * <li><p><strong>running</strong>: Normal.</p>
         * </li>
         * <li><p><strong>exception</strong>: Abnormal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The number of clients in the Normal state.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HealthClientCount")
        public Integer healthClientCount;

        /**
         * <p>The list of UUIDs of clients in the <strong>healthy</strong> state.</p>
         */
        @NameInMap("HealthClientUuidList")
        public java.util.List<String> healthClientUuidList;

        /**
         * <p>The ID of the anti-ransomware mitigation policy.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The most recent time when the anti-ransomware mitigation policy status was updated, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1719488535027</p>
         */
        @NameInMap("LastStatusSyncTime")
        public Long lastStatusSyncTime;

        /**
         * <p>The name of the anti-ransomware mitigation policy.</p>
         * 
         * <strong>example:</strong>
         * <p>SecurityStrategy-20200303</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The content of the anti-ransomware mitigation policy. This parameter is in JSON format. The following fields are included:</p>
         * <ul>
         * <li><strong>IsDefault</strong>: The type of the mitigation policy. Valid values:<ul>
         * <li><strong>1</strong>: recommended policy</li>
         * <li><strong>0</strong>: custom policy</li>
         * </ul>
         * </li>
         * <li><strong>Include</strong>: The file types to protect. If all file types are protected, this parameter is set to [].</li>
         * <li><strong>Source</strong>: The server folders to protect. If all folders need to be protected, this parameter is set to [].</li>
         * <li><strong>ExcludeSystemPath</strong>: Specifies whether to exclude specified folders. To exclude folders, set this parameter to <strong>true</strong>. If you do not want to exclude folders, you do not need to set this parameter.</li>
         * <li><strong>Exclude</strong>: The specified protection folder addresses. If no specific protection folder address is set, this parameter is set to [].</li>
         * <li><strong>Schedule</strong>: The execution time and interval of the data backup node. Specify a non-peak hour that is not on the hour. Examples:<ul>
         * <li>Example 1: I|1583216092|P21D indicates that data backup starts at 2020-03-03 14:14:52, and the backup policy executes at an interval of 3 weeks.</li>
         * <li>Example 2: I|1583216092|PT24H indicates that data backup starts at 2020-03-03 14:14:52, and the backup policy executes at an interval of 24 hours.</li>
         * </ul>
         * </li>
         * <li><strong>Retention</strong>: The retention period of backup data, in days. 7 indicates 1 week, 365 indicates 1 year, and -1 indicates permanent retention.</li>
         * <li><strong>SpeedLimiter</strong>: The backup network bandwidth throttling. For example, 0:24:30720 indicates that the backup network bandwidth throttling is 30 MB/s from 00:00 to 24:00.</li>
         * <li><strong>UseVss</strong>: Specifies whether to enable the VSS (Windows) feature. Valid values:<ul>
         * <li><strong>true</strong>: enabled</li>
         * <li><strong>false</strong>: not enabled</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The VSS (Windows) feature is available only for Windows systems. After this feature is enabled, it effectively reduces the issue of individual file backup failures caused by process occupation. Enable this feature. After this feature is enabled, file backup for exFAT and FAT32 disk formats is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Exclude&quot;:[&quot;/bin/&quot;,&quot;/usr/bin/&quot;,&quot;/sbin/&quot;,&quot;/boot/&quot;,&quot;/proc/&quot;,&quot;/sys/&quot;,&quot;/srv/&quot;,&quot;/lib/&quot;,&quot;/selinux/&quot;,&quot;/usr/sbin/&quot;,&quot;/run/&quot;,&quot;/lib32/&quot;,&quot;/lib64/&quot;,&quot;/lost+found/&quot;,&quot;/var/lib/kubelet/&quot;,&quot;/var/lib/ntp/proc&quot;,&quot;/var/lib/container&quot;,&quot;Windows\\&quot;,&quot;Python27\\&quot;,&quot;Program Files (x86)\\&quot;,&quot;Program Files\\&quot;,&quot;Boot\\&quot;,&quot;$RECYCLE.BIN&quot;,&quot;System Volume Information\\&quot;,&quot;Users\\Administrator\\NTUSER.DAT*&quot;,&quot;ProgramData\\&quot;,&quot;pagefile.sys&quot;,&quot;Users\\Default\\NTUSER.DAT*&quot;,&quot;Users\\Administrator\\ntuser.*&quot;],&quot;ExcludeSystemPath&quot;:true,&quot;Include&quot;:[],&quot;IsDefault&quot;:1,&quot;Retention&quot;:7,&quot;Schedule&quot;:&quot;I|1630689360|PT24H&quot;,&quot;Source&quot;:[],&quot;SpeedLimiter&quot;:&quot;&quot;,&quot;UseVss&quot;:true}</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The region ID of the backup service selected when the anti-ransomware client is installed on a non-Alibaba Cloud server.</p>
         * 
         * <strong>example:</strong>
         * <p>ch-hangzhou</p>
         */
        @NameInMap("PolicyRegionId")
        public String policyRegionId;

        /**
         * <p>The version of the mitigation policy. Valid values:</p>
         * <ul>
         * <li>1.0.0.</li>
         * <li>2.0.0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("PolicyVersion")
        public String policyVersion;

        /**
         * <p>The previous status of the anti-ransomware mitigation policy.</p>
         * <ul>
         * <li><p><strong>enabled</strong>: The policy was manually enabled.</p>
         * </li>
         * <li><p><strong>disabled</strong>: The policy was manually disabled. After the policy is disabled, running backup nodes are stopped.</p>
         * </li>
         * <li><p><strong>closed</strong>: The anti-ransomware capacity was exceeded, and the system disabled the policy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("PreStatus")
        public String preStatus;

        /**
         * <p>The list of UUIDs of servers returned after the search by the MachineRemark request parameter.</p>
         */
        @NameInMap("RemarkedUuidList")
        public java.util.List<String> remarkedUuidList;

        /**
         * <p>The method used to select covered assets. Valid values:</p>
         * <ul>
         * <li><strong>ALL_MACHINE</strong>: All assets.</li>
         * </ul>
         * <blockquote>
         * <p>If the policy covers <strong>all assets</strong>, this property value is <strong>ALL_MACHINE</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALL_MACHINE</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        /**
         * <p>The server type. Valid values:</p>
         * <ul>
         * <li><strong>OUT_CLOUD</strong>: Non-Alibaba Cloud server.</li>
         * <li><strong>ALIYUN</strong>: Alibaba Cloud server.</li>
         * <li><strong>TRIPARTITE</strong>: Lightweight application server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OUT_CLOUD</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The number of servers with data backup exceptions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ServiceErrorCount")
        public Integer serviceErrorCount;

        /**
         * <p>The list of UUIDs of servers with data backup exceptions.</p>
         */
        @NameInMap("ServiceErrorUuidList")
        public java.util.List<String> serviceErrorUuidList;

        /**
         * <p>The status of the anti-ransomware mitigation policy.</p>
         * <ul>
         * <li><p><strong>enabled</strong>: The policy is manually enabled.</p>
         * </li>
         * <li><p><strong>disabled</strong>: The policy is manually disabled. After the policy is disabled, running backup nodes are stopped.</p>
         * </li>
         * <li><p><strong>closed</strong>: The anti-ransomware capacity is exceeded, and the system disables the policy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The upgrade status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>NotUpgraded</strong>: Not upgraded.</li>
         * <li><strong>Upgrading</strong>: Upgrading.</li>
         * <li><strong>UpgradeFailed</strong>: Upgrade failed.</li>
         * <li><strong>UpgradeSuccess</strong>: Upgrade succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Upgrading</p>
         */
        @NameInMap("UpgradeStatus")
        public String upgradeStatus;

        /**
         * <p>The list of UUIDs of servers protected by the anti-ransomware mitigation policy.</p>
         */
        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

        public static DescribeBackupPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupPoliciesResponseBodyPolicies self = new DescribeBackupPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeBackupPoliciesResponseBodyPolicies setClientErrorCount(Integer clientErrorCount) {
            this.clientErrorCount = clientErrorCount;
            return this;
        }
        public Integer getClientErrorCount() {
            return this.clientErrorCount;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setClientErrorUuidList(java.util.List<String> clientErrorUuidList) {
            this.clientErrorUuidList = clientErrorUuidList;
            return this;
        }
        public java.util.List<String> getClientErrorUuidList() {
            return this.clientErrorUuidList;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setHealthClientCount(Integer healthClientCount) {
            this.healthClientCount = healthClientCount;
            return this;
        }
        public Integer getHealthClientCount() {
            return this.healthClientCount;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setHealthClientUuidList(java.util.List<String> healthClientUuidList) {
            this.healthClientUuidList = healthClientUuidList;
            return this;
        }
        public java.util.List<String> getHealthClientUuidList() {
            return this.healthClientUuidList;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setLastStatusSyncTime(Long lastStatusSyncTime) {
            this.lastStatusSyncTime = lastStatusSyncTime;
            return this;
        }
        public Long getLastStatusSyncTime() {
            return this.lastStatusSyncTime;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setPolicyRegionId(String policyRegionId) {
            this.policyRegionId = policyRegionId;
            return this;
        }
        public String getPolicyRegionId() {
            return this.policyRegionId;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setPolicyVersion(String policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setPreStatus(String preStatus) {
            this.preStatus = preStatus;
            return this;
        }
        public String getPreStatus() {
            return this.preStatus;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setRemarkedUuidList(java.util.List<String> remarkedUuidList) {
            this.remarkedUuidList = remarkedUuidList;
            return this;
        }
        public java.util.List<String> getRemarkedUuidList() {
            return this.remarkedUuidList;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setServiceErrorCount(Integer serviceErrorCount) {
            this.serviceErrorCount = serviceErrorCount;
            return this;
        }
        public Integer getServiceErrorCount() {
            return this.serviceErrorCount;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setServiceErrorUuidList(java.util.List<String> serviceErrorUuidList) {
            this.serviceErrorUuidList = serviceErrorUuidList;
            return this;
        }
        public java.util.List<String> getServiceErrorUuidList() {
            return this.serviceErrorUuidList;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setUpgradeStatus(String upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        public DescribeBackupPoliciesResponseBodyPolicies setUuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

    }

}
