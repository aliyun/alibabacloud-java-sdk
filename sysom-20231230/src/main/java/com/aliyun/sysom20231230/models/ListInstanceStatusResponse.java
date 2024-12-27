// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceStatusResponseBody body;

    public static ListInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStatusResponse self = new ListInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceStatusResponse setBody(ListInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
