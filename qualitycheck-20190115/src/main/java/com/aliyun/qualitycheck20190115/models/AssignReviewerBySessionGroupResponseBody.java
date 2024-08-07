// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AssignReviewerBySessionGroupResponseBody extends TeaModel {
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
    public AssignReviewerBySessionGroupResponseBodyMessages messages;

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

    public static AssignReviewerBySessionGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssignReviewerBySessionGroupResponseBody self = new AssignReviewerBySessionGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AssignReviewerBySessionGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AssignReviewerBySessionGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AssignReviewerBySessionGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AssignReviewerBySessionGroupResponseBody setMessages(AssignReviewerBySessionGroupResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public AssignReviewerBySessionGroupResponseBodyMessages getMessages() {
        return this.messages;
    }

    public AssignReviewerBySessionGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssignReviewerBySessionGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AssignReviewerBySessionGroupResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static AssignReviewerBySessionGroupResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            AssignReviewerBySessionGroupResponseBodyMessages self = new AssignReviewerBySessionGroupResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public AssignReviewerBySessionGroupResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
