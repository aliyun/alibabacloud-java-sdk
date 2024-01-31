// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckInstanceResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckInstanceResultResponseBody body;

    public static ListCheckInstanceResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckInstanceResultResponse self = new ListCheckInstanceResultResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckInstanceResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckInstanceResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckInstanceResultResponse setBody(ListCheckInstanceResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckInstanceResultResponseBody getBody() {
        return this.body;
    }

}
