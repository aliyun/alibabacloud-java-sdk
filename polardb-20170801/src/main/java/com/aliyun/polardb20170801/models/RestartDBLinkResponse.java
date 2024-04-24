// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartDBLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartDBLinkResponseBody body;

    public static RestartDBLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDBLinkResponse self = new RestartDBLinkResponse();
        return TeaModel.build(map, self);
    }

    public RestartDBLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDBLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartDBLinkResponse setBody(RestartDBLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDBLinkResponseBody getBody() {
        return this.body;
    }

}
