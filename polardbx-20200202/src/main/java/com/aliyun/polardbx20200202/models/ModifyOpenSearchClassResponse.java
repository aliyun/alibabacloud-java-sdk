// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyOpenSearchClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOpenSearchClassResponseBody body;

    public static ModifyOpenSearchClassResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOpenSearchClassResponse self = new ModifyOpenSearchClassResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOpenSearchClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOpenSearchClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOpenSearchClassResponse setBody(ModifyOpenSearchClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOpenSearchClassResponseBody getBody() {
        return this.body;
    }

}
