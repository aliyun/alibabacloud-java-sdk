// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppInfoResponseBody body;

    public static ListAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfoResponse self = new ListAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppInfoResponse setBody(ListAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppInfoResponseBody getBody() {
        return this.body;
    }

}
