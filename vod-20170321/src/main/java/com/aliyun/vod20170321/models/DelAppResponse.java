// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DelAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DelAppResponseBody body;

    public static DelAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DelAppResponse self = new DelAppResponse();
        return TeaModel.build(map, self);
    }

    public DelAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelAppResponse setBody(DelAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DelAppResponseBody getBody() {
        return this.body;
    }

}
