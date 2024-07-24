// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class BatchSubmitReviewInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public BatchSubmitReviewInfoResponseBodyMessages messages;

    /**
     * <strong>example:</strong>
     * <p>F190ADE9-619A-447D-84E3-7E241A5C428E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchSubmitReviewInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSubmitReviewInfoResponseBody self = new BatchSubmitReviewInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSubmitReviewInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchSubmitReviewInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchSubmitReviewInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchSubmitReviewInfoResponseBody setMessages(BatchSubmitReviewInfoResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public BatchSubmitReviewInfoResponseBodyMessages getMessages() {
        return this.messages;
    }

    public BatchSubmitReviewInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchSubmitReviewInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchSubmitReviewInfoResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static BatchSubmitReviewInfoResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            BatchSubmitReviewInfoResponseBodyMessages self = new BatchSubmitReviewInfoResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public BatchSubmitReviewInfoResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
