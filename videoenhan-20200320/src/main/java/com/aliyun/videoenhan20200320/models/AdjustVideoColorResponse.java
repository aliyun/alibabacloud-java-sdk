// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AdjustVideoColorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AdjustVideoColorResponseBody body;

    public static AdjustVideoColorResponse build(java.util.Map<String, ?> map) throws Exception {
        AdjustVideoColorResponse self = new AdjustVideoColorResponse();
        return TeaModel.build(map, self);
    }

    public AdjustVideoColorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AdjustVideoColorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AdjustVideoColorResponse setBody(AdjustVideoColorResponseBody body) {
        this.body = body;
        return this;
    }
    public AdjustVideoColorResponseBody getBody() {
        return this.body;
    }

}
