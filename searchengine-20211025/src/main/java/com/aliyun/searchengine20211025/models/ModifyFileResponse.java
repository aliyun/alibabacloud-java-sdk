// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFileResponseBody body;

    public static ModifyFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileResponse self = new ModifyFileResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFileResponse setBody(ModifyFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFileResponseBody getBody() {
        return this.body;
    }

}
