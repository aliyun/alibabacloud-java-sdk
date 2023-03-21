// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckResultResponseBody extends TeaModel {
    @NameInMap("Checks")
    public java.util.List<ListCheckResultResponseBodyChecks> checks;

    @NameInMap("PageInfo")
    public ListCheckResultResponseBodyPageInfo pageInfo;

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
        @NameInMap("RequirementId")
        public Long requirementId;

        @NameInMap("RequirementShowName")
        public String requirementShowName;

        @NameInMap("SectionId")
        public Long sectionId;

        @NameInMap("SectionShowName")
        public String sectionShowName;

        @NameInMap("StandardId")
        public Long standardId;

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
        @NameInMap("CheckId")
        public Long checkId;

        @NameInMap("CheckPolicies")
        public java.util.List<ListCheckResultResponseBodyChecksCheckPolicies> checkPolicies;

        @NameInMap("CheckShowName")
        public String checkShowName;

        @NameInMap("InstanceSubType")
        public String instanceSubType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TrialPermission")
        public Boolean trialPermission;

        @NameInMap("Vendor")
        public String vendor;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
