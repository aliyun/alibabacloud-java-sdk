// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class StartNotaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartNotaryResponseBody body;

    public static StartNotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        StartNotaryResponse self = new StartNotaryResponse();
        return TeaModel.build(map, self);
    }

    public StartNotaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartNotaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartNotaryResponse setBody(StartNotaryResponseBody body) {
        this.body = body;
        return this;
    }
    public StartNotaryResponseBody getBody() {
        return this.body;
    }

}
