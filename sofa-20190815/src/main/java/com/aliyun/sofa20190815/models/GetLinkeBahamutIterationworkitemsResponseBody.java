// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationworkitemsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<GetLinkeBahamutIterationworkitemsResponseBodyResult> result;

    public static GetLinkeBahamutIterationworkitemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationworkitemsResponseBody self = new GetLinkeBahamutIterationworkitemsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationworkitemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutIterationworkitemsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutIterationworkitemsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutIterationworkitemsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutIterationworkitemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutIterationworkitemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutIterationworkitemsResponseBody setResult(java.util.List<GetLinkeBahamutIterationworkitemsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutIterationworkitemsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutIterationworkitemsResponseBodyResult extends TeaModel {
        @NameInMap("AcHour")
        public String acHour;

        @NameInMap("AssignedTo")
        public String assignedTo;

        @NameInMap("AssignedToStaffId")
        public String assignedToStaffId;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorStaffId")
        public String creatorStaffId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("EsHour")
        public String esHour;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Id")
        public String id;

        @NameInMap("IterationExternalId")
        public String iterationExternalId;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Link")
        public String link;

        @NameInMap("MergeRequestId")
        public String mergeRequestId;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("PriorityId")
        public String priorityId;

        @NameInMap("Progress")
        public String progress;

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

        @NameInMap("Sys")
        public String sys;

        @NameInMap("Url")
        public String url;

        public static GetLinkeBahamutIterationworkitemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutIterationworkitemsResponseBodyResult self = new GetLinkeBahamutIterationworkitemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setAcHour(String acHour) {
            this.acHour = acHour;
            return this;
        }
        public String getAcHour() {
            return this.acHour;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setAssignedToStaffId(String assignedToStaffId) {
            this.assignedToStaffId = assignedToStaffId;
            return this;
        }
        public String getAssignedToStaffId() {
            return this.assignedToStaffId;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setCreatorStaffId(String creatorStaffId) {
            this.creatorStaffId = creatorStaffId;
            return this;
        }
        public String getCreatorStaffId() {
            return this.creatorStaffId;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setEsHour(String esHour) {
            this.esHour = esHour;
            return this;
        }
        public String getEsHour() {
            return this.esHour;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setIterationExternalId(String iterationExternalId) {
            this.iterationExternalId = iterationExternalId;
            return this;
        }
        public String getIterationExternalId() {
            return this.iterationExternalId;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setMergeRequestId(String mergeRequestId) {
            this.mergeRequestId = mergeRequestId;
            return this;
        }
        public String getMergeRequestId() {
            return this.mergeRequestId;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setPriorityId(String priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public String getPriorityId() {
            return this.priorityId;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setStatusId(String statusId) {
            this.statusId = statusId;
            return this;
        }
        public String getStatusId() {
            return this.statusId;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setStatusStage(String statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public String getStatusStage() {
            return this.statusStage;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setSys(String sys) {
            this.sys = sys;
            return this;
        }
        public String getSys() {
            return this.sys;
        }

        public GetLinkeBahamutIterationworkitemsResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
