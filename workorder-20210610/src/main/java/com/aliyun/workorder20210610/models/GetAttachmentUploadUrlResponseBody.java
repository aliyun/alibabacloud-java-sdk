// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class GetAttachmentUploadUrlResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned after the call succeeds.</p>
     */
    @NameInMap("Data")
    public GetAttachmentUploadUrlResponseBodyData data;

    /**
     * <p>The error message. If success is set to false, the message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ED195C2C-787F-511C-8204-714456781861</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call is normal.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAttachmentUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAttachmentUploadUrlResponseBody self = new GetAttachmentUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAttachmentUploadUrlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAttachmentUploadUrlResponseBody setData(GetAttachmentUploadUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAttachmentUploadUrlResponseBodyData getData() {
        return this.data;
    }

    public GetAttachmentUploadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAttachmentUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAttachmentUploadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAttachmentUploadUrlResponseBodyData extends TeaModel {
        /**
         * <p>Query the signed URL of an OSS object</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gts-workorder-pre.oss-cn-beijing.aliyuncs.com">https://gts-workorder-pre.oss-cn-beijing.aliyuncs.com</a>
         * /20220314/cabb80c3-430b-4079-a9f2-d2a0d1c2a587.png?Expires=1647328689&amp;OSSAccessKeyId=LTAI****************&amp;Signature=AbSEh26G3oYrJ8ivr4B0xzF89zk%3D</p>
         */
        @NameInMap("GetSignedUrl")
        public String getSignedUrl;

        /**
         * <p>Uploaded file identifier</p>
         * 
         * <strong>example:</strong>
         * <p>cdb5d174-c282-4b2d-9048-e74ea2223127.jpg</p>
         */
        @NameInMap("ObjectKey")
        public String objectKey;

        /**
         * <p>The signed URL used to upload the object to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gts-workorder-pre.oss-cn-beijing.aliyuncs.com">https://gts-workorder-pre.oss-cn-beijing.aliyuncs.com</a>
         * /20220314/cabb80c3-430b-4079-a9f2-d2a0d1c2a587.png?Expires=1647328689&amp;OSSAccessKeyId=LTAI****************&amp;Signature=AbSEh26G3oYrJ8ivr4B0xzF89zk%3D</p>
         */
        @NameInMap("PutSignedUrl")
        public String putSignedUrl;

        public static GetAttachmentUploadUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAttachmentUploadUrlResponseBodyData self = new GetAttachmentUploadUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAttachmentUploadUrlResponseBodyData setGetSignedUrl(String getSignedUrl) {
            this.getSignedUrl = getSignedUrl;
            return this;
        }
        public String getGetSignedUrl() {
            return this.getSignedUrl;
        }

        public GetAttachmentUploadUrlResponseBodyData setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public GetAttachmentUploadUrlResponseBodyData setPutSignedUrl(String putSignedUrl) {
            this.putSignedUrl = putSignedUrl;
            return this;
        }
        public String getPutSignedUrl() {
            return this.putSignedUrl;
        }

    }

}
