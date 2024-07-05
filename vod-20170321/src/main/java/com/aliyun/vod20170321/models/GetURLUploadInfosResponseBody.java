// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetURLUploadInfosResponseBody extends TeaModel {
    /**
     * <p>The job IDs or upload URLs that do not exist.</p>
     */
    @NameInMap("NonExists")
    public java.util.List<String> nonExists;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4AF6-D7393642CA58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about URL-based upload jobs. For more information, see the &quot;URLUploadInfo: the information about a URL-based upload job&quot; section of the <a href="https://help.aliyun.com/document_detail/52839.html">Basic structures</a> topic.</p>
     */
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
        /**
         * <p>The time when the upload job was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:11:01Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the upload job was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01T01:01:01Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>error_message</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The size of the uploaded media file. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The ID of the upload job.</p>
         * 
         * <strong>example:</strong>
         * <p>86c1925fba0****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the uploaded media file.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f54b6e91d24d81d4****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The status of the URL-based upload job. For more information about the valid values and value description of the parameter, see the &quot;Status: the status of a video&quot; section of the <a href="https://help.aliyun.com/document_detail/52839.html">Basic structures</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The upload URL of the source file.</p>
         * <blockquote>
         * <p>A maximum of 100 URLs can be returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>http://****.mp4</p>
         */
        @NameInMap("UploadURL")
        public String uploadURL;

        /**
         * <p>The custom configurations. The value is a JSON string. For more information, see the &quot;UserData: specifies the custom configurations for media upload&quot; section of the <a href="https://help.aliyun.com/document_detail/86952.html">Request parameters</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MessageCallback&quot;:&quot;{&quot;CallbackURL&quot;:&quot;<a href="http://example.aliyundoc.com%22%7D">http://example.aliyundoc.com&quot;}</a>&quot;, &quot;Extend&quot;:&quot;{&quot;localId&quot;:&quot;***&quot;, &quot;test&quot;:&quot;www&quot;}&quot;}</p>
         */
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
