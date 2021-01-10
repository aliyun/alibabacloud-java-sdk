// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult> result;

    public static QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody self = new QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBody setResult(java.util.List<QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult extends TeaModel {
        @NameInMap("AcHour")
        public String acHour;

        @NameInMap("AssignedTo")
        public String assignedTo;

        @NameInMap("AssignedToStaffId")
        public String assignedToStaffId;

        @NameInMap("CanSelect")
        public Boolean canSelect;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatorStaffId")
        public String creatorStaffId;

        @NameInMap("EsHour")
        public String esHour;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Link")
        public String link;

        @NameInMap("NoSelectInfo")
        public String noSelectInfo;

        @NameInMap("NoSelectTag")
        public String noSelectTag;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("PriorityId")
        public String priorityId;

        @NameInMap("Progress")
        public String progress;

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

        @NameInMap("Url")
        public String url;

        public static QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult self = new QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setAcHour(String acHour) {
            this.acHour = acHour;
            return this;
        }
        public String getAcHour() {
            return this.acHour;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setAssignedToStaffId(String assignedToStaffId) {
            this.assignedToStaffId = assignedToStaffId;
            return this;
        }
        public String getAssignedToStaffId() {
            return this.assignedToStaffId;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setCanSelect(Boolean canSelect) {
            this.canSelect = canSelect;
            return this;
        }
        public Boolean getCanSelect() {
            return this.canSelect;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setCreatorStaffId(String creatorStaffId) {
            this.creatorStaffId = creatorStaffId;
            return this;
        }
        public String getCreatorStaffId() {
            return this.creatorStaffId;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setEsHour(String esHour) {
            this.esHour = esHour;
            return this;
        }
        public String getEsHour() {
            return this.esHour;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setNoSelectInfo(String noSelectInfo) {
            this.noSelectInfo = noSelectInfo;
            return this;
        }
        public String getNoSelectInfo() {
            return this.noSelectInfo;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setNoSelectTag(String noSelectTag) {
            this.noSelectTag = noSelectTag;
            return this;
        }
        public String getNoSelectTag() {
            return this.noSelectTag;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setPriorityId(String priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public String getPriorityId() {
            return this.priorityId;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setStatusId(String statusId) {
            this.statusId = statusId;
            return this;
        }
        public String getStatusId() {
            return this.statusId;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setStatusStage(String statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public String getStatusStage() {
            return this.statusStage;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public QueryLinkeBahamutAoneinternalworkitemsearchbyidsResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
