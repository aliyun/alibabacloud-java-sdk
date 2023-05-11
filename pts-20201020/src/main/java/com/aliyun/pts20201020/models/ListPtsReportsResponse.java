// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListPtsReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPtsReportsResponseBody body;

    public static ListPtsReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPtsReportsResponse self = new ListPtsReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListPtsReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPtsReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPtsReportsResponse setBody(ListPtsReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPtsReportsResponseBody getBody() {
        return this.body;
    }

}
