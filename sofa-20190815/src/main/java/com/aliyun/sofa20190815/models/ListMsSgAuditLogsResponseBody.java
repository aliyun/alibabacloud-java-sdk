// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuditLogsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("AuditLogs")
    public java.util.List<ListMsSgAuditLogsResponseBodyAuditLogs> auditLogs;

    public static ListMsSgAuditLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuditLogsResponseBody self = new ListMsSgAuditLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuditLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgAuditLogsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgAuditLogsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgAuditLogsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListMsSgAuditLogsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMsSgAuditLogsResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListMsSgAuditLogsResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListMsSgAuditLogsResponseBody setAuditLogs(java.util.List<ListMsSgAuditLogsResponseBodyAuditLogs> auditLogs) {
        this.auditLogs = auditLogs;
        return this;
    }
    public java.util.List<ListMsSgAuditLogsResponseBodyAuditLogs> getAuditLogs() {
        return this.auditLogs;
    }

    public static class ListMsSgAuditLogsResponseBodyAuditLogs extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OperateInterface")
        public String operateInterface;

        @NameInMap("OperateType")
        public String operateType;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Response")
        public String response;

        @NameInMap("Status")
        public Long status;

        public static ListMsSgAuditLogsResponseBodyAuditLogs build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgAuditLogsResponseBodyAuditLogs self = new ListMsSgAuditLogsResponseBodyAuditLogs();
            return TeaModel.build(map, self);
        }

        public ListMsSgAuditLogsResponseBodyAuditLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMsSgAuditLogsResponseBodyAuditLogs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMsSgAuditLogsResponseBodyAuditLogs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMsSgAuditLogsResponseBodyAuditLogs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsSgAuditLogsResponseBodyAuditLogs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsSgAuditLogsResponseBodyAuditLogs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMsSgAuditLogsResponseBodyAuditLogs setOperateInterface(String operateInterface) {
            this.operateInterface = operateInterface;
            return this;
        }
        public String getOperateInterface() {
            return this.operateInterface;
        }

        public ListMsSgAuditLogsResponseBodyAuditLogs setOperateType(String operateType) {
            this.operateType = operateType;
            return this;
        }
        public String getOperateType() {
            return this.operateType;
        }

        public ListMsSgAuditLogsResponseBodyAuditLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMsSgAuditLogsResponseBodyAuditLogs setResponse(String response) {
            this.response = response;
            return this;
        }
        public String getResponse() {
            return this.response;
        }

        public ListMsSgAuditLogsResponseBodyAuditLogs setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
