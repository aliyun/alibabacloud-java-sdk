// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListPrecisionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrecisionTaskResponseBody body;

    public static ListPrecisionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrecisionTaskResponse self = new ListPrecisionTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListPrecisionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrecisionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrecisionTaskResponse setBody(ListPrecisionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrecisionTaskResponseBody getBody() {
        return this.body;
    }

}
