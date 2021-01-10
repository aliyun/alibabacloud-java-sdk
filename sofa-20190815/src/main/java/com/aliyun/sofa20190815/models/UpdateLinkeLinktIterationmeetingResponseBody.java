// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktIterationmeetingResponseBody extends TeaModel {
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
    public UpdateLinkeLinktIterationmeetingResponseBodyData data;

    public static UpdateLinkeLinktIterationmeetingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktIterationmeetingResponseBody self = new UpdateLinkeLinktIterationmeetingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktIterationmeetingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeLinktIterationmeetingResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeLinktIterationmeetingResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeLinktIterationmeetingResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public UpdateLinkeLinktIterationmeetingResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeLinktIterationmeetingResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeLinktIterationmeetingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeLinktIterationmeetingResponseBody setData(UpdateLinkeLinktIterationmeetingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLinkeLinktIterationmeetingResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateLinkeLinktIterationmeetingResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IterationSign")
        public String iterationSign;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Title")
        public String title;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Attachments")
        public java.util.List<String> attachments;

        public static UpdateLinkeLinktIterationmeetingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeLinktIterationmeetingResponseBodyData self = new UpdateLinkeLinktIterationmeetingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeLinktIterationmeetingResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateLinkeLinktIterationmeetingResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeLinktIterationmeetingResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateLinkeLinktIterationmeetingResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UpdateLinkeLinktIterationmeetingResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeLinktIterationmeetingResponseBodyData setIterationSign(String iterationSign) {
            this.iterationSign = iterationSign;
            return this;
        }
        public String getIterationSign() {
            return this.iterationSign;
        }

        public UpdateLinkeLinktIterationmeetingResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public UpdateLinkeLinktIterationmeetingResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateLinkeLinktIterationmeetingResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeLinktIterationmeetingResponseBodyData setAttachments(java.util.List<String> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<String> getAttachments() {
            return this.attachments;
        }

    }

}
