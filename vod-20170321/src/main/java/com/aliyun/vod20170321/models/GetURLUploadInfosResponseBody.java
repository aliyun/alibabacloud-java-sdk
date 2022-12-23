// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetURLUploadInfosResponseBody extends TeaModel {
    // The job IDs or upload URLs that do not exist.
    @NameInMap("NonExists")
    public java.util.List<String> nonExists;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information about URL-based upload jobs. For more information, see the "URLUploadInfo: the information about a URL-based upload job" section of the [Basic structures](~~52839~~) topic.
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
        // The time when the upload job was complete. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CompleteTime")
        public String completeTime;

        // The time when the upload job was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The error code returned.
        @NameInMap("ErrorCode")
        public String errorCode;

        // The error message returned.
        @NameInMap("ErrorMessage")
        public String errorMessage;

        // The size of the uploaded media file. Unit: byte.
        @NameInMap("FileSize")
        public String fileSize;

        // The ID of the upload job.
        @NameInMap("JobId")
        public String jobId;

        // The ID of the uploaded media file.
        @NameInMap("MediaId")
        public String mediaId;

        // The status of the URL-based upload job. For more information about the valid values and value description of the parameter, see the "Status: the status of a video" section of the [Basic structures](~~52839~~) topic.
        @NameInMap("Status")
        public String status;

        // The upload URL of the source file.
        // 
        // > A maximum of 100 URLs can be returned.
        @NameInMap("UploadURL")
        public String uploadURL;

        // The custom configurations. The value is a JSON string. For more information, see the "UserData: specifies the custom configurations for media upload" section of the [Request parameters](~~86952~~) topic.
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
