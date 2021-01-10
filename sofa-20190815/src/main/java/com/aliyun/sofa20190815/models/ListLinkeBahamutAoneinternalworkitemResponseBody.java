// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAoneinternalworkitemResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeBahamutAoneinternalworkitemResponseBodyResult> result;

    @NameInMap("Paginator")
    public ListLinkeBahamutAoneinternalworkitemResponseBodyPaginator paginator;

    public static ListLinkeBahamutAoneinternalworkitemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAoneinternalworkitemResponseBody self = new ListLinkeBahamutAoneinternalworkitemResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAoneinternalworkitemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutAoneinternalworkitemResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutAoneinternalworkitemResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutAoneinternalworkitemResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutAoneinternalworkitemResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ListLinkeBahamutAoneinternalworkitemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutAoneinternalworkitemResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeBahamutAoneinternalworkitemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutAoneinternalworkitemResponseBody setResult(java.util.List<ListLinkeBahamutAoneinternalworkitemResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutAoneinternalworkitemResponseBodyResult> getResult() {
        return this.result;
    }

    public ListLinkeBahamutAoneinternalworkitemResponseBody setPaginator(ListLinkeBahamutAoneinternalworkitemResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public ListLinkeBahamutAoneinternalworkitemResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class ListLinkeBahamutAoneinternalworkitemResponseBodyResult extends TeaModel {
        @NameInMap("AkProjectId")
        public String akProjectId;

        @NameInMap("AssignedTo")
        public String assignedTo;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

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

        @NameInMap("ProjectName")
        public String projectName;

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

        @NameInMap("CfsList")
        public java.util.List<String> cfsList;

        public static ListLinkeBahamutAoneinternalworkitemResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutAoneinternalworkitemResponseBodyResult self = new ListLinkeBahamutAoneinternalworkitemResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setAkProjectId(String akProjectId) {
            this.akProjectId = akProjectId;
            return this;
        }
        public String getAkProjectId() {
            return this.akProjectId;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setOtherJson(String otherJson) {
            this.otherJson = otherJson;
            return this;
        }
        public String getOtherJson() {
            return this.otherJson;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setPriorityId(String priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public String getPriorityId() {
            return this.priorityId;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setStatusId(String statusId) {
            this.statusId = statusId;
            return this;
        }
        public String getStatusId() {
            return this.statusId;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setStatusStage(String statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public String getStatusStage() {
            return this.statusStage;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyResult setCfsList(java.util.List<String> cfsList) {
            this.cfsList = cfsList;
            return this;
        }
        public java.util.List<String> getCfsList() {
            return this.cfsList;
        }

    }

    public static class ListLinkeBahamutAoneinternalworkitemResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static ListLinkeBahamutAoneinternalworkitemResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutAoneinternalworkitemResponseBodyPaginator self = new ListLinkeBahamutAoneinternalworkitemResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public ListLinkeBahamutAoneinternalworkitemResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
