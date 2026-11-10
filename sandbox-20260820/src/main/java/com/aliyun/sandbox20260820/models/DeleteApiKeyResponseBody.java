// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class DeleteApiKeyResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response message. The value is success if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7ADFF8D8-D4BA-5F79-AD49-DDABFEA59B6C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiKeyResponseBody self = new DeleteApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiKeyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteApiKeyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
