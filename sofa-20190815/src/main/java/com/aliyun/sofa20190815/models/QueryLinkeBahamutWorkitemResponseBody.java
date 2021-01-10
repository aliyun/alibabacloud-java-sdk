// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWorkitemResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutWorkitemResponseBodyResult> result;

    @NameInMap("Paginator")
    public QueryLinkeBahamutWorkitemResponseBodyPaginator paginator;

    public static QueryLinkeBahamutWorkitemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWorkitemResponseBody self = new QueryLinkeBahamutWorkitemResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWorkitemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutWorkitemResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutWorkitemResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutWorkitemResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutWorkitemResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutWorkitemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutWorkitemResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutWorkitemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutWorkitemResponseBody setResult(java.util.List<QueryLinkeBahamutWorkitemResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutWorkitemResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryLinkeBahamutWorkitemResponseBody setPaginator(QueryLinkeBahamutWorkitemResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public QueryLinkeBahamutWorkitemResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class QueryLinkeBahamutWorkitemResponseBodyResult extends TeaModel {
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

        public static QueryLinkeBahamutWorkitemResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutWorkitemResponseBodyResult self = new QueryLinkeBahamutWorkitemResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setAkProjectId(String akProjectId) {
            this.akProjectId = akProjectId;
            return this;
        }
        public String getAkProjectId() {
            return this.akProjectId;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setAssignedToStaffId(String assignedToStaffId) {
            this.assignedToStaffId = assignedToStaffId;
            return this;
        }
        public String getAssignedToStaffId() {
            return this.assignedToStaffId;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setOtherJson(String otherJson) {
            this.otherJson = otherJson;
            return this;
        }
        public String getOtherJson() {
            return this.otherJson;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setPriorityId(String priorityId) {
            this.priorityId = priorityId;
            return this;
        }
        public String getPriorityId() {
            return this.priorityId;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setStatusId(String statusId) {
            this.statusId = statusId;
            return this;
        }
        public String getStatusId() {
            return this.statusId;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setStatusStage(String statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public String getStatusStage() {
            return this.statusStage;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setUserStaffId(String userStaffId) {
            this.userStaffId = userStaffId;
            return this;
        }
        public String getUserStaffId() {
            return this.userStaffId;
        }

        public QueryLinkeBahamutWorkitemResponseBodyResult setCfsList(java.util.List<String> cfsList) {
            this.cfsList = cfsList;
            return this;
        }
        public java.util.List<String> getCfsList() {
            return this.cfsList;
        }

    }

    public static class QueryLinkeBahamutWorkitemResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static QueryLinkeBahamutWorkitemResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutWorkitemResponseBodyPaginator self = new QueryLinkeBahamutWorkitemResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutWorkitemResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public QueryLinkeBahamutWorkitemResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public QueryLinkeBahamutWorkitemResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public QueryLinkeBahamutWorkitemResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
