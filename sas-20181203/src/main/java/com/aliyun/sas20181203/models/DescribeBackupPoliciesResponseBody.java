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
     * <p>An array that consists of the anti-ransomware policies returned.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribeBackupPoliciesResponseBodyPolicies> policies;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
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
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: 10.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of anti-ransomware policies returned.</p>
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
         * <p>The number of the servers on which the anti-ransomware agent is in an abnormal state.</p>
         */
        @NameInMap("ClientErrorCount")
        public Integer clientErrorCount;

        /**
         * <p>The UUIDs of the servers on which the anti-ransomware agent is in an **abnormal** state.</p>
         */
        @NameInMap("ClientErrorUuidList")
        public java.util.List<String> clientErrorUuidList;

        /**
         * <p>The status of the anti-ransomware agent. Valid values:</p>
         * <br>
         * <p>*   **running**: normal</p>
         * <p>*   **exception**: abnormal</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The number of the servers on which the anti-ransomware agent is in a normal state.</p>
         */
        @NameInMap("HealthClientCount")
        public Integer healthClientCount;

        /**
         * <p>The UUIDs of the servers on which the anti-ransomware agent is in a **normal** state.</p>
         */
        @NameInMap("HealthClientUuidList")
        public java.util.List<String> healthClientUuidList;

        /**
         * <p>The ID of the anti-ransomware policy.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the anti-ransomware policy.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configurations of the anti-ransomware policy. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <br>
         * <p>*   **IsDefault**: the type of the anti-ransomware policy. Valid values:</p>
         * <br>
         * <p>    *   **1**: recommended policy</p>
         * <p>    *   **0**: custom policy</p>
         * <br>
         * <p>*   **Include**: the format of the files that are protected. If the value of this field is [], all formats of files are protected.</p>
         * <br>
         * <p>*   **Source**: the directory that is protected. If the value of this field is [], all directories are protected.</p>
         * <br>
         * <p>*   **ExcludeSystemPath**: indicates whether a specified directory is excluded from the anti-ransomware policy. If the value of this field is **true**, the directory is excluded. If this field is left empty, no directories are excluded.</p>
         * <br>
         * <p>*   **Exclude**: the directory that is excluded from the anti-ransomware policy. If no directory is specified, the value of this field is [].</p>
         * <br>
         * <p>*   **Schedule**: the start time and interval of a data backup task. A start time that begins during off-peak hours but does not start on the hour is recommended. Examples:</p>
         * <br>
         * <p>    *   If the value of this field is I|1583216092|P21D, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of three weeks.</p>
         * <p>    *   If the value of this field is I|1583216092|PT24H, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of 24 hours.</p>
         * <br>
         * <p>*   **Retention**: the period during which backup data is retained. Unit: days. If the value of this field is 7, backup data is retained for a week. If the value of this field is 365, backup data is retained for a year. If the value of this field is -1, backup data is permanently retained.</p>
         * <br>
         * <p>*   **SpeedLimiter**: the limit on the network bandwidth for data backup tasks. If the value of this field is 0:24:30720, the maximum bandwidth for a data backup task is 30 MB/s from 00:00 to 24:00.</p>
         * <br>
         * <p>*   **UseVss**: indicates whether the VSS feature is enabled. The feature is available only for Windows servers. Valid values:</p>
         * <br>
         * <p>    *   **true**: yes</p>
         * <p>    *   **false**: no</p>
         * <br>
         * <p>>  The VSS feature is available only if you create the anti-ransomware policy for Windows servers. After you enable the feature, the number of backup failures due to running processes is significantly reduced. We recommend that you enable the VSS feature. After you enable the feature, the data of disks that are in the exFAT and FAT32 formats cannot be backed up.</p>
         */
        @NameInMap("Policy")
        public String policy;

        /**
         * <p>The ID of the region that you specified for data backup when you installed the anti-ransomware agent for the server not deployed on Alibaba Cloud.</p>
         */
        @NameInMap("PolicyRegionId")
        public String policyRegionId;

        /**
         * <p>The version of the anti-ransomware policy. Valid values:</p>
         * <br>
         * <p>*   1.0.0</p>
         * <p>*   2.0.0</p>
         */
        @NameInMap("PolicyVersion")
        public String policyVersion;

        /**
         * <p>The UUIDs that are returned based on the value of the MachineRemark request parameter.</p>
         */
        @NameInMap("RemarkedUuidList")
        public java.util.List<String> remarkedUuidList;

        /**
         * <p>The type of the server. Valid values:</p>
         * <br>
         * <p>*   **OUT_CLOUD**: server not deployed on Alibaba Cloud</p>
         * <p>*   **ALIYUN**: Elastic Compute Service (ECS) instance</p>
         * <p>*   **TRIPARTITE**: simple application server</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The number of servers on which data backup is exceptional.</p>
         */
        @NameInMap("ServiceErrorCount")
        public Integer serviceErrorCount;

        /**
         * <p>The UUIDs of the servers on which data backup is exceptional.</p>
         */
        @NameInMap("ServiceErrorUuidList")
        public java.util.List<String> serviceErrorUuidList;

        /**
         * <p>The status of the anti-ransomware policy. Valid values:</p>
         * <br>
         * <p>*   **enabled**: The anti-ransomware policy is manually enabled.</p>
         * <p>*   **disabled**: The anti-ransomware policy is manually disabled. After an anti-ransomware policy is disabled, the data backup task that is running based on the policy stops.</p>
         * <p>*   **closed**: The anti-ransomware policy automatically stops because the anti-ransomware capacity is insufficient.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The upgrade status of the anti-ransomware policy. Valid values:</p>
         * <br>
         * <p>*   **NotUpgraded**</p>
         * <p>*   **Upgrading**</p>
         * <p>*   **UpgradeFailed**</p>
         * <p>*   **UpgradeSuccess**</p>
         */
        @NameInMap("UpgradeStatus")
        public String upgradeStatus;

        /**
         * <p>The UUIDs of the servers to which the anti-ransomware policy is applied.</p>
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

        public DescribeBackupPoliciesResponseBodyPolicies setRemarkedUuidList(java.util.List<String> remarkedUuidList) {
            this.remarkedUuidList = remarkedUuidList;
            return this;
        }
        public java.util.List<String> getRemarkedUuidList() {
            return this.remarkedUuidList;
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
