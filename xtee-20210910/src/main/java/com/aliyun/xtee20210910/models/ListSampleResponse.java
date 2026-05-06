// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ListSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSampleResponseBody body;

    public static ListSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSampleResponse self = new ListSampleResponse();
        return TeaModel.build(map, self);
    }

    public ListSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSampleResponse setBody(ListSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSampleResponseBody getBody() {
        return this.body;
    }

}
