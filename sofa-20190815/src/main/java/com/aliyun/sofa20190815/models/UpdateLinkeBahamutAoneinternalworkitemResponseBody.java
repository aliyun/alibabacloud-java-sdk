// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAoneinternalworkitemResponseBody extends TeaModel {
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
    public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult result;

    public static UpdateLinkeBahamutAoneinternalworkitemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAoneinternalworkitemResponseBody self = new UpdateLinkeBahamutAoneinternalworkitemResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAoneinternalworkitemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeBahamutAoneinternalworkitemResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeBahamutAoneinternalworkitemResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeBahamutAoneinternalworkitemResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeBahamutAoneinternalworkitemResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public UpdateLinkeBahamutAoneinternalworkitemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLinkeBahamutAoneinternalworkitemResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeBahamutAoneinternalworkitemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeBahamutAoneinternalworkitemResponseBody setResult(UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult extends TeaModel {
        @NameInMap("AkProjectId")
        public String akProjectId;

        @NameInMap("AssignedTo")
        public String assignedTo;

        @NameInMap("AssignedToStaffId")
        public String assignedToStaffId;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Link")
        public String link;

        @NameInMap("OtherJson")
        public String otherJson;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("PriorityId")
        public String priorityId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Stamp")
        public String stamp;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusId")
        public String statusId;

        @NameInMap("StatusStage")
        public String statusStage;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("User")
        public String user;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserStaffId")
        public String userStaffId;

        @NameInMap("CfsList")
        public java.util.List<String> cfsList;

        public static UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult self = new UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setAkProjectId(String akProjectId) {
            this.akProjectId = akProjectId;
            return this;
        }
        public String getAkProjectId() {
            return this.akProjectId;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setAssignedToStaffId(String assignedToStaffId) {
            this.assignedToStaffId = assignedToStaffId;
            return this;
        }
        public String getAssignedToStaffId() {
            return this.assignedToStaffId;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setOtherJson(String otherJson) {
            this.otherJson = otherJson;
            return this;
        }
        public String getOtherJson() {
            return this.otherJson;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setPriorityId(String priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public String getPriorityId() {
            return this.priorityId;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setStatusId(String statusId) {
            this.statusId = statusId;
            return this;
        }
        public String getStatusId() {
            return this.statusId;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setStatusStage(String statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public String getStatusStage() {
            return this.statusStage;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setUserStaffId(String userStaffId) {
            this.userStaffId = userStaffId;
            return this;
        }
        public String getUserStaffId() {
            return this.userStaffId;
        }

        public UpdateLinkeBahamutAoneinternalworkitemResponseBodyResult setCfsList(java.util.List<String> cfsList) {
            this.cfsList = cfsList;
            return this;
        }
        public java.util.List<String> getCfsList() {
            return this.cfsList;
        }

    }

}
