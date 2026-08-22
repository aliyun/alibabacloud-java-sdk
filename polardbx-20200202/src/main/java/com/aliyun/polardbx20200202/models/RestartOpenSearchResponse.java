// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class RestartOpenSearchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartOpenSearchResponseBody body;

    public static RestartOpenSearchResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartOpenSearchResponse self = new RestartOpenSearchResponse();
        return TeaModel.build(map, self);
    }

    public RestartOpenSearchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartOpenSearchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartOpenSearchResponse setBody(RestartOpenSearchResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartOpenSearchResponseBody getBody() {
        return this.body;
    }

}
