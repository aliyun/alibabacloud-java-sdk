// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWorkitemsResponseBody extends TeaModel {
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
    public QueryLinkeBahamutWorkitemsResponseBodyResult result;

    public static QueryLinkeBahamutWorkitemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWorkitemsResponseBody self = new QueryLinkeBahamutWorkitemsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWorkitemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutWorkitemsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutWorkitemsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutWorkitemsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutWorkitemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutWorkitemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutWorkitemsResponseBody setResult(QueryLinkeBahamutWorkitemsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutWorkitemsResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutWorkitemsResponseBodyResultDatas extends TeaModel {
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

        public static QueryLinkeBahamutWorkitemsResponseBodyResultDatas build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutWorkitemsResponseBodyResultDatas self = new QueryLinkeBahamutWorkitemsResponseBodyResultDatas();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setAcHour(String acHour) {
            this.acHour = acHour;
            return this;
        }
        public String getAcHour() {
            return this.acHour;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setAssignedToStaffId(String assignedToStaffId) {
            this.assignedToStaffId = assignedToStaffId;
            return this;
        }
        public String getAssignedToStaffId() {
            return this.assignedToStaffId;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setCanSelect(Boolean canSelect) {
            this.canSelect = canSelect;
            return this;
        }
        public Boolean getCanSelect() {
            return this.canSelect;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setCreatorStaffId(String creatorStaffId) {
            this.creatorStaffId = creatorStaffId;
            return this;
        }
        public String getCreatorStaffId() {
            return this.creatorStaffId;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setEsHour(String esHour) {
            this.esHour = esHour;
            return this;
        }
        public String getEsHour() {
            return this.esHour;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setNoSelectInfo(String noSelectInfo) {
            this.noSelectInfo = noSelectInfo;
            return this;
        }
        public String getNoSelectInfo() {
            return this.noSelectInfo;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setNoSelectTag(String noSelectTag) {
            this.noSelectTag = noSelectTag;
            return this;
        }
        public String getNoSelectTag() {
            return this.noSelectTag;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setPriorityId(String priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public String getPriorityId() {
            return this.priorityId;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setStatusId(String statusId) {
            this.statusId = statusId;
            return this;
        }
        public String getStatusId() {
            return this.statusId;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setStatusStage(String statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public String getStatusStage() {
            return this.statusStage;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResultDatas setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryLinkeBahamutWorkitemsResponseBodyResult extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Datas")
        public java.util.List<QueryLinkeBahamutWorkitemsResponseBodyResultDatas> datas;

        public static QueryLinkeBahamutWorkitemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutWorkitemsResponseBodyResult self = new QueryLinkeBahamutWorkitemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResult setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResult setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryLinkeBahamutWorkitemsResponseBodyResult setDatas(java.util.List<QueryLinkeBahamutWorkitemsResponseBodyResultDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<QueryLinkeBahamutWorkitemsResponseBodyResultDatas> getDatas() {
            return this.datas;
        }

    }

}
