// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadDetailsResponseBody extends TeaModel {
    @NameInMap("NonExistMediaIds")
    public java.util.List<String> nonExistMediaIds;

    @NameInMap("UploadDetails")
    public java.util.List<GetUploadDetailsResponseBodyUploadDetails> uploadDetails;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ForbiddenMediaIds")
    public java.util.List<String> forbiddenMediaIds;

    public static GetUploadDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadDetailsResponseBody self = new GetUploadDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadDetailsResponseBody setNonExistMediaIds(java.util.List<String> nonExistMediaIds) {
        this.nonExistMediaIds = nonExistMediaIds;
        return this;
    }
    public java.util.List<String> getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    public GetUploadDetailsResponseBody setUploadDetails(java.util.List<GetUploadDetailsResponseBodyUploadDetails> uploadDetails) {
        this.uploadDetails = uploadDetails;
        return this;
    }
    public java.util.List<GetUploadDetailsResponseBodyUploadDetails> getUploadDetails() {
        return this.uploadDetails;
    }

    public GetUploadDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUploadDetailsResponseBody setForbiddenMediaIds(java.util.List<String> forbiddenMediaIds) {
        this.forbiddenMediaIds = forbiddenMediaIds;
        return this;
    }
    public java.util.List<String> getForbiddenMediaIds() {
        return this.forbiddenMediaIds;
    }

    public static class GetUploadDetailsResponseBodyUploadDetails extends TeaModel {
        @NameInMap("UploadSource")
        public String uploadSource;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("UploadIP")
        public String uploadIP;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("CompletionTime")
        public String completionTime;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("UploadSize")
        public Long uploadSize;

        @NameInMap("UploadRatio")
        public Float uploadRatio;

        @NameInMap("UploadStatus")
        public String uploadStatus;

        @NameInMap("Title")
        public String title;

        @NameInMap("FileSize")
        public Long fileSize;

        public static GetUploadDetailsResponseBodyUploadDetails build(java.util.Map<String, ?> map) throws Exception {
            GetUploadDetailsResponseBodyUploadDetails self = new GetUploadDetailsResponseBodyUploadDetails();
            return TeaModel.build(map, self);
        }

        public GetUploadDetailsResponseBodyUploadDetails setUploadSource(String uploadSource) {
            this.uploadSource = uploadSource;
            return this;
        }
        public String getUploadSource() {
            return this.uploadSource;
        }

        public GetUploadDetailsResponseBodyUploadDetails setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetUploadDetailsResponseBodyUploadDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUploadDetailsResponseBodyUploadDetails setUploadIP(String uploadIP) {
            this.uploadIP = uploadIP;
            return this;
        }
        public String getUploadIP() {
            return this.uploadIP;
        }

        public GetUploadDetailsResponseBodyUploadDetails setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public GetUploadDetailsResponseBodyUploadDetails setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetUploadDetailsResponseBodyUploadDetails setCompletionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public String getCompletionTime() {
            return this.completionTime;
        }

        public GetUploadDetailsResponseBodyUploadDetails setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetUploadDetailsResponseBodyUploadDetails setUploadSize(Long uploadSize) {
            this.uploadSize = uploadSize;
            return this;
        }
        public Long getUploadSize() {
            return this.uploadSize;
        }

        public GetUploadDetailsResponseBodyUploadDetails setUploadRatio(Float uploadRatio) {
            this.uploadRatio = uploadRatio;
            return this;
        }
        public Float getUploadRatio() {
            return this.uploadRatio;
        }

        public GetUploadDetailsResponseBodyUploadDetails setUploadStatus(String uploadStatus) {
            this.uploadStatus = uploadStatus;
            return this;
        }
        public String getUploadStatus() {
            return this.uploadStatus;
        }

        public GetUploadDetailsResponseBodyUploadDetails setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetUploadDetailsResponseBodyUploadDetails setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

    }

}
