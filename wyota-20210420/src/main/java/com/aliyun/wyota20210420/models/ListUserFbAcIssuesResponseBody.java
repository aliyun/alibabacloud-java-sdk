// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListUserFbAcIssuesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListUserFbAcIssuesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListUserFbAcIssuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserFbAcIssuesResponseBody self = new ListUserFbAcIssuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserFbAcIssuesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUserFbAcIssuesResponseBody setData(ListUserFbAcIssuesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUserFbAcIssuesResponseBodyData getData() {
        return this.data;
    }

    public ListUserFbAcIssuesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUserFbAcIssuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUserFbAcIssuesResponseBodyDataIssueDataListFileList extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileSize")
        public Integer fileSize;

        @NameInMap("FileType")
        public Integer fileType;

        @NameInMap("SessionId")
        public String sessionId;

        public static ListUserFbAcIssuesResponseBodyDataIssueDataListFileList build(java.util.Map<String, ?> map) throws Exception {
            ListUserFbAcIssuesResponseBodyDataIssueDataListFileList self = new ListUserFbAcIssuesResponseBodyDataIssueDataListFileList();
            return TeaModel.build(map, self);
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataListFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataListFileList setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataListFileList setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataListFileList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class ListUserFbAcIssuesResponseBodyDataIssueDataList extends TeaModel {
        @NameInMap("Account")
        public String account;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FileList")
        public java.util.List<ListUserFbAcIssuesResponseBodyDataIssueDataListFileList> fileList;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IssueId")
        public Long issueId;

        @NameInMap("Label")
        public String label;

        @NameInMap("ReservedA")
        public String reservedA;

        @NameInMap("ReservedB")
        public String reservedB;

        @NameInMap("UserEmail")
        public String userEmail;

        public static ListUserFbAcIssuesResponseBodyDataIssueDataList build(java.util.Map<String, ?> map) throws Exception {
            ListUserFbAcIssuesResponseBodyDataIssueDataList self = new ListUserFbAcIssuesResponseBodyDataIssueDataList();
            return TeaModel.build(map, self);
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setFileList(java.util.List<ListUserFbAcIssuesResponseBodyDataIssueDataListFileList> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<ListUserFbAcIssuesResponseBodyDataIssueDataListFileList> getFileList() {
            return this.fileList;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setIssueId(Long issueId) {
            this.issueId = issueId;
            return this;
        }
        public Long getIssueId() {
            return this.issueId;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setReservedA(String reservedA) {
            this.reservedA = reservedA;
            return this;
        }
        public String getReservedA() {
            return this.reservedA;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setReservedB(String reservedB) {
            this.reservedB = reservedB;
            return this;
        }
        public String getReservedB() {
            return this.reservedB;
        }

        public ListUserFbAcIssuesResponseBodyDataIssueDataList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

    }

    public static class ListUserFbAcIssuesResponseBodyData extends TeaModel {
        @NameInMap("IssueDataList")
        public java.util.List<ListUserFbAcIssuesResponseBodyDataIssueDataList> issueDataList;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListUserFbAcIssuesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserFbAcIssuesResponseBodyData self = new ListUserFbAcIssuesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserFbAcIssuesResponseBodyData setIssueDataList(java.util.List<ListUserFbAcIssuesResponseBodyDataIssueDataList> issueDataList) {
            this.issueDataList = issueDataList;
            return this;
        }
        public java.util.List<ListUserFbAcIssuesResponseBodyDataIssueDataList> getIssueDataList() {
            return this.issueDataList;
        }

        public ListUserFbAcIssuesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
