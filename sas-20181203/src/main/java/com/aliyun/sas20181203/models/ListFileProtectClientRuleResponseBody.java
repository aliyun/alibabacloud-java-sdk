// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectClientRuleResponseBody extends TeaModel {
    @NameInMap("FileProtectList")
    public java.util.List<ListFileProtectClientRuleResponseBodyFileProtectList> fileProtectList;

    @NameInMap("PageInfo")
    public ListFileProtectClientRuleResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>BA674E4B-00CF-5DEA-8B92-360862FB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFileProtectClientRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectClientRuleResponseBody self = new ListFileProtectClientRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileProtectClientRuleResponseBody setFileProtectList(java.util.List<ListFileProtectClientRuleResponseBodyFileProtectList> fileProtectList) {
        this.fileProtectList = fileProtectList;
        return this;
    }
    public java.util.List<ListFileProtectClientRuleResponseBodyFileProtectList> getFileProtectList() {
        return this.fileProtectList;
    }

    public ListFileProtectClientRuleResponseBody setPageInfo(ListFileProtectClientRuleResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListFileProtectClientRuleResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListFileProtectClientRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFileProtectClientRuleResponseBodyFileProtectList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlertLevel")
        public Integer alertLevel;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("EffectInstanceCount")
        public Long effectInstanceCount;

        @NameInMap("ExcludeUsers")
        public java.util.List<String> excludeUsers;

        @NameInMap("FileOps")
        public java.util.List<String> fileOps;

        @NameInMap("FilePaths")
        public java.util.List<String> filePaths;

        @NameInMap("FileTypes")
        public java.util.List<String> fileTypes;

        /**
         * <strong>example:</strong>
         * <p>1682304179000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1682304179000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1412511</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        @NameInMap("ProcPaths")
        public java.util.List<String> procPaths;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        /**
         * <strong>example:</strong>
         * <p>test11</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>FILE_PROTECT_RULE_SWITCH_TYPE_******</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        public static ListFileProtectClientRuleResponseBodyFileProtectList build(java.util.Map<String, ?> map) throws Exception {
            ListFileProtectClientRuleResponseBodyFileProtectList self = new ListFileProtectClientRuleResponseBodyFileProtectList();
            return TeaModel.build(map, self);
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setAlertLevel(Integer alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setEffectInstanceCount(Long effectInstanceCount) {
            this.effectInstanceCount = effectInstanceCount;
            return this;
        }
        public Long getEffectInstanceCount() {
            return this.effectInstanceCount;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setExcludeUsers(java.util.List<String> excludeUsers) {
            this.excludeUsers = excludeUsers;
            return this;
        }
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setFileOps(java.util.List<String> fileOps) {
            this.fileOps = fileOps;
            return this;
        }
        public java.util.List<String> getFileOps() {
            return this.fileOps;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setFilePaths(java.util.List<String> filePaths) {
            this.filePaths = filePaths;
            return this;
        }
        public java.util.List<String> getFilePaths() {
            return this.filePaths;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setFileTypes(java.util.List<String> fileTypes) {
            this.fileTypes = fileTypes;
            return this;
        }
        public java.util.List<String> getFileTypes() {
            return this.fileTypes;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setProcPaths(java.util.List<String> procPaths) {
            this.procPaths = procPaths;
            return this;
        }
        public java.util.List<String> getProcPaths() {
            return this.procPaths;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListFileProtectClientRuleResponseBodyFileProtectList setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

    }

    public static class ListFileProtectClientRuleResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFileProtectClientRuleResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFileProtectClientRuleResponseBodyPageInfo self = new ListFileProtectClientRuleResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListFileProtectClientRuleResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListFileProtectClientRuleResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileProtectClientRuleResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
