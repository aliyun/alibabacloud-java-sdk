// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadDetailsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the media files that cannot be accessed.</p>
     */
    @NameInMap("ForbiddenMediaIds")
    public java.util.List<String> forbiddenMediaIds;

    /**
     * <p>The IDs of the media files that do not exist.</p>
     */
    @NameInMap("NonExistMediaIds")
    public java.util.List<String> nonExistMediaIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9E290613-04F4-47F4-795D30732077****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The upload details.</p>
     */
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
        /**
         * <p>The time when the upload job was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-28T09:45:07Z</p>
         */
        @NameInMap("CompletionTime")
        public String completionTime;

        /**
         * <p>The time when the upload job was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-28T09:42:07Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The device model.</p>
         * 
         * <strong>example:</strong>
         * <p>Chrome</p>
         */
        @NameInMap("DeviceModel")
        public String deviceModel;

        /**
         * <p>The size of the uploaded file. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>46</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The ID of the uploaded audio or video.</p>
         * 
         * <strong>example:</strong>
         * <p>61ccbdb06fa83012be4d8083f6****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The time when the information about the media file was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-28T09:43:12Z</p>
         */
        @NameInMap("ModificationTime")
        public String modificationTime;

        /**
         * <p>The status of the video. For more information about the valid values and value description of the parameter, see the &quot;Status: the status of a video&quot; section of the <a href="https://help.aliyun.com/document_detail/52839.html">Basic structures</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>Uploading</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The title of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>Test details</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The IP address of the server that uploads the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("UploadIP")
        public String uploadIP;

        /**
         * <p>The upload ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>0.038</p>
         */
        @NameInMap("UploadRatio")
        public Float uploadRatio;

        /**
         * <p>The upload size. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>346</p>
         */
        @NameInMap("UploadSize")
        public Long uploadSize;

        /**
         * <p>The method that is used to upload the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>WebSDK</p>
         */
        @NameInMap("UploadSource")
        public String uploadSource;

        /**
         * <p>The status of the upload job. For more information about the valid values and value description of the parameter, see the &quot;Status: the status of a URL-based upload job&quot; section of the <a href="https://help.aliyun.com/document_detail/52839.html">Basic structures</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>Uploading</p>
         */
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
