// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutApprovaltasksResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutApprovaltasksResponseBodyResult> result;

    public static GetLinkeBahamutApprovaltasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutApprovaltasksResponseBody self = new GetLinkeBahamutApprovaltasksResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutApprovaltasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutApprovaltasksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutApprovaltasksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutApprovaltasksResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutApprovaltasksResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutApprovaltasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutApprovaltasksResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutApprovaltasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutApprovaltasksResponseBody setResult(java.util.List<GetLinkeBahamutApprovaltasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutApprovaltasksResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutApprovaltasksResponseBodyResult extends TeaModel {
        @NameInMap("AbortedBlocked")
        public Boolean abortedBlocked;

        @NameInMap("Assignee")
        public String assignee;

        @NameInMap("AssigneeUser")
        public String assigneeUser;

        @NameInMap("Completed")
        public Boolean completed;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("FinishedSuccessful")
        public Boolean finishedSuccessful;

        @NameInMap("FlowStatus")
        public String flowStatus;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Id")
        public String id;

        @NameInMap("ObjectId")
        public String objectId;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("PortalUrl")
        public String portalUrl;

        @NameInMap("RecordCnName")
        public String recordCnName;

        @NameInMap("SourceId")
        public String sourceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        @NameInMap("AppNames")
        public java.util.List<String> appNames;

        @NameInMap("AssigneeUsers")
        public java.util.List<String> assigneeUsers;

        public static GetLinkeBahamutApprovaltasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutApprovaltasksResponseBodyResult self = new GetLinkeBahamutApprovaltasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setAbortedBlocked(Boolean abortedBlocked) {
            this.abortedBlocked = abortedBlocked;
            return this;
        }
        public Boolean getAbortedBlocked() {
            return this.abortedBlocked;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setAssigneeUser(String assigneeUser) {
            this.assigneeUser = assigneeUser;
            return this;
        }
        public String getAssigneeUser() {
            return this.assigneeUser;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setFinishedSuccessful(Boolean finishedSuccessful) {
            this.finishedSuccessful = finishedSuccessful;
            return this;
        }
        public Boolean getFinishedSuccessful() {
            return this.finishedSuccessful;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setFlowStatus(String flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public String getFlowStatus() {
            return this.flowStatus;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setPortalUrl(String portalUrl) {
            this.portalUrl = portalUrl;
            return this;
        }
        public String getPortalUrl() {
            return this.portalUrl;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setRecordCnName(String recordCnName) {
            this.recordCnName = recordCnName;
            return this;
        }
        public String getRecordCnName() {
            return this.recordCnName;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setAppNames(java.util.List<String> appNames) {
            this.appNames = appNames;
            return this;
        }
        public java.util.List<String> getAppNames() {
            return this.appNames;
        }

        public GetLinkeBahamutApprovaltasksResponseBodyResult setAssigneeUsers(java.util.List<String> assigneeUsers) {
            this.assigneeUsers = assigneeUsers;
            return this;
        }
        public java.util.List<String> getAssigneeUsers() {
            return this.assigneeUsers;
        }

    }

}
