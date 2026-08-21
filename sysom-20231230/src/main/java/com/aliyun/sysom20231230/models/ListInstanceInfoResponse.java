// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstanceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceInfoResponseBody body;

    public static ListInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceInfoResponse self = new ListInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceInfoResponse setBody(ListInstanceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceInfoResponseBody getBody() {
        return this.body;
    }

}
