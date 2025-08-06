// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class HttpRequestVodTestToolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HttpRequestVodTestToolResponseBody body;

    public static HttpRequestVodTestToolResponse build(java.util.Map<String, ?> map) throws Exception {
        HttpRequestVodTestToolResponse self = new HttpRequestVodTestToolResponse();
        return TeaModel.build(map, self);
    }

    public HttpRequestVodTestToolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HttpRequestVodTestToolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HttpRequestVodTestToolResponse setBody(HttpRequestVodTestToolResponseBody body) {
        this.body = body;
        return this;
    }
    public HttpRequestVodTestToolResponseBody getBody() {
        return this.body;
    }

}
