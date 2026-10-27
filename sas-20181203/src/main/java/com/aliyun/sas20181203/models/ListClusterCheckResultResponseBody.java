// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterCheckResultResponseBody extends TeaModel {
    /**
     * <p>The check result information.</p>
     */
    @NameInMap("Checks")
    public java.util.List<ListClusterCheckResultResponseBodyChecks> checks;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListClusterCheckResultResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DDCAE1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClusterCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterCheckResultResponseBody self = new ListClusterCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterCheckResultResponseBody setChecks(java.util.List<ListClusterCheckResultResponseBodyChecks> checks) {
        this.checks = checks;
        return this;
    }
    public java.util.List<ListClusterCheckResultResponseBodyChecks> getChecks() {
        return this.checks;
    }

    public ListClusterCheckResultResponseBody setPageInfo(ListClusterCheckResultResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListClusterCheckResultResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListClusterCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClusterCheckResultResponseBodyChecksCheckPolicies extends TeaModel {
        /**
         * <p>The ID of the regulation for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RequirementId")
        public Long requirementId;

        /**
         * <p>The display name of the regulation for the check item.</p>
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
         * <p>The ID of the standard for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StandardId")
        public Long standardId;

        /**
         * <p>The display name of the standard for the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Best security practices</p>
         */
        @NameInMap("StandardShowName")
        public String standardShowName;

        public static ListClusterCheckResultResponseBodyChecksCheckPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListClusterCheckResultResponseBodyChecksCheckPolicies self = new ListClusterCheckResultResponseBodyChecksCheckPolicies();
            return TeaModel.build(map, self);
        }

        public ListClusterCheckResultResponseBodyChecksCheckPolicies setRequirementId(Long requirementId) {
            this.requirementId = requirementId;
            return this;
        }
        public Long getRequirementId() {
            return this.requirementId;
        }

        public ListClusterCheckResultResponseBodyChecksCheckPolicies setRequirementShowName(String requirementShowName) {
            this.requirementShowName = requirementShowName;
            return this;
        }
        public String getRequirementShowName() {
            return this.requirementShowName;
        }

        public ListClusterCheckResultResponseBodyChecksCheckPolicies setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

        public ListClusterCheckResultResponseBodyChecksCheckPolicies setSectionShowName(String sectionShowName) {
            this.sectionShowName = sectionShowName;
            return this;
        }
        public String getSectionShowName() {
            return this.sectionShowName;
        }

        public ListClusterCheckResultResponseBodyChecksCheckPolicies setStandardId(Long standardId) {
            this.standardId = standardId;
            return this;
        }
        public Long getStandardId() {
            return this.standardId;
        }

        public ListClusterCheckResultResponseBodyChecksCheckPolicies setStandardShowName(String standardShowName) {
            this.standardShowName = standardShowName;
            return this;
        }
        public String getStandardShowName() {
            return this.standardShowName;
        }

    }

    public static class ListClusterCheckResultResponseBodyChecks extends TeaModel {
        /**
         * <p>The subtype of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The asset type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The standards, regulations, and sections associated with the check result.</p>
         */
        @NameInMap("CheckPolicies")
        public java.util.List<ListClusterCheckResultResponseBodyChecksCheckPolicies> checkPolicies;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS-PublicReadOpenManifestFileWithoutEncryption</p>
         */
        @NameInMap("CheckShowName")
        public String checkShowName;

        /**
         * <p>The source type of the Threat Detection Service check item. Valid values:</p>
         * <ul>
         * <li><strong>CUSTOM</strong>: Custom.</li>
         * <li><strong>SYSTEM</strong>: Predefined by the Threat Detection Service platform.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("CheckType")
        public String checkType;

        /**
         * <p>The asset subtype of the cloud service. Valid values:</p>
         * <ul>
         * <li>If <strong>InstanceType</strong> is set to <strong>ECS</strong>, valid values are:<ul>
         * <li><strong>INSTANCE</strong></li>
         * <li><strong>DISK</strong></li>
         * <li><strong>SECURITY_GROUP</strong></li>
         * </ul>
         * </li>
         * <li>If <strong>InstanceType</strong> is set to <strong>ACR</strong>, valid values are:<ul>
         * <li><strong>REPOSITORY_ENTERPRISE</strong></li>
         * <li><strong>REPOSITORY_PERSON</strong></li>
         * </ul>
         * </li>
         * <li>If <strong>InstanceType</strong> is set to <strong>RAM</strong>, valid values are:<ul>
         * <li><strong>ALIAS</strong></li>
         * <li><strong>USER</strong></li>
         * <li><strong>POLICY</strong></li>
         * <li><strong>GROUP</strong></li>
         * </ul>
         * </li>
         * <li>If <strong>InstanceType</strong> is set to <strong>WAF</strong>, valid values are:<ul>
         * <li><strong>DOMAIN</strong></li>
         * </ul>
         * </li>
         * <li>If <strong>InstanceType</strong> is set to other values, valid values are:<ul>
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
         * <p>The asset type of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>Workload</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The timestamp of the latest check. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1657793398000</p>
         */
        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        /**
         * <p>The risk level of the check item. Valid values:</p>
         * <ul>
         * <li><strong>HIGH</strong>: High.</li>
         * <li><strong>MEDIUM</strong>: Medium.</li>
         * <li><strong>LOW</strong>: Low.</li>
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
         * <li><strong>PASS</strong>: Passed.</li>
         * <li><strong>NOT_PASS</strong>: Failed.</li>
         * <li><strong>CHECKING</strong>: Checking.</li>
         * <li><strong>NOT_CHECK</strong>: Not checked.</li>
         * <li><strong>WHITELIST</strong>: Whitelisted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Specifies whether the check depends on the TRIAL permission.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TrialPermission")
        public Boolean trialPermission;

        /**
         * <p>Specifies whether the check item requires enabling data delivery for ActionTrail for more than 30 days to build a behavior baseline. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Yes.</li>
         * <li><strong>0</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrialPermissionType")
        public Integer trialPermissionType;

        /**
         * <p>The vendor of the asset. Valid values:</p>
         * <p>0: Alibaba Cloud.
         * 3: Other cloud.
         * 4: Other cloud.
         * 5: Other cloud.
         * 7: Other cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static ListClusterCheckResultResponseBodyChecks build(java.util.Map<String, ?> map) throws Exception {
            ListClusterCheckResultResponseBodyChecks self = new ListClusterCheckResultResponseBodyChecks();
            return TeaModel.build(map, self);
        }

        public ListClusterCheckResultResponseBodyChecks setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public ListClusterCheckResultResponseBodyChecks setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListClusterCheckResultResponseBodyChecks setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ListClusterCheckResultResponseBodyChecks setCheckPolicies(java.util.List<ListClusterCheckResultResponseBodyChecksCheckPolicies> checkPolicies) {
            this.checkPolicies = checkPolicies;
            return this;
        }
        public java.util.List<ListClusterCheckResultResponseBodyChecksCheckPolicies> getCheckPolicies() {
            return this.checkPolicies;
        }

        public ListClusterCheckResultResponseBodyChecks setCheckShowName(String checkShowName) {
            this.checkShowName = checkShowName;
            return this;
        }
        public String getCheckShowName() {
            return this.checkShowName;
        }

        public ListClusterCheckResultResponseBodyChecks setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public ListClusterCheckResultResponseBodyChecks setInstanceSubType(String instanceSubType) {
            this.instanceSubType = instanceSubType;
            return this;
        }
        public String getInstanceSubType() {
            return this.instanceSubType;
        }

        public ListClusterCheckResultResponseBodyChecks setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListClusterCheckResultResponseBodyChecks setLastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public Long getLastCheckTime() {
            return this.lastCheckTime;
        }

        public ListClusterCheckResultResponseBodyChecks setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListClusterCheckResultResponseBodyChecks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClusterCheckResultResponseBodyChecks setTrialPermission(Boolean trialPermission) {
            this.trialPermission = trialPermission;
            return this;
        }
        public Boolean getTrialPermission() {
            return this.trialPermission;
        }

        public ListClusterCheckResultResponseBodyChecks setTrialPermissionType(Integer trialPermissionType) {
            this.trialPermissionType = trialPermissionType;
            return this;
        }
        public Integer getTrialPermissionType() {
            return this.trialPermissionType;
        }

        public ListClusterCheckResultResponseBodyChecks setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class ListClusterCheckResultResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of data entries displayed on the current page during paging in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the current page during paging in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of alerting events to display on each page during paging in a paged query. Default value: <strong>20</strong>, which indicates that 20 alerting events are displayed on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListClusterCheckResultResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListClusterCheckResultResponseBodyPageInfo self = new ListClusterCheckResultResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListClusterCheckResultResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListClusterCheckResultResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListClusterCheckResultResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListClusterCheckResultResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
