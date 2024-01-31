// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckResultResponseBody body;

    public static ListCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckResultResponse self = new ListCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckResultResponse setBody(ListCheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckResultResponseBody getBody() {
        return this.body;
    }

}
