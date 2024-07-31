// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyImageShareStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyImageShareStatusResponseBody body;

    public static ModifyImageShareStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageShareStatusResponse self = new ModifyImageShareStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageShareStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImageShareStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyImageShareStatusResponse setBody(ModifyImageShareStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImageShareStatusResponseBody getBody() {
        return this.body;
    }

}
