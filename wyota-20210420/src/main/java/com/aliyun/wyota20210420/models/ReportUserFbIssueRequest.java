// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportUserFbIssueRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ClientAppVersion")
    public String clientAppVersion;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientModel")
    public String clientModel;

    @NameInMap("ClientOsName")
    public String clientOsName;

    @NameInMap("ClientSn")
    public String clientSn;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("CustomerId")
    public String customerId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("DesktopType")
    public Integer desktopType;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("FbType")
    public Integer fbType;

    @NameInMap("FileList")
    public java.util.List<ReportUserFbIssueRequestFileList> fileList;

    @NameInMap("IsSubstituteReport")
    public Boolean isSubstituteReport;

    @NameInMap("IssueLabel")
    public String issueLabel;

    @NameInMap("LoginRegionId")
    public String loginRegionId;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("OccurTime")
    public Long occurTime;

    @NameInMap("ReservedA")
    public String reservedA;

    @NameInMap("ReservedB")
    public String reservedB;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TelNo")
    public String telNo;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserEmail")
    public String userEmail;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("WyId")
    public String wyId;

    public static ReportUserFbIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportUserFbIssueRequest self = new ReportUserFbIssueRequest();
        return TeaModel.build(map, self);
    }

    public ReportUserFbIssueRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ReportUserFbIssueRequest setClientAppVersion(String clientAppVersion) {
        this.clientAppVersion = clientAppVersion;
        return this;
    }
    public String getClientAppVersion() {
        return this.clientAppVersion;
    }

    public ReportUserFbIssueRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ReportUserFbIssueRequest setClientModel(String clientModel) {
        this.clientModel = clientModel;
        return this;
    }
    public String getClientModel() {
        return this.clientModel;
    }

    public ReportUserFbIssueRequest setClientOsName(String clientOsName) {
        this.clientOsName = clientOsName;
        return this;
    }
    public String getClientOsName() {
        return this.clientOsName;
    }

    public ReportUserFbIssueRequest setClientSn(String clientSn) {
        this.clientSn = clientSn;
        return this;
    }
    public String getClientSn() {
        return this.clientSn;
    }

    public ReportUserFbIssueRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public ReportUserFbIssueRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public ReportUserFbIssueRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ReportUserFbIssueRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ReportUserFbIssueRequest setDesktopType(Integer desktopType) {
        this.desktopType = desktopType;
        return this;
    }
    public Integer getDesktopType() {
        return this.desktopType;
    }

    public ReportUserFbIssueRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReportUserFbIssueRequest setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ReportUserFbIssueRequest setFbType(Integer fbType) {
        this.fbType = fbType;
        return this;
    }
    public Integer getFbType() {
        return this.fbType;
    }

    public ReportUserFbIssueRequest setFileList(java.util.List<ReportUserFbIssueRequestFileList> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<ReportUserFbIssueRequestFileList> getFileList() {
        return this.fileList;
    }

    public ReportUserFbIssueRequest setIsSubstituteReport(Boolean isSubstituteReport) {
        this.isSubstituteReport = isSubstituteReport;
        return this;
    }
    public Boolean getIsSubstituteReport() {
        return this.isSubstituteReport;
    }

    public ReportUserFbIssueRequest setIssueLabel(String issueLabel) {
        this.issueLabel = issueLabel;
        return this;
    }
    public String getIssueLabel() {
        return this.issueLabel;
    }

    public ReportUserFbIssueRequest setLoginRegionId(String loginRegionId) {
        this.loginRegionId = loginRegionId;
        return this;
    }
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    public ReportUserFbIssueRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public ReportUserFbIssueRequest setOccurTime(Long occurTime) {
        this.occurTime = occurTime;
        return this;
    }
    public Long getOccurTime() {
        return this.occurTime;
    }

    public ReportUserFbIssueRequest setReservedA(String reservedA) {
        this.reservedA = reservedA;
        return this;
    }
    public String getReservedA() {
        return this.reservedA;
    }

    public ReportUserFbIssueRequest setReservedB(String reservedB) {
        this.reservedB = reservedB;
        return this;
    }
    public String getReservedB() {
        return this.reservedB;
    }

    public ReportUserFbIssueRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ReportUserFbIssueRequest setTelNo(String telNo) {
        this.telNo = telNo;
        return this;
    }
    public String getTelNo() {
        return this.telNo;
    }

    public ReportUserFbIssueRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ReportUserFbIssueRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

    public ReportUserFbIssueRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ReportUserFbIssueRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ReportUserFbIssueRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ReportUserFbIssueRequest setWyId(String wyId) {
        this.wyId = wyId;
        return this;
    }
    public String getWyId() {
        return this.wyId;
    }

    public static class ReportUserFbIssueRequestFileList extends TeaModel {
        @NameInMap("FileMd5")
        public String fileMd5;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileSize")
        public Integer fileSize;

        @NameInMap("FileType")
        public Integer fileType;

        @NameInMap("OssUrl")
        public String ossUrl;

        @NameInMap("SessionId")
        public String sessionId;

        public static ReportUserFbIssueRequestFileList build(java.util.Map<String, ?> map) throws Exception {
            ReportUserFbIssueRequestFileList self = new ReportUserFbIssueRequestFileList();
            return TeaModel.build(map, self);
        }

        public ReportUserFbIssueRequestFileList setFileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }
        public String getFileMd5() {
            return this.fileMd5;
        }

        public ReportUserFbIssueRequestFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ReportUserFbIssueRequestFileList setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public ReportUserFbIssueRequestFileList setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ReportUserFbIssueRequestFileList setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public ReportUserFbIssueRequestFileList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
