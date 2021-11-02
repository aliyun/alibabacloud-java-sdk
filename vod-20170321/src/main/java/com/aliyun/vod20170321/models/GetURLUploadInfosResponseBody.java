// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetURLUploadInfosResponseBody extends TeaModel {
    @NameInMap("NonExists")
    public java.util.List<String> nonExists;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("URLUploadInfoList")
    public java.util.List<GetURLUploadInfosResponseBodyURLUploadInfoList> URLUploadInfoList;

    public static GetURLUploadInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetURLUploadInfosResponseBody self = new GetURLUploadInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetURLUploadInfosResponseBody setNonExists(java.util.List<String> nonExists) {
        this.nonExists = nonExists;
        return this;
    }
    public java.util.List<String> getNonExists() {
        return this.nonExists;
    }

    public GetURLUploadInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetURLUploadInfosResponseBody setURLUploadInfoList(java.util.List<GetURLUploadInfosResponseBodyURLUploadInfoList> URLUploadInfoList) {
        this.URLUploadInfoList = URLUploadInfoList;
        return this;
    }
    public java.util.List<GetURLUploadInfosResponseBodyURLUploadInfoList> getURLUploadInfoList() {
        return this.URLUploadInfoList;
    }

    public static class GetURLUploadInfosResponseBodyURLUploadInfoList extends TeaModel {
        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UploadURL")
        public String uploadURL;

        @NameInMap("UserData")
        public String userData;

        public static GetURLUploadInfosResponseBodyURLUploadInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetURLUploadInfosResponseBodyURLUploadInfoList self = new GetURLUploadInfosResponseBodyURLUploadInfoList();
            return TeaModel.build(map, self);
        }

        public GetURLUploadInfosResponseBodyURLUploadInfoList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetURLUploadInfosResponseBodyURLUploadInfoList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetURLUploadInfosResponseBodyURLUploadInfoList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetURLUploadInfosResponseBodyURLUploadInfoList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetURLUploadInfosResponseBodyURLUploadInfoList setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public GetURLUploadInfosResponseBodyURLUploadInfoList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetURLUploadInfosResponseBodyURLUploadInfoList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetURLUploadInfosResponseBodyURLUploadInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetURLUploadInfosResponseBodyURLUploadInfoList setUploadURL(String uploadURL) {
            this.uploadURL = uploadURL;
            return this;
        }
        public String getUploadURL() {
            return this.uploadURL;
        }

        public GetURLUploadInfosResponseBodyURLUploadInfoList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
