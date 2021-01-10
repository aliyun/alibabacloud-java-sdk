// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskRuleRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RuleCode")
    public String ruleCode;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RecordList")
    public java.util.List<ListClriskRuleRecordsResponseBodyRecordList> recordList;

    @NameInMap("TaskRecordList")
    public java.util.List<ListClriskRuleRecordsResponseBodyTaskRecordList> taskRecordList;

    public static ListClriskRuleRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskRuleRecordsResponseBody self = new ListClriskRuleRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskRuleRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskRuleRecordsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskRuleRecordsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskRuleRecordsResponseBody setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public ListClriskRuleRecordsResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListClriskRuleRecordsResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListClriskRuleRecordsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskRuleRecordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskRuleRecordsResponseBody setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public ListClriskRuleRecordsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListClriskRuleRecordsResponseBody setRecordList(java.util.List<ListClriskRuleRecordsResponseBodyRecordList> recordList) {
        this.recordList = recordList;
        return this;
    }
    public java.util.List<ListClriskRuleRecordsResponseBodyRecordList> getRecordList() {
        return this.recordList;
    }

    public ListClriskRuleRecordsResponseBody setTaskRecordList(java.util.List<ListClriskRuleRecordsResponseBodyTaskRecordList> taskRecordList) {
        this.taskRecordList = taskRecordList;
        return this;
    }
    public java.util.List<ListClriskRuleRecordsResponseBodyTaskRecordList> getTaskRecordList() {
        return this.taskRecordList;
    }

    public static class ListClriskRuleRecordsResponseBodyRecordList extends TeaModel {
        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("PkgCode")
        public String pkgCode;

        @NameInMap("RuleCode")
        public String ruleCode;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("TotalError")
        public Long totalError;

        @NameInMap("TotalSuccess")
        public Long totalSuccess;

        public static ListClriskRuleRecordsResponseBodyRecordList build(java.util.Map<String, ?> map) throws Exception {
            ListClriskRuleRecordsResponseBodyRecordList self = new ListClriskRuleRecordsResponseBodyRecordList();
            return TeaModel.build(map, self);
        }

        public ListClriskRuleRecordsResponseBodyRecordList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListClriskRuleRecordsResponseBodyRecordList setPkgCode(String pkgCode) {
            this.pkgCode = pkgCode;
            return this;
        }
        public String getPkgCode() {
            return this.pkgCode;
        }

        public ListClriskRuleRecordsResponseBodyRecordList setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public ListClriskRuleRecordsResponseBodyRecordList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListClriskRuleRecordsResponseBodyRecordList setTotalError(Long totalError) {
            this.totalError = totalError;
            return this;
        }
        public Long getTotalError() {
            return this.totalError;
        }

        public ListClriskRuleRecordsResponseBodyRecordList setTotalSuccess(Long totalSuccess) {
            this.totalSuccess = totalSuccess;
            return this;
        }
        public Long getTotalSuccess() {
            return this.totalSuccess;
        }

    }

    public static class ListClriskRuleRecordsResponseBodyTaskRecordList extends TeaModel {
        @NameInMap("Cycle")
        public String cycle;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("PkgCode")
        public String pkgCode;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("ResultDetail")
        public String resultDetail;

        @NameInMap("ResultSize")
        public Long resultSize;

        @NameInMap("SqlText")
        public String sqlText;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public Long taskId;

        public static ListClriskRuleRecordsResponseBodyTaskRecordList build(java.util.Map<String, ?> map) throws Exception {
            ListClriskRuleRecordsResponseBodyTaskRecordList self = new ListClriskRuleRecordsResponseBodyTaskRecordList();
            return TeaModel.build(map, self);
        }

        public ListClriskRuleRecordsResponseBodyTaskRecordList setCycle(String cycle) {
            this.cycle = cycle;
            return this;
        }
        public String getCycle() {
            return this.cycle;
        }

        public ListClriskRuleRecordsResponseBodyTaskRecordList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListClriskRuleRecordsResponseBodyTaskRecordList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListClriskRuleRecordsResponseBodyTaskRecordList setPkgCode(String pkgCode) {
            this.pkgCode = pkgCode;
            return this;
        }
        public String getPkgCode() {
            return this.pkgCode;
        }

        public ListClriskRuleRecordsResponseBodyTaskRecordList setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public ListClriskRuleRecordsResponseBodyTaskRecordList setResultDetail(String resultDetail) {
            this.resultDetail = resultDetail;
            return this;
        }
        public String getResultDetail() {
            return this.resultDetail;
        }

        public ListClriskRuleRecordsResponseBodyTaskRecordList setResultSize(Long resultSize) {
            this.resultSize = resultSize;
            return this;
        }
        public Long getResultSize() {
            return this.resultSize;
        }

        public ListClriskRuleRecordsResponseBodyTaskRecordList setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public ListClriskRuleRecordsResponseBodyTaskRecordList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClriskRuleRecordsResponseBodyTaskRecordList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
