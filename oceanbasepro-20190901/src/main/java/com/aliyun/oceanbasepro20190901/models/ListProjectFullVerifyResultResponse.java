// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListProjectFullVerifyResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProjectFullVerifyResultResponseBody body;

    public static ListProjectFullVerifyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFullVerifyResultResponse self = new ListProjectFullVerifyResultResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectFullVerifyResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectFullVerifyResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectFullVerifyResultResponse setBody(ListProjectFullVerifyResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectFullVerifyResultResponseBody getBody() {
        return this.body;
    }

}
