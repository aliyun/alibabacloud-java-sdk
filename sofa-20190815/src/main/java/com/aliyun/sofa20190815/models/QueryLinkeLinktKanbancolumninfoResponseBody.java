// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktKanbancolumninfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryLinkeLinktKanbancolumninfoResponseBodyData data;

    public static QueryLinkeLinktKanbancolumninfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktKanbancolumninfoResponseBody self = new QueryLinkeLinktKanbancolumninfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktKanbancolumninfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktKanbancolumninfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktKanbancolumninfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktKanbancolumninfoResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktKanbancolumninfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktKanbancolumninfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktKanbancolumninfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktKanbancolumninfoResponseBody setData(QueryLinkeLinktKanbancolumninfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkeLinktKanbancolumninfoResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkeLinktKanbancolumninfoResponseBodyData extends TeaModel {
        @NameInMap("TemplateWorkflowMap")
        public String templateWorkflowMap;

        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        public static QueryLinkeLinktKanbancolumninfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktKanbancolumninfoResponseBodyData self = new QueryLinkeLinktKanbancolumninfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktKanbancolumninfoResponseBodyData setTemplateWorkflowMap(String templateWorkflowMap) {
            this.templateWorkflowMap = templateWorkflowMap;
            return this;
        }
        public String getTemplateWorkflowMap() {
            return this.templateWorkflowMap;
        }

        public QueryLinkeLinktKanbancolumninfoResponseBodyData setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

    }

}
