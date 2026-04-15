// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteLlmAccessProfileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>9DB8BA95-4513-54B9-9C67-A28909CFB4AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLlmAccessProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLlmAccessProfileResponseBody self = new DeleteLlmAccessProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLlmAccessProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteLlmAccessProfileResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteLlmAccessProfileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteLlmAccessProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteLlmAccessProfileResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public DeleteLlmAccessProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
