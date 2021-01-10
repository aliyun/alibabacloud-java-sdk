// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public GetLinkeBahamutTaskResponseBodyResult result;

    public static GetLinkeBahamutTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTaskResponseBody self = new GetLinkeBahamutTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutTaskResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutTaskResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutTaskResponseBody setResult(GetLinkeBahamutTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutTaskResponseBodyResult extends TeaModel {
        @NameInMap("Assignee")
        public String assignee;

        @NameInMap("AutoCreating")
        public Boolean autoCreating;

        @NameInMap("Content")
        public String content;

        @NameInMap("Context")
        public String context;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("OperatorAccount")
        public String operatorAccount;

        @NameInMap("RefId")
        public String refId;

        @NameInMap("RefName")
        public String refName;

        @NameInMap("ResultMessage")
        public String resultMessage;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskScope")
        public String taskScope;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static GetLinkeBahamutTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutTaskResponseBodyResult self = new GetLinkeBahamutTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutTaskResponseBodyResult setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public GetLinkeBahamutTaskResponseBodyResult setAutoCreating(Boolean autoCreating) {
            this.autoCreating = autoCreating;
            return this;
        }
        public Boolean getAutoCreating() {
            return this.autoCreating;
        }

        public GetLinkeBahamutTaskResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetLinkeBahamutTaskResponseBodyResult setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public GetLinkeBahamutTaskResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutTaskResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutTaskResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeBahamutTaskResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutTaskResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutTaskResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutTaskResponseBodyResult setOperatorAccount(String operatorAccount) {
            this.operatorAccount = operatorAccount;
            return this;
        }
        public String getOperatorAccount() {
            return this.operatorAccount;
        }

        public GetLinkeBahamutTaskResponseBodyResult setRefId(String refId) {
            this.refId = refId;
            return this;
        }
        public String getRefId() {
            return this.refId;
        }

        public GetLinkeBahamutTaskResponseBodyResult setRefName(String refName) {
            this.refName = refName;
            return this;
        }
        public String getRefName() {
            return this.refName;
        }

        public GetLinkeBahamutTaskResponseBodyResult setResultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }
        public String getResultMessage() {
            return this.resultMessage;
        }

        public GetLinkeBahamutTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutTaskResponseBodyResult setTaskScope(String taskScope) {
            this.taskScope = taskScope;
            return this;
        }
        public String getTaskScope() {
            return this.taskScope;
        }

        public GetLinkeBahamutTaskResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutTaskResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
