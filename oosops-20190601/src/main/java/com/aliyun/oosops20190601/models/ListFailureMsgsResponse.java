// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListFailureMsgsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFailureMsgsResponseBody body;

    public static ListFailureMsgsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFailureMsgsResponse self = new ListFailureMsgsResponse();
        return TeaModel.build(map, self);
    }

    public ListFailureMsgsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFailureMsgsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFailureMsgsResponse setBody(ListFailureMsgsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFailureMsgsResponseBody getBody() {
        return this.body;
    }

}
