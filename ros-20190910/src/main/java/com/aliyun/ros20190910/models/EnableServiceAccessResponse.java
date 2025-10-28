// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class EnableServiceAccessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableServiceAccessResponseBody body;

    public static EnableServiceAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableServiceAccessResponse self = new EnableServiceAccessResponse();
        return TeaModel.build(map, self);
    }

    public EnableServiceAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableServiceAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableServiceAccessResponse setBody(EnableServiceAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableServiceAccessResponseBody getBody() {
        return this.body;
    }

}
