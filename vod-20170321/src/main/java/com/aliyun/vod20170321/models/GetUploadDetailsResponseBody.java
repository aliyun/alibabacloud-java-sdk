// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadDetailsResponseBody extends TeaModel {
    // The IDs of the media files that cannot be accessed.
    @NameInMap("ForbiddenMediaIds")
    public java.util.List<String> forbiddenMediaIds;

    // The IDs of the media files that do not exist.
    @NameInMap("NonExistMediaIds")
    public java.util.List<String> nonExistMediaIds;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The upload details.
    @NameInMap("UploadDetails")
    public java.util.List<GetUploadDetailsResponseBodyUploadDetails> uploadDetails;

    public static GetUploadDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadDetailsResponseBody self = new GetUploadDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadDetailsResponseBody setForbiddenMediaIds(java.util.List<String> forbiddenMediaIds) {
        this.forbiddenMediaIds = forbiddenMediaIds;
        return this;
    }
    public java.util.List<String> getForbiddenMediaIds() {
        return this.forbiddenMediaIds;
    }

    public GetUploadDetailsResponseBody setNonExistMediaIds(java.util.List<String> nonExistMediaIds) {
        this.nonExistMediaIds = nonExistMediaIds;
        return this;
    }
    public java.util.List<String> getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    public GetUploadDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUploadDetailsResponseBody setUploadDetails(java.util.List<GetUploadDetailsResponseBodyUploadDetails> uploadDetails) {
        this.uploadDetails = uploadDetails;
        return this;
    }
    public java.util.List<GetUploadDetailsResponseBodyUploadDetails> getUploadDetails() {
        return this.uploadDetails;
    }

    public static class GetUploadDetailsResponseBodyUploadDetails extends TeaModel {
        // The time when the upload job was complete. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CompletionTime")
        public String completionTime;

        // The time when the upload job was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The device model.
        @NameInMap("DeviceModel")
        public String deviceModel;

        // The size of the uploaded file. Unit: byte.
        @NameInMap("FileSize")
        public Long fileSize;

        // The ID of the uploaded audio or video.
        @NameInMap("MediaId")
        public String mediaId;

        // The time when the information about the media file was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
        @NameInMap("ModificationTime")
        public String modificationTime;

        // The status of the video. For more information about the valid values and value description of the parameter, see the "Status: the status of a video" section of the [Basic structures](~~52839~~) topic.
        @NameInMap("Status")
        public String status;

        // The title of the media file.
        @NameInMap("Title")
        public String title;

        // The IP address of the server that uploads the media file.
        @NameInMap("UploadIP")
        public String uploadIP;

        // The upload ratio.
        @NameInMap("UploadRatio")
        public Float uploadRatio;

        // The upload size. Unit: byte.
        @NameInMap("UploadSize")
        public Long uploadSize;

        // The method that is used to upload the media file.
        @NameInMap("UploadSource")
        public String uploadSource;

        // The status of the upload job. For more information about the valid values and value description of the parameter, see the "Status: the status of a URL-based upload job" section of the [Basic structures](~~52839~~) topic.
        @NameInMap("UploadStatus")
        public String uploadStatus;

        public static GetUploadDetailsResponseBodyUploadDetails build(java.util.Map<String, ?> map) throws Exception {
            GetUploadDetailsResponseBodyUploadDetails self = new GetUploadDetailsResponseBodyUploadDetails();
            return TeaModel.build(map, self);
        }

        public GetUploadDetailsResponseBodyUploadDetails setCompletionTime(String completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public String getCompletionTime() {
            return this.completionTime;
        }

        public GetUploadDetailsResponseBodyUploadDetails setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetUploadDetailsResponseBodyUploadDetails setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public GetUploadDetailsResponseBodyUploadDetails setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetUploadDetailsResponseBodyUploadDetails setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetUploadDetailsResponseBodyUploadDetails setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public GetUploadDetailsResponseBodyUploadDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUploadDetailsResponseBodyUploadDetails setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetUploadDetailsResponseBodyUploadDetails setUploadIP(String uploadIP) {
            this.uploadIP = uploadIP;
            return this;
        }
        public String getUploadIP() {
            return this.uploadIP;
        }

        public GetUploadDetailsResponseBodyUploadDetails setUploadRatio(Float uploadRatio) {
            this.uploadRatio = uploadRatio;
            return this;
        }
        public Float getUploadRatio() {
            return this.uploadRatio;
        }

        public GetUploadDetailsResponseBodyUploadDetails setUploadSize(Long uploadSize) {
            this.uploadSize = uploadSize;
            return this;
        }
        public Long getUploadSize() {
            return this.uploadSize;
        }

        public GetUploadDetailsResponseBodyUploadDetails setUploadSource(String uploadSource) {
            this.uploadSource = uploadSource;
            return this;
        }
        public String getUploadSource() {
            return this.uploadSource;
        }

        public GetUploadDetailsResponseBodyUploadDetails setUploadStatus(String uploadStatus) {
            this.uploadStatus = uploadStatus;
            return this;
        }
        public String getUploadStatus() {
            return this.uploadStatus;
        }

    }

}
