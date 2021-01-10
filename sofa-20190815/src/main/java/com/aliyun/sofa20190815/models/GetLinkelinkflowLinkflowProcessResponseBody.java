// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowProcessResponseBody extends TeaModel {
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
    public GetLinkelinkflowLinkflowProcessResponseBodyData data;

    public static GetLinkelinkflowLinkflowProcessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowProcessResponseBody self = new GetLinkelinkflowLinkflowProcessResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowProcessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkelinkflowLinkflowProcessResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkelinkflowLinkflowProcessResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkelinkflowLinkflowProcessResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public GetLinkelinkflowLinkflowProcessResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLinkelinkflowLinkflowProcessResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetLinkelinkflowLinkflowProcessResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetLinkelinkflowLinkflowProcessResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkelinkflowLinkflowProcessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkelinkflowLinkflowProcessResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkelinkflowLinkflowProcessResponseBody setData(GetLinkelinkflowLinkflowProcessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkelinkflowLinkflowProcessResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkelinkflowLinkflowProcessResponseBodyData extends TeaModel {
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

        public static GetLinkelinkflowLinkflowProcessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkelinkflowLinkflowProcessResponseBodyData self = new GetLinkelinkflowLinkflowProcessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setDefinitionId(String definitionId) {
            this.definitionId = definitionId;
            return this;
        }
        public String getDefinitionId() {
            return this.definitionId;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setDefinitionKey(String definitionKey) {
            this.definitionKey = definitionKey;
            return this;
        }
        public String getDefinitionKey() {
            return this.definitionKey;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setStarter(String starter) {
            this.starter = starter;
            return this;
        }
        public String getStarter() {
            return this.starter;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setStartUserId(String startUserId) {
            this.startUserId = startUserId;
            return this;
        }
        public String getStartUserId() {
            return this.startUserId;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setAssigneeUserIds(java.util.List<String> assigneeUserIds) {
            this.assigneeUserIds = assigneeUserIds;
            return this;
        }
        public java.util.List<String> getAssigneeUserIds() {
            return this.assigneeUserIds;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setCandidateUsers(java.util.List<String> candidateUsers) {
            this.candidateUsers = candidateUsers;
            return this;
        }
        public java.util.List<String> getCandidateUsers() {
            return this.candidateUsers;
        }

        public GetLinkelinkflowLinkflowProcessResponseBodyData setCandidateUserIds(java.util.List<String> candidateUserIds) {
            this.candidateUserIds = candidateUserIds;
            return this;
        }
        public java.util.List<String> getCandidateUserIds() {
            return this.candidateUserIds;
        }

    }

}
