// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkelinkflowLinkflowProcessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Current")
    public Long current;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Data")
    public java.util.List<QueryLinkelinkflowLinkflowProcessResponseBodyData> data;

    public static QueryLinkelinkflowLinkflowProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkelinkflowLinkflowProcessResponseBody self = new QueryLinkelinkflowLinkflowProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkelinkflowLinkflowProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkelinkflowLinkflowProcessResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkelinkflowLinkflowProcessResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkelinkflowLinkflowProcessResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryLinkelinkflowLinkflowProcessResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkelinkflowLinkflowProcessResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkelinkflowLinkflowProcessResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLinkelinkflowLinkflowProcessResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkelinkflowLinkflowProcessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkelinkflowLinkflowProcessResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryLinkelinkflowLinkflowProcessResponseBody setData(java.util.List<QueryLinkelinkflowLinkflowProcessResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkelinkflowLinkflowProcessResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkelinkflowLinkflowProcessResponseBodyData extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("DefinitionId")
        public String definitionId;

        @NameInMap("DefinitionKey")
        public String definitionKey;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Starter")
        public String starter;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("StartUserId")
        public String startUserId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Url")
        public String url;

        @NameInMap("Variables")
        public String variables;

        @NameInMap("AssigneeUserIds")
        public java.util.List<String> assigneeUserIds;

        @NameInMap("CandidateUsers")
        public java.util.List<String> candidateUsers;

        @NameInMap("CandidateUserIds")
        public java.util.List<String> candidateUserIds;

        public static QueryLinkelinkflowLinkflowProcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkelinkflowLinkflowProcessResponseBodyData self = new QueryLinkelinkflowLinkflowProcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setDefinitionId(String definitionId) {
            this.definitionId = definitionId;
            return this;
        }
        public String getDefinitionId() {
            return this.definitionId;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setDefinitionKey(String definitionKey) {
            this.definitionKey = definitionKey;
            return this;
        }
        public String getDefinitionKey() {
            return this.definitionKey;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setStarter(String starter) {
            this.starter = starter;
            return this;
        }
        public String getStarter() {
            return this.starter;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setStartUserId(String startUserId) {
            this.startUserId = startUserId;
            return this;
        }
        public String getStartUserId() {
            return this.startUserId;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setAssigneeUserIds(java.util.List<String> assigneeUserIds) {
            this.assigneeUserIds = assigneeUserIds;
            return this;
        }
        public java.util.List<String> getAssigneeUserIds() {
            return this.assigneeUserIds;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setCandidateUsers(java.util.List<String> candidateUsers) {
            this.candidateUsers = candidateUsers;
            return this;
        }
        public java.util.List<String> getCandidateUsers() {
            return this.candidateUsers;
        }

        public QueryLinkelinkflowLinkflowProcessResponseBodyData setCandidateUserIds(java.util.List<String> candidateUserIds) {
            this.candidateUserIds = candidateUserIds;
            return this;
        }
        public java.util.List<String> getCandidateUserIds() {
            return this.candidateUserIds;
        }

    }

}
