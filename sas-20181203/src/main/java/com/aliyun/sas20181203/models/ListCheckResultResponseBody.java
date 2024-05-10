// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckResultResponseBody extends TeaModel {
    /**
     * <p>The information about the check items.</p>
     */
    @NameInMap("Checks")
    public java.util.List<ListCheckResultResponseBodyChecks> checks;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListCheckResultResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckResultResponseBody self = new ListCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckResultResponseBody setChecks(java.util.List<ListCheckResultResponseBodyChecks> checks) {
        this.checks = checks;
        return this;
    }
    public java.util.List<ListCheckResultResponseBodyChecks> getChecks() {
        return this.checks;
    }

    public ListCheckResultResponseBody setPageInfo(ListCheckResultResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCheckResultResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCheckResultResponseBodyChecksCheckPolicies extends TeaModel {
        /**
         * <p>The ID of the requirement item for the check item.</p>
         */
        @NameInMap("RequirementId")
        public Long requirementId;

        /**
         * <p>The display name of the requirement item for the check item.</p>
         */
        @NameInMap("RequirementShowName")
        public String requirementShowName;

        /**
         * <p>The ID of the section for the check item.</p>
         */
        @NameInMap("SectionId")
        public Long sectionId;

        /**
         * <p>The display name of the section for the check item.</p>
         */
        @NameInMap("SectionShowName")
        public String sectionShowName;

        /**
         * <p>The standard ID of the check item.</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <p>The standard display name of the check item.</p>
         */
        @NameInMap("StandardShowName")
        public String standardShowName;

        public static ListCheckResultResponseBodyChecksCheckPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListCheckResultResponseBodyChecksCheckPolicies self = new ListCheckResultResponseBodyChecksCheckPolicies();
            return TeaModel.build(map, self);
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setRequirementId(Long requirementId) {
            this.requirementId = requirementId;
            return this;
        }
        public Long getRequirementId() {
            return this.requirementId;
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setRequirementShowName(String requirementShowName) {
            this.requirementShowName = requirementShowName;
            return this;
        }
        public String getRequirementShowName() {
            return this.requirementShowName;
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setSectionShowName(String sectionShowName) {
            this.sectionShowName = sectionShowName;
            return this;
        }
        public String getSectionShowName() {
            return this.sectionShowName;
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public ListCheckResultResponseBodyChecksCheckPolicies setStandardShowName(String standardShowName) {
            this.standardShowName = standardShowName;
            return this;
        }
        public String getStandardShowName() {
            return this.standardShowName;
        }

    }

    public static class ListCheckResultResponseBodyChecks extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The check policies.</p>
         */
        @NameInMap("CheckPolicies")
        public java.util.List<ListCheckResultResponseBodyChecksCheckPolicies> checkPolicies;

        @NameInMap("CheckSaleType")
        public Integer checkSaleType;

        /**
         * <p>The name of the check item.</p>
         */
        @NameInMap("CheckShowName")
        public String checkShowName;

        /**
         * <p>The asset subtype of the cloud service. Valid values:</p>
         * <br>
         * <p>*   If **InstanceType** is set to **ECS**, this parameter supports the following valid values:</p>
         * <br>
         * <p>    *   **INSTANCE**</p>
         * <p>    *   **DISK**</p>
         * <p>    *   **SECURITY_GROUP**</p>
         * <br>
         * <p>*   If **InstanceType** is set to **ACR**, this parameter supports the following valid values:</p>
         * <br>
         * <p>    *   **REPOSITORY_ENTERPRISE**</p>
         * <p>    *   **REPOSITORY_PERSON**</p>
         * <br>
         * <p>*   If **InstanceType** is set to **RAM**, this parameter supports the following valid values:</p>
         * <br>
         * <p>    *   **ALIAS**</p>
         * <p>    *   **USER**</p>
         * <p>    *   **POLICY**</p>
         * <p>    *   **GROUP**</p>
         * <br>
         * <p>*   If **InstanceType** is set to **WAF**, this parameter supports the following valid value:</p>
         * <br>
         * <p>    *   **DOMAIN**</p>
         * <br>
         * <p>*   If **InstanceType** is set to other values, this parameter supports the following valid value:</p>
         * <br>
         * <p>    *   **INSTANCE**</p>
         */
        @NameInMap("InstanceSubType")
        public String instanceSubType;

        /**
         * <p>The asset type of the cloud service. Valid values:</p>
         * <br>
         * <p>*   **ECS**: ECS</p>
         * <p>*   **SLB**: SLB</p>
         * <p>*   **RDS**: ApsaraDB RDS</p>
         * <p>*   **MONGODB**: MongoDB</p>
         * <p>*   **KVSTORE**: Redis</p>
         * <p>*   **ACR**: Container Registry</p>
         * <p>*   **CSK**: ACK</p>
         * <p>*   **VPC**: VPC</p>
         * <p>*   **ACTIONTRAIL**: ActionTrail</p>
         * <p>*   **CDN**: CDN</p>
         * <p>*   **CAS**: Certificate Management Service (formerly SSL Certificates Service)</p>
         * <p>*   **RDC**: Apsara Devops</p>
         * <p>*   **RAM**: RAM</p>
         * <p>*   **DDOS**: Anti-DDoS</p>
         * <p>*   **WAF**: WAF</p>
         * <p>*   **OSS**: OSS</p>
         * <p>*   **POLARDB**: PolarDB</p>
         * <p>*   **POSTGRESQL**: ApsaraDB RDS for PostgreSQL</p>
         * <p>*   **MSE**: MSE</p>
         * <p>*   **NAS**: NAS</p>
         * <p>*   **SDDP**: SDDP</p>
         * <p>*   **EIP**: EIP</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The timestamp when the last check was performed. Unit: milliseconds.</p>
         */
        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        /**
         * <p>The risk level of the check item. Valid values:</p>
         * <br>
         * <p>*   **HIGH**</p>
         * <p>*   **MEDIUM**</p>
         * <p>*   **LOW**</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The status of the check item. Valid values:</p>
         * <br>
         * <p>*   **PASS**: passed</p>
         * <p>*   **NOT_PASS**: failed</p>
         * <p>*   **CHECKING**: being checked</p>
         * <p>*   **NOT_CHECK**: not checked</p>
         * <p>*   **WHITELIST**: added to the whitelist</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The message returned if the status of the check item is abnormal.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The ID of the check task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Indicates whether the TRIAL permission is required.</p>
         */
        @NameInMap("TrialPermission")
        public Boolean trialPermission;

        /**
         * <p>The cloud service provider.</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        /**
         * <p>The name of the cloud service provider.</p>
         */
        @NameInMap("VendorShowName")
        public String vendorShowName;

        public static ListCheckResultResponseBodyChecks build(java.util.Map<String, ?> map) throws Exception {
            ListCheckResultResponseBodyChecks self = new ListCheckResultResponseBodyChecks();
            return TeaModel.build(map, self);
        }

        public ListCheckResultResponseBodyChecks setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ListCheckResultResponseBodyChecks setCheckPolicies(java.util.List<ListCheckResultResponseBodyChecksCheckPolicies> checkPolicies) {
            this.checkPolicies = checkPolicies;
            return this;
        }
        public java.util.List<ListCheckResultResponseBodyChecksCheckPolicies> getCheckPolicies() {
            return this.checkPolicies;
        }

        public ListCheckResultResponseBodyChecks setCheckSaleType(Integer checkSaleType) {
            this.checkSaleType = checkSaleType;
            return this;
        }
        public Integer getCheckSaleType() {
            return this.checkSaleType;
        }

        public ListCheckResultResponseBodyChecks setCheckShowName(String checkShowName) {
            this.checkShowName = checkShowName;
            return this;
        }
        public String getCheckShowName() {
            return this.checkShowName;
        }

        public ListCheckResultResponseBodyChecks setInstanceSubType(String instanceSubType) {
            this.instanceSubType = instanceSubType;
            return this;
        }
        public String getInstanceSubType() {
            return this.instanceSubType;
        }

        public ListCheckResultResponseBodyChecks setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListCheckResultResponseBodyChecks setLastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public Long getLastCheckTime() {
            return this.lastCheckTime;
        }

        public ListCheckResultResponseBodyChecks setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListCheckResultResponseBodyChecks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCheckResultResponseBodyChecks setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public ListCheckResultResponseBodyChecks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListCheckResultResponseBodyChecks setTrialPermission(Boolean trialPermission) {
            this.trialPermission = trialPermission;
            return this;
        }
        public Boolean getTrialPermission() {
            return this.trialPermission;
        }

        public ListCheckResultResponseBodyChecks setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListCheckResultResponseBodyChecks setVendorShowName(String vendorShowName) {
            this.vendorShowName = vendorShowName;
            return this;
        }
        public String getVendorShowName() {
            return this.vendorShowName;
        }

    }

    public static class ListCheckResultResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCheckResultResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCheckResultResponseBodyPageInfo self = new ListCheckResultResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCheckResultResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListCheckResultResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCheckResultResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCheckResultResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
