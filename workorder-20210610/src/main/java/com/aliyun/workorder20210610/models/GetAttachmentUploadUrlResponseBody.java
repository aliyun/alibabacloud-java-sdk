// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class GetAttachmentUploadUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetAttachmentUploadUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("GetSignedUrl")
        public String getSignedUrl;

        @NameInMap("ObjectKey")
        public String objectKey;

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
