// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectRuleResponseBody extends TeaModel {
    /**
     * <p>The details of returned data.</p>
     */
    @NameInMap("FileProtectList")
    public java.util.List<ListFileProtectRuleResponseBodyFileProtectList> fileProtectList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListFileProtectRuleResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FBBEB173-1F43-505F-A876-C03ECDF6CE4C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFileProtectRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectRuleResponseBody self = new ListFileProtectRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileProtectRuleResponseBody setFileProtectList(java.util.List<ListFileProtectRuleResponseBodyFileProtectList> fileProtectList) {
        this.fileProtectList = fileProtectList;
        return this;
    }
    public java.util.List<ListFileProtectRuleResponseBodyFileProtectList> getFileProtectList() {
        return this.fileProtectList;
    }

    public ListFileProtectRuleResponseBody setPageInfo(ListFileProtectRuleResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListFileProtectRuleResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListFileProtectRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFileProtectRuleResponseBodyFileProtectList extends TeaModel {
        /**
         * <p>The handling method of the rule. Valid values:</p>
         * <ul>
         * <li>pass: allow</li>
         * <li>alert</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The severity of alerts. Valid values:</p>
         * <ul>
         * <li>0: does not generate alerts</li>
         * <li>1: sends notifications</li>
         * <li>2: suspicious</li>
         * <li>3: high-risk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlertLevel")
        public String alertLevel;

        /**
         * <p>The total number of affected assets.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("EffectInstanceCount")
        public Long effectInstanceCount;

        /**
         * <p>The operations performed on the files.</p>
         */
        @NameInMap("FileOps")
        public java.util.List<String> fileOps;

        /**
         * <p>The paths to the monitored files. Wildcard characters are supported.</p>
         */
        @NameInMap("FilePaths")
        public java.util.List<String> filePaths;

        /**
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1682304179000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1682304179000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1412511</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong>: Windows</li>
         * <li><strong>linux</strong>: Linux</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The paths to the monitored processes. Wildcard characters are supported.</p>
         */
        @NameInMap("ProcPaths")
        public java.util.List<String> procPaths;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test11</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li>0: disabled</li>
         * <li>1: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The switch ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>FILE_PROTECT_RULE_SWITCH_TYPE_1693474122927</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        public static ListFileProtectRuleResponseBodyFileProtectList build(java.util.Map<String, ?> map) throws Exception {
            ListFileProtectRuleResponseBodyFileProtectList self = new ListFileProtectRuleResponseBodyFileProtectList();
            return TeaModel.build(map, self);
        }

        public ListFileProtectRuleResponseBodyFileProtectList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setAlertLevel(String alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public String getAlertLevel() {
            return this.alertLevel;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setEffectInstanceCount(Long effectInstanceCount) {
            this.effectInstanceCount = effectInstanceCount;
            return this;
        }
        public Long getEffectInstanceCount() {
            return this.effectInstanceCount;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setFileOps(java.util.List<String> fileOps) {
            this.fileOps = fileOps;
            return this;
        }
        public java.util.List<String> getFileOps() {
            return this.fileOps;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setFilePaths(java.util.List<String> filePaths) {
            this.filePaths = filePaths;
            return this;
        }
        public java.util.List<String> getFilePaths() {
            return this.filePaths;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setProcPaths(java.util.List<String> procPaths) {
            this.procPaths = procPaths;
            return this;
        }
        public java.util.List<String> getProcPaths() {
            return this.procPaths;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListFileProtectRuleResponseBodyFileProtectList setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

    }

    public static class ListFileProtectRuleResponseBodyPageInfo extends TeaModel {
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
         * <p>253</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFileProtectRuleResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFileProtectRuleResponseBodyPageInfo self = new ListFileProtectRuleResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListFileProtectRuleResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListFileProtectRuleResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileProtectRuleResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
