// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateSchemeTaskConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>22</p>
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
    public CreateSchemeTaskConfigResponseBodyMessages messages;

    /**
     * <strong>example:</strong>
     * <p>3CEA0495-341B-4482-9AD9-8191EF4***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateSchemeTaskConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemeTaskConfigResponseBody self = new CreateSchemeTaskConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSchemeTaskConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSchemeTaskConfigResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public CreateSchemeTaskConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateSchemeTaskConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSchemeTaskConfigResponseBody setMessages(CreateSchemeTaskConfigResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public CreateSchemeTaskConfigResponseBodyMessages getMessages() {
        return this.messages;
    }

    public CreateSchemeTaskConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSchemeTaskConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSchemeTaskConfigResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static CreateSchemeTaskConfigResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            CreateSchemeTaskConfigResponseBodyMessages self = new CreateSchemeTaskConfigResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public CreateSchemeTaskConfigResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
