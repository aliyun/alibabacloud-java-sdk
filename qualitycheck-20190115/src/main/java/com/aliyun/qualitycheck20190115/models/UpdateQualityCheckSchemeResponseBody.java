// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateQualityCheckSchemeResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Other values indicate failure. Use this field to determine the cause of a failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error details if the request fails. If the request is successful, the value is \<code>successful\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public UpdateQualityCheckSchemeResponseBodyMessages messages;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>96138D8D-8D26-4E41-BFF4-77AED1088BBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of \<code>true\\</code> indicates success. A value of \<code>false\\</code> or \<code>null\\</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateQualityCheckSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityCheckSchemeResponseBody self = new UpdateQualityCheckSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateQualityCheckSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateQualityCheckSchemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateQualityCheckSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateQualityCheckSchemeResponseBody setMessages(UpdateQualityCheckSchemeResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public UpdateQualityCheckSchemeResponseBodyMessages getMessages() {
        return this.messages;
    }

    public UpdateQualityCheckSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateQualityCheckSchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateQualityCheckSchemeResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static UpdateQualityCheckSchemeResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            UpdateQualityCheckSchemeResponseBodyMessages self = new UpdateQualityCheckSchemeResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public UpdateQualityCheckSchemeResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
