// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaldefectsResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutAoneinternaldefectsResponseBodyResult> result;

    public static GetLinkeBahamutAoneinternaldefectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaldefectsResponseBody self = new GetLinkeBahamutAoneinternaldefectsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaldefectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAoneinternaldefectsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAoneinternaldefectsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAoneinternaldefectsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAoneinternaldefectsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAoneinternaldefectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAoneinternaldefectsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAoneinternaldefectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAoneinternaldefectsResponseBody setResult(java.util.List<GetLinkeBahamutAoneinternaldefectsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutAoneinternaldefectsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutAoneinternaldefectsResponseBodyResult extends TeaModel {
        @NameInMap("AssignedTo")
        public String assignedTo;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Link")
        public String link;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("SeriousLevel")
        public String seriousLevel;

        @NameInMap("Status")
        public String status;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("User")
        public String user;

        public static GetLinkeBahamutAoneinternaldefectsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAoneinternaldefectsResponseBodyResult self = new GetLinkeBahamutAoneinternaldefectsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAoneinternaldefectsResponseBodyResult setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public GetLinkeBahamutAoneinternaldefectsResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeBahamutAoneinternaldefectsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutAoneinternaldefectsResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetLinkeBahamutAoneinternaldefectsResponseBodyResult setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public GetLinkeBahamutAoneinternaldefectsResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetLinkeBahamutAoneinternaldefectsResponseBodyResult setSeriousLevel(String seriousLevel) {
            this.seriousLevel = seriousLevel;
            return this;
        }
        public String getSeriousLevel() {
            return this.seriousLevel;
        }

        public GetLinkeBahamutAoneinternaldefectsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutAoneinternaldefectsResponseBodyResult setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetLinkeBahamutAoneinternaldefectsResponseBodyResult setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
