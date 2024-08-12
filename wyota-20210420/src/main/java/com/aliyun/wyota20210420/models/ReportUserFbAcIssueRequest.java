// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ReportUserFbAcIssueRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("FileList")
    public java.util.List<ReportUserFbAcIssueRequestFileList> fileList;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("ReservedA")
    public String reservedA;

    @NameInMap("ReservedB")
    public String reservedB;

    @NameInMap("UserEmail")
    public String userEmail;

    public static ReportUserFbAcIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportUserFbAcIssueRequest self = new ReportUserFbAcIssueRequest();
        return TeaModel.build(map, self);
    }

    public ReportUserFbAcIssueRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ReportUserFbAcIssueRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public ReportUserFbAcIssueRequest setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ReportUserFbAcIssueRequest setFileList(java.util.List<ReportUserFbAcIssueRequestFileList> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<ReportUserFbAcIssueRequestFileList> getFileList() {
        return this.fileList;
    }

    public ReportUserFbAcIssueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReportUserFbAcIssueRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ReportUserFbAcIssueRequest setReservedA(String reservedA) {
        this.reservedA = reservedA;
        return this;
    }
    public String getReservedA() {
        return this.reservedA;
    }

    public ReportUserFbAcIssueRequest setReservedB(String reservedB) {
        this.reservedB = reservedB;
        return this;
    }
    public String getReservedB() {
        return this.reservedB;
    }

    public ReportUserFbAcIssueRequest setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }
    public String getUserEmail() {
        return this.userEmail;
    }

    public static class ReportUserFbAcIssueRequestFileList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileSize")
        public Integer fileSize;

        @NameInMap("FileType")
        public Integer fileType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static ReportUserFbAcIssueRequestFileList build(java.util.Map<String, ?> map) throws Exception {
            ReportUserFbAcIssueRequestFileList self = new ReportUserFbAcIssueRequestFileList();
            return TeaModel.build(map, self);
        }

        public ReportUserFbAcIssueRequestFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ReportUserFbAcIssueRequestFileList setFileSize(Integer fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Integer getFileSize() {
            return this.fileSize;
        }

        public ReportUserFbAcIssueRequestFileList setFileType(Integer fileType) {
            this.fileType = fileType;
            return this;
        }
        public Integer getFileType() {
            return this.fileType;
        }

        public ReportUserFbAcIssueRequestFileList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
