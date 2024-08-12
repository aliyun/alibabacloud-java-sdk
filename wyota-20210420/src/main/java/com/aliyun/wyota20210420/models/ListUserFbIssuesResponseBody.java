// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListUserFbIssuesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListUserFbIssuesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListUserFbIssuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserFbIssuesResponseBody self = new ListUserFbIssuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserFbIssuesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserFbIssuesResponseBody setData(ListUserFbIssuesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUserFbIssuesResponseBodyData getData() {
        return this.data;
    }

    public ListUserFbIssuesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserFbIssuesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserFbIssuesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserFbIssuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserFbIssuesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList extends TeaModel {
        @NameInMap("FileMd5")
        public String fileMd5;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileSize")
        public Integer fileSize;

        @NameInMap("FileType")
        public Integer fileType;

        @NameInMap("OssUrl")
        public String ossUrl;

        public static ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList build(java.util.Map<String, ?> map) throws Exception {
            ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList self = new ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList();
            return TeaModel.build(map, self);
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }
        public String getFileMd5() {
            return this.fileMd5;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

    }

    public static class ListUserFbIssuesResponseBodyDataFeedbackIssueData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClientModel")
        public String clientModel;

        @NameInMap("ClientSn")
        public String clientSn;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("FbType")
        public Integer fbType;

        @NameInMap("FileList")
        public java.util.List<ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList> fileList;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("IssueId")
        public Integer issueId;

        @NameInMap("IssueLabel")
        public String issueLabel;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Title")
        public String title;

        @NameInMap("UserEmail")
        public String userEmail;

        @NameInMap("UserId")
        public String userId;

        public static ListUserFbIssuesResponseBodyDataFeedbackIssueData build(java.util.Map<String, ?> map) throws Exception {
            ListUserFbIssuesResponseBodyDataFeedbackIssueData self = new ListUserFbIssuesResponseBodyDataFeedbackIssueData();
            return TeaModel.build(map, self);
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setClientModel(String clientModel) {
            this.clientModel = clientModel;
            return this;
        }
        public String getClientModel() {
            return this.clientModel;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setClientSn(String clientSn) {
            this.clientSn = clientSn;
            return this;
        }
        public String getClientSn() {
            return this.clientSn;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setFbType(Integer fbType) {
            this.fbType = fbType;
            return this;
        }
        public Integer getFbType() {
            return this.fbType;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setFileList(java.util.List<ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<ListUserFbIssuesResponseBodyDataFeedbackIssueDataFileList> getFileList() {
            return this.fileList;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setIssueId(Integer issueId) {
            this.issueId = issueId;
            return this;
        }
        public Integer getIssueId() {
            return this.issueId;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setIssueLabel(String issueLabel) {
            this.issueLabel = issueLabel;
            return this;
        }
        public String getIssueLabel() {
            return this.issueLabel;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public ListUserFbIssuesResponseBodyDataFeedbackIssueData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListUserFbIssuesResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public String count;

        @NameInMap("FeedbackIssueData")
        public java.util.List<ListUserFbIssuesResponseBodyDataFeedbackIssueData> feedbackIssueData;

        public static ListUserFbIssuesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserFbIssuesResponseBodyData self = new ListUserFbIssuesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserFbIssuesResponseBodyData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public ListUserFbIssuesResponseBodyData setFeedbackIssueData(java.util.List<ListUserFbIssuesResponseBodyDataFeedbackIssueData> feedbackIssueData) {
            this.feedbackIssueData = feedbackIssueData;
            return this;
        }
        public java.util.List<ListUserFbIssuesResponseBodyDataFeedbackIssueData> getFeedbackIssueData() {
            return this.feedbackIssueData;
        }

    }

}
