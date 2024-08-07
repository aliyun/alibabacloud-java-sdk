// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateCheckTypeToSchemeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Data")
    public Long data;

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
    public CreateCheckTypeToSchemeResponseBodyMessages messages;

    /**
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24F4CE647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateCheckTypeToSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckTypeToSchemeResponseBody self = new CreateCheckTypeToSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCheckTypeToSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCheckTypeToSchemeResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateCheckTypeToSchemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateCheckTypeToSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCheckTypeToSchemeResponseBody setMessages(CreateCheckTypeToSchemeResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public CreateCheckTypeToSchemeResponseBodyMessages getMessages() {
        return this.messages;
    }

    public CreateCheckTypeToSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCheckTypeToSchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCheckTypeToSchemeResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static CreateCheckTypeToSchemeResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckTypeToSchemeResponseBodyMessages self = new CreateCheckTypeToSchemeResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public CreateCheckTypeToSchemeResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
