// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteQualityCheckSchemeResponseBody extends TeaModel {
    /**
     * <p>Result code. A value of 200 means success. Any other value means failure. Use this field to identify the cause of failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error details if the request failed. Returns &quot;successful&quot; if the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public DeleteQualityCheckSchemeResponseBodyMessages messages;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. If true, the request succeeded. If <strong>false</strong> or <strong>null</strong>, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteQualityCheckSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityCheckSchemeResponseBody self = new DeleteQualityCheckSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQualityCheckSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteQualityCheckSchemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteQualityCheckSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteQualityCheckSchemeResponseBody setMessages(DeleteQualityCheckSchemeResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public DeleteQualityCheckSchemeResponseBodyMessages getMessages() {
        return this.messages;
    }

    public DeleteQualityCheckSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteQualityCheckSchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteQualityCheckSchemeResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static DeleteQualityCheckSchemeResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            DeleteQualityCheckSchemeResponseBodyMessages self = new DeleteQualityCheckSchemeResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public DeleteQualityCheckSchemeResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
