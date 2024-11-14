// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteCheckTypeToSchemeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>48864</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public java.util.List<String> messages;

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

    public static DeleteCheckTypeToSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCheckTypeToSchemeResponseBody self = new DeleteCheckTypeToSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCheckTypeToSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteCheckTypeToSchemeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteCheckTypeToSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCheckTypeToSchemeResponseBody setMessages(java.util.List<String> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<String> getMessages() {
        return this.messages;
    }

    public DeleteCheckTypeToSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCheckTypeToSchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
