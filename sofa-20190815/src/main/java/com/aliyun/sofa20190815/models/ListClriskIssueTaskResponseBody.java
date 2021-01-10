// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskIssueTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("DataList")
    public java.util.List<ListClriskIssueTaskResponseBodyDataList> dataList;

    public static ListClriskIssueTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskIssueTaskResponseBody self = new ListClriskIssueTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskIssueTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskIssueTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskIssueTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskIssueTaskResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListClriskIssueTaskResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskIssueTaskResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskIssueTaskResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListClriskIssueTaskResponseBody setDataList(java.util.List<ListClriskIssueTaskResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListClriskIssueTaskResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public static class ListClriskIssueTaskResponseBodyDataList extends TeaModel {
        @NameInMap("Cycle")
        public String cycle;

        @NameInMap("DiffSize")
        public Long diffSize;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IssueDataId")
        public Long issueDataId;

        @NameInMap("TaskId")
        public Long taskId;

        public static ListClriskIssueTaskResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListClriskIssueTaskResponseBodyDataList self = new ListClriskIssueTaskResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListClriskIssueTaskResponseBodyDataList setCycle(String cycle) {
            this.cycle = cycle;
            return this;
        }
        public String getCycle() {
            return this.cycle;
        }

        public ListClriskIssueTaskResponseBodyDataList setDiffSize(Long diffSize) {
            this.diffSize = diffSize;
            return this;
        }
        public Long getDiffSize() {
            return this.diffSize;
        }

        public ListClriskIssueTaskResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListClriskIssueTaskResponseBodyDataList setIssueDataId(Long issueDataId) {
            this.issueDataId = issueDataId;
            return this;
        }
        public Long getIssueDataId() {
            return this.issueDataId;
        }

        public ListClriskIssueTaskResponseBodyDataList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
