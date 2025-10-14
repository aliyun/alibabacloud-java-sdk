// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyColumnarClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyColumnarClassResponseBody body;

    public static ModifyColumnarClassResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyColumnarClassResponse self = new ModifyColumnarClassResponse();
        return TeaModel.build(map, self);
    }

    public ModifyColumnarClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyColumnarClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyColumnarClassResponse setBody(ModifyColumnarClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyColumnarClassResponseBody getBody() {
        return this.body;
    }

}
