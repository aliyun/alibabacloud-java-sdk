// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListRLSamplesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRLSamplesResponseBody body;

    public static ListRLSamplesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRLSamplesResponse self = new ListRLSamplesResponse();
        return TeaModel.build(map, self);
    }

    public ListRLSamplesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRLSamplesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRLSamplesResponse setBody(ListRLSamplesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRLSamplesResponseBody getBody() {
        return this.body;
    }

}
