// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListSourceFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSourceFileResponseBody body;

    public static ListSourceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSourceFileResponse self = new ListSourceFileResponse();
        return TeaModel.build(map, self);
    }

    public ListSourceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSourceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSourceFileResponse setBody(ListSourceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSourceFileResponseBody getBody() {
        return this.body;
    }

}
