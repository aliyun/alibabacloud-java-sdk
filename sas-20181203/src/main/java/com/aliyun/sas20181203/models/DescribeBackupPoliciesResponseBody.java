// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupPoliciesResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeBackupPoliciesResponseBodyPageInfo pageInfo;

    // An array that consists of the anti-ransomware policies returned.
    @NameInMap("Policies")
    public java.util.List<DescribeBackupPoliciesResponseBodyPolicies> policies;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: 10.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of anti-ransomware policies returned.
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
        // The number of the servers on which the anti-ransomware agent is in an abnormal state.
        @NameInMap("ClientErrorCount")
        public Integer clientErrorCount;

        // The UUIDs of the servers on which the anti-ransomware agent is in an **abnormal** state.
        @NameInMap("ClientErrorUuidList")
        public java.util.List<String> clientErrorUuidList;

        // The status of the anti-ransomware agent. Valid values:
        // 
        // *   **running**: normal
        // *   **exception**: abnormal
        @NameInMap("ClientStatus")
        public String clientStatus;

        // The number of the servers on which the anti-ransomware agent is in a normal state.
        @NameInMap("HealthClientCount")
        public Integer healthClientCount;

        // The UUIDs of the servers on which the anti-ransomware agent is in a **normal** state.
        @NameInMap("HealthClientUuidList")
        public java.util.List<String> healthClientUuidList;

        // The ID of the anti-ransomware policy.
        @NameInMap("Id")
        public Long id;

        // The name of the anti-ransomware policy.
        @NameInMap("Name")
        public String name;

        // The configurations of the anti-ransomware policy. The value of this parameter is in the JSON format and contains the following fields:
        // 
        // *   **IsDefault**: the type of the anti-ransomware policy. Valid values:
        // 
        //     *   **1**: recommended policy
        //     *   **0**: custom policy
        // 
        // *   **Include**: the format of the files that are protected. If the value of this field is \[], all formats of files are protected.
        // 
        // *   **Source**: the directory that is protected. If the value of this field is \[], all directories are protected.
        // 
        // *   **ExcludeSystemPath**: indicates whether a specified directory is excluded from the anti-ransomware policy. If the value of this field is **true**, the directory is excluded. If this field is left empty, no directories are excluded.
        // 
        // *   **Exclude**: the directory that is excluded from the anti-ransomware policy. If no directory is specified, the value of this field is \[].
        // 
        // *   **Schedule**: the start time and interval of a data backup task. A start time that begins during off-peak hours but does not start on the hour is recommended. Examples:
        // 
        //     *   If the value of this field is I|1583216092|P21D, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of three weeks.
        //     *   If the value of this field is I|1583216092|PT24H, the data backup task starts from 2020-03-03 14:14:52, and the task is run at an interval of 24 hours.
        // 
        // *   **Retention**: the period during which backup data is retained. Unit: days. If the value of this field is 7, backup data is retained for a week. If the value of this field is 365, backup data is retained for a year. If the value of this field is -1, backup data is permanently retained.
        // 
        // *   **SpeedLimiter**: the limit on the network bandwidth for data backup tasks. If the value of this field is 0:24:30720, the maximum bandwidth for a data backup task is 30 MB/s from 00:00 to 24:00.
        // 
        // *   **UseVss**: indicates whether the VSS feature is enabled. The feature is available only for Windows servers. Valid values:
        // 
        //     *   **true**: yes
        //     *   **false**: no
        // 
        // >  The VSS feature is available only if you create the anti-ransomware policy for Windows servers. After you enable the feature, the number of backup failures due to running processes is significantly reduced. We recommend that you enable the VSS feature. After you enable the feature, the data of disks that are in the exFAT and FAT32 formats cannot be backed up.
        @NameInMap("Policy")
        public String policy;

        // The ID of the region that you specified for data backup when you installed the anti-ransomware agent for the server not deployed on Alibaba Cloud.
        @NameInMap("PolicyRegionId")
        public String policyRegionId;

        // The version of the anti-ransomware policy. Valid values:
        // 
        // *   1.0.0
        // *   2.0.0
        @NameInMap("PolicyVersion")
        public String policyVersion;

        // The UUIDs that are returned based on the value of the MachineRemark request parameter.
        @NameInMap("RemarkedUuidList")
        public java.util.List<String> remarkedUuidList;

        // The type of the server. Valid values:
        // 
        // *   **OUT_CLOUD**: server not deployed on Alibaba Cloud
        // *   **ALIYUN**: Elastic Compute Service (ECS) instance
        // *   **TRIPARTITE**: simple application server
        @NameInMap("ServerType")
        public String serverType;

        // The number of servers on which data backup is exceptional.
        @NameInMap("ServiceErrorCount")
        public Integer serviceErrorCount;

        // The UUIDs of the servers on which data backup is exceptional.
        @NameInMap("ServiceErrorUuidList")
        public java.util.List<String> serviceErrorUuidList;

        // The status of the anti-ransomware policy. Valid values:
        // 
        // *   **enabled**: The anti-ransomware policy is manually enabled.
        // *   **disabled**: The anti-ransomware policy is manually disabled. After an anti-ransomware policy is disabled, the data backup task that is running based on the policy stops.
        // *   **closed**: The anti-ransomware policy automatically stops because the anti-ransomware capacity is insufficient.
        @NameInMap("Status")
        public String status;

        // The upgrade status of the anti-ransomware policy. Valid values:
        // 
        // *   **NotUpgraded**
        // *   **Upgrading**
        // *   **UpgradeFailed**
        // *   **UpgradeSuccess**
        @NameInMap("UpgradeStatus")
        public String upgradeStatus;

        // The UUIDs of the servers to which the anti-ransomware policy is applied.
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
