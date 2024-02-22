// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class StartInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartInstanceResponseBody body;

    public static StartInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceResponse self = new StartInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StartInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartInstanceResponse setBody(StartInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartInstanceResponseBody getBody() {
        return this.body;
    }

}
