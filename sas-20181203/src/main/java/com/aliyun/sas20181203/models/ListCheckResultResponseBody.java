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
     * 
     * <strong>example:</strong>
     * <p>F9B6DD67-B289-5406-B35C-B0F4A217S23</p>
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
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequirementId")
        public Long requirementId;

        /**
         * <p>The display name of the requirement item for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba cloud OSS best security practices</p>
         */
        @NameInMap("RequirementShowName")
        public String requirementShowName;

        /**
         * <p>The ID of the section for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SectionId")
        public Long sectionId;

        /**
         * <p>The display name of the section for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Log Audit</p>
         */
        @NameInMap("SectionShowName")
        public String sectionShowName;

        /**
         * <p>The standard ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <p>The standard display name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Best security practices</p>
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
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        @NameInMap("AssetType")
        public Integer assetType;

        @NameInMap("AssetVendor")
        public Integer assetVendor;

        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The check policies.</p>
         */
        @NameInMap("CheckPolicies")
        public java.util.List<ListCheckResultResponseBodyChecksCheckPolicies> checkPolicies;

        /**
         * <p>The type of the check item. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: paid</li>
         * <li><strong>1</strong>: free</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckSaleType")
        public Integer checkSaleType;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS-PublicReadOpenManifestFileWithoutEncryption</p>
         */
        @NameInMap("CheckShowName")
        public String checkShowName;

        /**
         * <p>The asset subtype of the cloud service. Valid values:</p>
         * <ul>
         * <li><p>If the <strong>InstanceType</strong> parameter is set to <strong>ECS</strong>, this parameter supports the following valid values:</p>
         * <ul>
         * <li><strong>INSTANCE</strong></li>
         * <li><strong>DISK</strong></li>
         * <li><strong>SECURITY_GROUP</strong></li>
         * </ul>
         * </li>
         * <li><p>If the <strong>InstanceType</strong> parameter is set to <strong>ACR</strong>, this parameter supports the following valid values:</p>
         * <ul>
         * <li><strong>REPOSITORY_ENTERPRISE</strong></li>
         * <li><strong>REPOSITORY_PERSON</strong></li>
         * </ul>
         * </li>
         * <li><p>If the <strong>InstanceType</strong> parameter is set to <strong>RAM</strong>, this parameter supports the following valid values:</p>
         * <ul>
         * <li><strong>ALIAS</strong></li>
         * <li><strong>USER</strong></li>
         * <li><strong>POLICY</strong></li>
         * <li><strong>GROUP</strong></li>
         * </ul>
         * </li>
         * <li><p>If the <strong>InstanceType</strong> parameter is set to <strong>WAF</strong>, this parameter supports the following valid values:</p>
         * <ul>
         * <li><strong>DOMAIN</strong></li>
         * </ul>
         * </li>
         * <li><p>If the <strong>InstanceType</strong> parameter is set to other values, this parameter supports the following valid values:</p>
         * <ul>
         * <li><strong>INSTANCE</strong></li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISK</p>
         */
        @NameInMap("InstanceSubType")
        public String instanceSubType;

        /**
         * <p>The asset type of the cloud service. Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong>: ECS</li>
         * <li><strong>SLB</strong>: SLB</li>
         * <li><strong>RDS</strong>: ApsaraDB RDS</li>
         * <li><strong>MONGODB</strong>: MongoDB</li>
         * <li><strong>KVSTORE</strong>: Redis</li>
         * <li><strong>ACR</strong>: Container Registry</li>
         * <li><strong>CSK</strong>: ACK</li>
         * <li><strong>VPC</strong>: VPC</li>
         * <li><strong>ACTIONTRAIL</strong>: ActionTrail</li>
         * <li><strong>CDN</strong>: CDN</li>
         * <li><strong>CAS</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
         * <li><strong>RDC</strong>: Apsara Devops</li>
         * <li><strong>RAM</strong>: RAM</li>
         * <li><strong>DDOS</strong>: Anti-DDoS</li>
         * <li><strong>WAF</strong>: WAF</li>
         * <li><strong>OSS</strong>: OSS</li>
         * <li><strong>POLARDB</strong>: PolarDB</li>
         * <li><strong>POSTGRESQL</strong>: ApsaraDB RDS for PostgreSQL</li>
         * <li><strong>MSE</strong>: MSE</li>
         * <li><strong>NAS</strong>: NAS</li>
         * <li><strong>SDDP</strong>: SDDP</li>
         * <li><strong>EIP</strong>: EIP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The timestamp when the last check was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1657793398000</p>
         */
        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The risk level of the check item. Valid values:</p>
         * <ul>
         * <li><strong>HIGH</strong></li>
         * <li><strong>MEDIUM</strong></li>
         * <li><strong>LOW</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The status of the check item. Valid values:</p>
         * <ul>
         * <li><strong>PASS</strong>: passed</li>
         * <li><strong>NOT_PASS</strong>: failed</li>
         * <li><strong>CHECKING</strong>: being checked</li>
         * <li><strong>NOT_CHECK</strong>: not checked</li>
         * <li><strong>WHITELIST</strong>: added to the whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The message returned if the status of the check item is abnormal.</p>
         * 
         * <strong>example:</strong>
         * <p>TIMEOUT</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The ID of the check task.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Indicates whether the TRIAL permission is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TrialPermission")
        public Boolean trialPermission;

        /**
         * <p>The cloud service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        /**
         * <p>The name of the cloud service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        @NameInMap("VendorShowName")
        public String vendorShowName;

        public static ListCheckResultResponseBodyChecks build(java.util.Map<String, ?> map) throws Exception {
            ListCheckResultResponseBodyChecks self = new ListCheckResultResponseBodyChecks();
            return TeaModel.build(map, self);
        }

        public ListCheckResultResponseBodyChecks setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public ListCheckResultResponseBodyChecks setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListCheckResultResponseBodyChecks setAssetVendor(Integer assetVendor) {
            this.assetVendor = assetVendor;
            return this;
        }
        public Integer getAssetVendor() {
            return this.assetVendor;
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

        public ListCheckResultResponseBodyChecks setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
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
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
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
         * <p>100</p>
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
