// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ClearSagCipherResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ClearSagCipherResponseBody body;

    public static ClearSagCipherResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearSagCipherResponse self = new ClearSagCipherResponse();
        return TeaModel.build(map, self);
    }

    public ClearSagCipherResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearSagCipherResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClearSagCipherResponse setBody(ClearSagCipherResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearSagCipherResponseBody getBody() {
        return this.body;
    }

}
