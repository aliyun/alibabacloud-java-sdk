// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RebootProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootProxyResponseBody body;

    public static RebootProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootProxyResponse self = new RebootProxyResponse();
        return TeaModel.build(map, self);
    }

    public RebootProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootProxyResponse setBody(RebootProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootProxyResponseBody getBody() {
        return this.body;
    }

}
