// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktIterationmeetingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public CreateLinkeLinktIterationmeetingResponseBodyData data;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeLinktIterationmeetingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktIterationmeetingResponseBody self = new CreateLinkeLinktIterationmeetingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktIterationmeetingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeLinktIterationmeetingResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeLinktIterationmeetingResponseBody setData(CreateLinkeLinktIterationmeetingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLinkeLinktIterationmeetingResponseBodyData getData() {
        return this.data;
    }

    public CreateLinkeLinktIterationmeetingResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public CreateLinkeLinktIterationmeetingResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLinkeLinktIterationmeetingResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeLinktIterationmeetingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeLinktIterationmeetingResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeLinktIterationmeetingResponseBodyData extends TeaModel {
        @NameInMap("IterationSign")
        public String iterationSign;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Attachments")
        public java.util.List<String> attachments;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Title")
        public String title;

        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Creator")
        public String creator;

        public static CreateLinkeLinktIterationmeetingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeLinktIterationmeetingResponseBodyData self = new CreateLinkeLinktIterationmeetingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLinkeLinktIterationmeetingResponseBodyData setIterationSign(String iterationSign) {
            this.iterationSign = iterationSign;
            return this;
        }
        public String getIterationSign() {
            return this.iterationSign;
        }

        public CreateLinkeLinktIterationmeetingResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public CreateLinkeLinktIterationmeetingResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeLinktIterationmeetingResponseBodyData setAttachments(java.util.List<String> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<String> getAttachments() {
            return this.attachments;
        }

        public CreateLinkeLinktIterationmeetingResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateLinkeLinktIterationmeetingResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeLinktIterationmeetingResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateLinkeLinktIterationmeetingResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateLinkeLinktIterationmeetingResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeLinktIterationmeetingResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

    }

}
