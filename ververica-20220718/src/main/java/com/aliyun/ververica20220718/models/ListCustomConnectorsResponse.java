// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListCustomConnectorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomConnectorsResponseBody body;

    public static ListCustomConnectorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomConnectorsResponse self = new ListCustomConnectorsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomConnectorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomConnectorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomConnectorsResponse setBody(ListCustomConnectorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomConnectorsResponseBody getBody() {
        return this.body;
    }

}
