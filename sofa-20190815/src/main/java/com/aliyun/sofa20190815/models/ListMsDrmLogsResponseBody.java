// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsDrmLogsResponseBody extends TeaModel {
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

    @NameInMap("DrmLogs")
    public java.util.List<ListMsDrmLogsResponseBodyDrmLogs> drmLogs;

    public static ListMsDrmLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsDrmLogsResponseBody self = new ListMsDrmLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsDrmLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsDrmLogsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsDrmLogsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsDrmLogsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListMsDrmLogsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMsDrmLogsResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListMsDrmLogsResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListMsDrmLogsResponseBody setDrmLogs(java.util.List<ListMsDrmLogsResponseBodyDrmLogs> drmLogs) {
        this.drmLogs = drmLogs;
        return this;
    }
    public java.util.List<ListMsDrmLogsResponseBodyDrmLogs> getDrmLogs() {
        return this.drmLogs;
    }

    public static class ListMsDrmLogsResponseBodyDrmLogs extends TeaModel {
        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("FailTarget")
        public String failTarget;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("PushMode")
        public String pushMode;

        @NameInMap("Result")
        public String result;

        @NameInMap("SourceApp")
        public String sourceApp;

        @NameInMap("Target")
        public String target;

        @NameInMap("Value")
        public String value;

        public static ListMsDrmLogsResponseBodyDrmLogs build(java.util.Map<String, ?> map) throws Exception {
            ListMsDrmLogsResponseBodyDrmLogs self = new ListMsDrmLogsResponseBodyDrmLogs();
            return TeaModel.build(map, self);
        }

        public ListMsDrmLogsResponseBodyDrmLogs setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setFailTarget(String failTarget) {
            this.failTarget = failTarget;
            return this;
        }
        public String getFailTarget() {
            return this.failTarget;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setPushMode(String pushMode) {
            this.pushMode = pushMode;
            return this;
        }
        public String getPushMode() {
            return this.pushMode;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setSourceApp(String sourceApp) {
            this.sourceApp = sourceApp;
            return this;
        }
        public String getSourceApp() {
            return this.sourceApp;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ListMsDrmLogsResponseBodyDrmLogs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
