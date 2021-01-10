// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktIterationmeetingResponseBody extends TeaModel {
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
    public QueryLinkeLinktIterationmeetingResponseBodyData data;

    public static QueryLinkeLinktIterationmeetingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktIterationmeetingResponseBody self = new QueryLinkeLinktIterationmeetingResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktIterationmeetingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktIterationmeetingResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktIterationmeetingResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktIterationmeetingResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktIterationmeetingResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktIterationmeetingResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktIterationmeetingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktIterationmeetingResponseBody setData(QueryLinkeLinktIterationmeetingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkeLinktIterationmeetingResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkeLinktIterationmeetingResponseBodyData extends TeaModel {
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

        public static QueryLinkeLinktIterationmeetingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktIterationmeetingResponseBodyData self = new QueryLinkeLinktIterationmeetingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktIterationmeetingResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryLinkeLinktIterationmeetingResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinktIterationmeetingResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryLinkeLinktIterationmeetingResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeLinktIterationmeetingResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeLinktIterationmeetingResponseBodyData setIterationSign(String iterationSign) {
            this.iterationSign = iterationSign;
            return this;
        }
        public String getIterationSign() {
            return this.iterationSign;
        }

        public QueryLinkeLinktIterationmeetingResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public QueryLinkeLinktIterationmeetingResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryLinkeLinktIterationmeetingResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeLinktIterationmeetingResponseBodyData setAttachments(java.util.List<String> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<String> getAttachments() {
            return this.attachments;
        }

    }

}
