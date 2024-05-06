// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ForceSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ForceSwitchResponseBody body;

    public static ForceSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ForceSwitchResponse self = new ForceSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ForceSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForceSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ForceSwitchResponse setBody(ForceSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ForceSwitchResponseBody getBody() {
        return this.body;
    }

}
