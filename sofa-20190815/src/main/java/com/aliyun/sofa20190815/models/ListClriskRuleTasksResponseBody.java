// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskRuleTasksResponseBody extends TeaModel {
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

    @NameInMap("TaskRecordList")
    public java.util.List<ListClriskRuleTasksResponseBodyTaskRecordList> taskRecordList;

    public static ListClriskRuleTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskRuleTasksResponseBody self = new ListClriskRuleTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskRuleTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskRuleTasksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskRuleTasksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskRuleTasksResponseBody setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public ListClriskRuleTasksResponseBody setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListClriskRuleTasksResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListClriskRuleTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskRuleTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskRuleTasksResponseBody setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public ListClriskRuleTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListClriskRuleTasksResponseBody setTaskRecordList(java.util.List<ListClriskRuleTasksResponseBodyTaskRecordList> taskRecordList) {
        this.taskRecordList = taskRecordList;
        return this;
    }
    public java.util.List<ListClriskRuleTasksResponseBodyTaskRecordList> getTaskRecordList() {
        return this.taskRecordList;
    }

    public static class ListClriskRuleTasksResponseBodyTaskRecordList extends TeaModel {
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

        public static ListClriskRuleTasksResponseBodyTaskRecordList build(java.util.Map<String, ?> map) throws Exception {
            ListClriskRuleTasksResponseBodyTaskRecordList self = new ListClriskRuleTasksResponseBodyTaskRecordList();
            return TeaModel.build(map, self);
        }

        public ListClriskRuleTasksResponseBodyTaskRecordList setCycle(String cycle) {
            this.cycle = cycle;
            return this;
        }
        public String getCycle() {
            return this.cycle;
        }

        public ListClriskRuleTasksResponseBodyTaskRecordList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListClriskRuleTasksResponseBodyTaskRecordList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListClriskRuleTasksResponseBodyTaskRecordList setPkgCode(String pkgCode) {
            this.pkgCode = pkgCode;
            return this;
        }
        public String getPkgCode() {
            return this.pkgCode;
        }

        public ListClriskRuleTasksResponseBodyTaskRecordList setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public ListClriskRuleTasksResponseBodyTaskRecordList setResultDetail(String resultDetail) {
            this.resultDetail = resultDetail;
            return this;
        }
        public String getResultDetail() {
            return this.resultDetail;
        }

        public ListClriskRuleTasksResponseBodyTaskRecordList setResultSize(Long resultSize) {
            this.resultSize = resultSize;
            return this;
        }
        public Long getResultSize() {
            return this.resultSize;
        }

        public ListClriskRuleTasksResponseBodyTaskRecordList setSqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }
        public String getSqlText() {
            return this.sqlText;
        }

        public ListClriskRuleTasksResponseBodyTaskRecordList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListClriskRuleTasksResponseBodyTaskRecordList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
