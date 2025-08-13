// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class PocSendDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PocSendDataResponseBody body;

    public static PocSendDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PocSendDataResponse self = new PocSendDataResponse();
        return TeaModel.build(map, self);
    }

    public PocSendDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PocSendDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PocSendDataResponse setBody(PocSendDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PocSendDataResponseBody getBody() {
        return this.body;
    }

}
