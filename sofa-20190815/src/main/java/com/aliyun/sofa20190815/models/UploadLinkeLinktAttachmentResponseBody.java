// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeLinktAttachmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public UploadLinkeLinktAttachmentResponseBodyData data;

    public static UploadLinkeLinktAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeLinktAttachmentResponseBody self = new UploadLinkeLinktAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadLinkeLinktAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadLinkeLinktAttachmentResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadLinkeLinktAttachmentResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UploadLinkeLinktAttachmentResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public UploadLinkeLinktAttachmentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UploadLinkeLinktAttachmentResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UploadLinkeLinktAttachmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UploadLinkeLinktAttachmentResponseBody setData(UploadLinkeLinktAttachmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadLinkeLinktAttachmentResponseBodyData getData() {
        return this.data;
    }

    public static class UploadLinkeLinktAttachmentResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Filename")
        public String filename;

        @NameInMap("Id")
        public Long id;

        @NameInMap("StoredFilename")
        public String storedFilename;

        @NameInMap("Target")
        public String target;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Url")
        public String url;

        public static UploadLinkeLinktAttachmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadLinkeLinktAttachmentResponseBodyData self = new UploadLinkeLinktAttachmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadLinkeLinktAttachmentResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public UploadLinkeLinktAttachmentResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UploadLinkeLinktAttachmentResponseBodyData setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public UploadLinkeLinktAttachmentResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UploadLinkeLinktAttachmentResponseBodyData setStoredFilename(String storedFilename) {
            this.storedFilename = storedFilename;
            return this;
        }
        public String getStoredFilename() {
            return this.storedFilename;
        }

        public UploadLinkeLinktAttachmentResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public UploadLinkeLinktAttachmentResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public UploadLinkeLinktAttachmentResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public UploadLinkeLinktAttachmentResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
