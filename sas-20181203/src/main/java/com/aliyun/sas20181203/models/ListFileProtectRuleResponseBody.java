// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectRuleResponseBody extends TeaModel {
    @NameInMap("FileProtectList")
    public java.util.List<ListFileProtectRuleResponseBodyFileProtectList> fileProtectList;

    @NameInMap("PageInfo")
    public ListFileProtectRuleResponseBodyPageInfo pageInfo;

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
        @NameInMap("Action")
        public String action;

        @NameInMap("AlertLevel")
        public String alertLevel;

        @NameInMap("EffectInstanceCount")
        public Long effectInstanceCount;

        @NameInMap("FileOps")
        public java.util.List<String> fileOps;

        @NameInMap("FilePaths")
        public java.util.List<String> filePaths;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ProcPaths")
        public java.util.List<String> procPaths;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Status")
        public Integer status;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
