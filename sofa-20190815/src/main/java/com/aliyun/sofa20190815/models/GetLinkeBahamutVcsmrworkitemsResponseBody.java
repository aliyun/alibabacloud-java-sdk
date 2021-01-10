// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmrworkitemsResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutVcsmrworkitemsResponseBodyResult> result;

    public static GetLinkeBahamutVcsmrworkitemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmrworkitemsResponseBody self = new GetLinkeBahamutVcsmrworkitemsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmrworkitemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutVcsmrworkitemsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutVcsmrworkitemsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutVcsmrworkitemsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutVcsmrworkitemsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutVcsmrworkitemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutVcsmrworkitemsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutVcsmrworkitemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutVcsmrworkitemsResponseBody setResult(java.util.List<GetLinkeBahamutVcsmrworkitemsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutVcsmrworkitemsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutVcsmrworkitemsResponseBodyResult extends TeaModel {
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

        @NameInMap("MergeRequestIds")
        public java.util.List<String> mergeRequestIds;

        public static GetLinkeBahamutVcsmrworkitemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutVcsmrworkitemsResponseBodyResult self = new GetLinkeBahamutVcsmrworkitemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setAcHour(String acHour) {
            this.acHour = acHour;
            return this;
        }
        public String getAcHour() {
            return this.acHour;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setAssignedToStaffId(String assignedToStaffId) {
            this.assignedToStaffId = assignedToStaffId;
            return this;
        }
        public String getAssignedToStaffId() {
            return this.assignedToStaffId;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setCreatorStaffId(String creatorStaffId) {
            this.creatorStaffId = creatorStaffId;
            return this;
        }
        public String getCreatorStaffId() {
            return this.creatorStaffId;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setEsHour(String esHour) {
            this.esHour = esHour;
            return this;
        }
        public String getEsHour() {
            return this.esHour;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setIterationExternalId(String iterationExternalId) {
            this.iterationExternalId = iterationExternalId;
            return this;
        }
        public String getIterationExternalId() {
            return this.iterationExternalId;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setMergeRequestId(String mergeRequestId) {
            this.mergeRequestId = mergeRequestId;
            return this;
        }
        public String getMergeRequestId() {
            return this.mergeRequestId;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setPriorityId(String priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public String getPriorityId() {
            return this.priorityId;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setStatusId(String statusId) {
            this.statusId = statusId;
            return this;
        }
        public String getStatusId() {
            return this.statusId;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setStatusStage(String statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public String getStatusStage() {
            return this.statusStage;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setSys(String sys) {
            this.sys = sys;
            return this;
        }
        public String getSys() {
            return this.sys;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetLinkeBahamutVcsmrworkitemsResponseBodyResult setMergeRequestIds(java.util.List<String> mergeRequestIds) {
            this.mergeRequestIds = mergeRequestIds;
            return this;
        }
        public java.util.List<String> getMergeRequestIds() {
            return this.mergeRequestIds;
        }

    }

}
