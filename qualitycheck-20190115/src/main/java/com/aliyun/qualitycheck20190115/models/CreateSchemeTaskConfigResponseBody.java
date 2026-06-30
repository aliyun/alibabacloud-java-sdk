// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateSchemeTaskConfigResponseBody extends TeaModel {
    /**
     * <p>Result code. <strong>200</strong> indicates success. Any other value indicates failure. The caller can use this field to determine the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>ID of the newly created quality inspection job.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>When an error occurs, this field provides error details. When the operation succeeds, the value is &quot;successful&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public CreateSchemeTaskConfigResponseBodyMessages messages;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3CEA0495-341B-4482-9AD9-8191EF4***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. The caller can use this field to determine the request outcome: true indicates success; false or null indicates failure.</p>
     * 
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
