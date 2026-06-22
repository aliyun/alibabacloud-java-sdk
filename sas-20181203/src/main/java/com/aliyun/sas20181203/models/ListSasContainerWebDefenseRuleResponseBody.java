// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSasContainerWebDefenseRuleResponseBody extends TeaModel {
    /**
     * <p>The list of container file defense rules.</p>
     */
    @NameInMap("ContainerWebDefenseRuleList")
    public java.util.List<ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList> containerWebDefenseRuleList;

    /**
     * <p>The pagination information of the query result.</p>
     */
    @NameInMap("PageInfo")
    public ListSasContainerWebDefenseRuleResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID. It is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>8C376***AE74FB4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSasContainerWebDefenseRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSasContainerWebDefenseRuleResponseBody self = new ListSasContainerWebDefenseRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSasContainerWebDefenseRuleResponseBody setContainerWebDefenseRuleList(java.util.List<ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList> containerWebDefenseRuleList) {
        this.containerWebDefenseRuleList = containerWebDefenseRuleList;
        return this;
    }
    public java.util.List<ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList> getContainerWebDefenseRuleList() {
        return this.containerWebDefenseRuleList;
    }

    public ListSasContainerWebDefenseRuleResponseBody setPageInfo(ListSasContainerWebDefenseRuleResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListSasContainerWebDefenseRuleResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListSasContainerWebDefenseRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList extends TeaModel {
        /**
         * <p>The backup path.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp/test</p>
         */
        @NameInMap("BackupPath")
        public String backupPath;

        /**
         * <p>The action to take. Valid values:</p>
         * <ul>
         * <li><strong>block</strong>: Block.</li>
         * <li><strong>audit</strong>: Alert.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>audit</p>
         */
        @NameInMap("DefenseMode")
        public String defenseMode;

        /**
         * <p>The defense path.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/test/</p>
         */
        @NameInMap("DefensePath")
        public String defensePath;

        /**
         * <p>The excluded file.</p>
         * 
         * <strong>example:</strong>
         * <p>php</p>
         */
        @NameInMap("ExcludeFile")
        public String excludeFile;

        /**
         * <p>The excluded file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/tt</p>
         */
        @NameInMap("ExcludeFilePath")
        public String excludeFilePath;

        /**
         * <p>The excluded file type.</p>
         * 
         * <strong>example:</strong>
         * <p>jsp</p>
         */
        @NameInMap("ExcludeFileType")
        public String excludeFileType;

        /**
         * <p>The defense mode. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Basic pattern (whitelist).</li>
         * <li><strong>1</strong>: Advanced pattern (blacklist).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GuardType")
        public Integer guardType;

        /**
         * <p>The included file.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/test</p>
         */
        @NameInMap("IncludeFile")
        public String includeFile;

        /**
         * <p>The type of the included file.</p>
         * 
         * <strong>example:</strong>
         * <p>php</p>
         */
        @NameInMap("IncludeFileType")
        public String includeFileType;

        /**
         * <p>The list of whitelisted processes.</p>
         */
        @NameInMap("ProcessPathList")
        public java.util.List<String> processPathList;

        public static ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList build(java.util.Map<String, ?> map) throws Exception {
            ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList self = new ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList();
            return TeaModel.build(map, self);
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList setBackupPath(String backupPath) {
            this.backupPath = backupPath;
            return this;
        }
        public String getBackupPath() {
            return this.backupPath;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList setDefenseMode(String defenseMode) {
            this.defenseMode = defenseMode;
            return this;
        }
        public String getDefenseMode() {
            return this.defenseMode;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList setDefensePath(String defensePath) {
            this.defensePath = defensePath;
            return this;
        }
        public String getDefensePath() {
            return this.defensePath;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList setExcludeFile(String excludeFile) {
            this.excludeFile = excludeFile;
            return this;
        }
        public String getExcludeFile() {
            return this.excludeFile;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList setExcludeFilePath(String excludeFilePath) {
            this.excludeFilePath = excludeFilePath;
            return this;
        }
        public String getExcludeFilePath() {
            return this.excludeFilePath;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList setExcludeFileType(String excludeFileType) {
            this.excludeFileType = excludeFileType;
            return this;
        }
        public String getExcludeFileType() {
            return this.excludeFileType;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList setGuardType(Integer guardType) {
            this.guardType = guardType;
            return this;
        }
        public Integer getGuardType() {
            return this.guardType;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList setIncludeFile(String includeFile) {
            this.includeFile = includeFile;
            return this;
        }
        public String getIncludeFile() {
            return this.includeFile;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList setIncludeFileType(String includeFileType) {
            this.includeFileType = includeFileType;
            return this;
        }
        public String getIncludeFileType() {
            return this.includeFileType;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList setProcessPathList(java.util.List<String> processPathList) {
            this.processPathList = processPathList;
            return this;
        }
        public java.util.List<String> getProcessPathList() {
            return this.processPathList;
        }

    }

    public static class ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList extends TeaModel {
        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1766185894104675</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The number of configured applications.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ApptotalCount")
        public Integer apptotalCount;

        /**
         * <p>The creation time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1698978109000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The timestamp when the alert event was last modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1678852686000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>420336648</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The list of rule defense paths.</p>
         */
        @NameInMap("PathConfDTOList")
        public java.util.List<ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList> pathConfDTOList;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Enabled.</li>
         * <li><strong>0</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleStatus")
        public Integer ruleStatus;

        public static ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList self = new ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList();
            return TeaModel.build(map, self);
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList setApptotalCount(Integer apptotalCount) {
            this.apptotalCount = apptotalCount;
            return this;
        }
        public Integer getApptotalCount() {
            return this.apptotalCount;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList setPathConfDTOList(java.util.List<ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList> pathConfDTOList) {
            this.pathConfDTOList = pathConfDTOList;
            return this;
        }
        public java.util.List<ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleListPathConfDTOList> getPathConfDTOList() {
            return this.pathConfDTOList;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListSasContainerWebDefenseRuleResponseBodyContainerWebDefenseRuleList setRuleStatus(Integer ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public Integer getRuleStatus() {
            return this.ruleStatus;
        }

    }

    public static class ListSasContainerWebDefenseRuleResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries on the current page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the current page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The maximum number of entries per page in a paged query.</p>
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
         * <p>42</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSasContainerWebDefenseRuleResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSasContainerWebDefenseRuleResponseBodyPageInfo self = new ListSasContainerWebDefenseRuleResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListSasContainerWebDefenseRuleResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListSasContainerWebDefenseRuleResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListSasContainerWebDefenseRuleResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSasContainerWebDefenseRuleResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
