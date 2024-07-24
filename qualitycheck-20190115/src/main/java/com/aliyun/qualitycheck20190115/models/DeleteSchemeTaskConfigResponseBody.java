// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteSchemeTaskConfigResponseBody extends TeaModel {
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
    public DeleteSchemeTaskConfigResponseBodyMessages messages;

    /**
     * <strong>example:</strong>
     * <p>82C91484-B2D5-4D2A-A21F-A6D73F4D55C6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteSchemeTaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemeTaskConfigResponseBody self = new DeleteSchemeTaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSchemeTaskConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSchemeTaskConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteSchemeTaskConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSchemeTaskConfigResponseBody setMessages(DeleteSchemeTaskConfigResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public DeleteSchemeTaskConfigResponseBodyMessages getMessages() {
        return this.messages;
    }

    public DeleteSchemeTaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSchemeTaskConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteSchemeTaskConfigResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static DeleteSchemeTaskConfigResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            DeleteSchemeTaskConfigResponseBodyMessages self = new DeleteSchemeTaskConfigResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public DeleteSchemeTaskConfigResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
