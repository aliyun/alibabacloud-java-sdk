// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListSavepointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSavepointsResponseBody body;

    public static ListSavepointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSavepointsResponse self = new ListSavepointsResponse();
        return TeaModel.build(map, self);
    }

    public ListSavepointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSavepointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSavepointsResponse setBody(ListSavepointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSavepointsResponseBody getBody() {
        return this.body;
    }

}
